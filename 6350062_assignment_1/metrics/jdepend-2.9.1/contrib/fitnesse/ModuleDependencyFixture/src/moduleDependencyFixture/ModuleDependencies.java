package moduleDependencyFixture;

import fit.Parse;
import fit.exception.FitFailureException;
import fitnesse.fixtures.TableFixture;
import jdepend.framework.*;

import java.util.*;

public class ModuleDependencies extends TableFixture {
  private StringBuffer components;
  private JDepend jd;
  private int modules;
  private HashMap moduleTable;
  boolean[][] dependencies;
  String prefix;

  public ModuleDependencies() {
    components = new StringBuffer();
    moduleTable = new HashMap();
    prefix = null;
  }

  protected void doStaticTable(int rows) {
    modules = rows - 1;
    getArguments();
    checkFirstCellIsBlank();
    checkForModuleRows();
    jd = new JDepend();
    addPaths(jd);
    processComponents();
    drawDiagonal();
    jd.analyze();
    checkForCycles();
    if (checkModulesArePresent()) {
      checkAllDependencies();
    }
  }

  private void getArguments() {
    String args[] = getArgs();
    if (args != null && args.length >= 1)
      prefix = args[0];
  }

  private void drawDiagonal() {
    for (int module = 0; module < modules; module++) {
      int modulePosition = module + 1;
      Parse diagonalCell = getCell(modulePosition, modulePosition);
      ignore(diagonalCell);
    }
  }

  private void checkAllDependencies() {
    for (int from = 0; from < modules; from++) {
      for (int to = 0; to < modules; to++) {
        checkOneDependency(from, to);
      }
    }
  }

  private void checkOneDependency(int from, int to) {
    int fromRow = from + 1;
    int toCol = to + 1;
    boolean dependencyExists = depends(fromRow, toCol);
    Parse dependencyCell = getCell(fromRow, toCol);
    if (dependencyCell.text().equals("") && dependencyExists)
      wrong(dependencyCell);
    else if (dependencyExists && isNotBlank(dependencyCell))
      right(dependencyCell);
  }

  private boolean isNotBlank(Parse dependencyCell) {
    return !dependencyCell.text().equals("");
  }

  boolean depends(int fromRow, int toCol) {
    JavaPackage fromPackage = jd.getPackage(getModuleName(0, fromRow));
    JavaPackage toPackage = jd.getPackage(getModuleName(toCol, 0));
    boolean depends = false;
    if (fromPackage != null) {
      Collection efferents = fromPackage.getEfferents();
      depends = efferents.contains(toPackage);
    }
    return depends;
  }

  private boolean checkModulesArePresent() {
    boolean allPresent = true;
    for (int module = 0; module < modules; module++) {
      int modulePosition = module + 1;
      String rowName = getModuleName(0, modulePosition);
      JavaPackage p = jd.getPackage(rowName);
      if (p == null) {
        getCell(0, modulePosition).addToBody("<hr>" + label("no such module"));
        wrong(getCell(0, modulePosition));
        allPresent = false;
      } else {
        right(getCell(0, modulePosition));
        right(getCell(modulePosition, 0));
      }
    }
    return allPresent;
  }

  String getModuleName(int row, int column) {
    String cellContents = getText(row, column);
    if (cellContents.startsWith(".") && prefix != null)
      return prefix + cellContents;
    else
      return cellContents;
  }

  private void checkForModuleRows() {
    if (modules < 1)
      throw new FitFailureException("no module rows");
  }

  private void processComponents() {
    for (int module = 0; module < modules; module++) {
      int modulePosition = module + 1;
      String rowName = getModuleName(0, modulePosition);
      String colName = getModuleName(modulePosition, 0);
      if (!rowName.equals(colName))
        throw new FitFailureException("Table is unbalanced. Rows and Columns must be in the same order.");
      addComponent(rowName);
      moduleTable.put(rowName, new Integer(module));
    }
    jd.setComponents(getComponents());
  }

  private void checkFirstCellIsBlank() {
    String firstCell = getText(0, 0);
    if (!firstCell.equals(""))
      throw new FitFailureException("first cell must be blank");
  }

  private void addPaths(JDepend jd) {
    for (Iterator i = ModuleDependencyPaths.paths.iterator(); i.hasNext();) {
      String path = (String) i.next();
      try {
        jd.addDirectory(path);
      } catch (Exception e) {
        exception(getCell(0, 0), e);
      }
    }
  }

  public String getComponents() {
    return components.toString();
  }

  public void addComponent(String component) {
    if (components.length() > 0)
      components.append(",");
    components.append(component);
  }

  public int getModuleNumber(String name) {
    Integer number = (Integer) moduleTable.get(name);
    if (number == null)
      throw new Error("invalid module name:" + name);
    return number.intValue();
  }

  void checkForCycles() {
    dependencies = getDependencyMap();
    removeNonCyclicDependencies();
    markCyclicDependencies();
  }

  private void markCyclicDependencies() {
    boolean cyclePresent = false;
    for (int from = 0; from < dependencies.length; from++) {
      for (int to = 0; to < dependencies.length; to++) {
        if (dependencies[from][to]) {
          Parse cyclicCell = getCell(from + 1, to + 1);
          wrong(cyclicCell);
          cyclicCell.addToBody("<hr>cycle");
          cyclePresent = true;
        }
      }
    }
    if (cyclePresent) {
      Parse cellZero = getCell(0, 0);
      wrong(cellZero);
      cellZero.addToBody("There are cycles.");
    }
  }

  boolean[][] getDependencyMap() {
    boolean dependencies[][] = new boolean[modules][modules];
    for (int from = 0; from < modules; from++) {
      for (int to = 0; to < modules; to++) {
        dependencies[from][to] = depends(from + 1, to + 1);
      }
    }
    return dependencies;
  }

  public void removeNonCyclicDependencies() {
    for (int instable = findNonCyclicPackage(); instable >= 0; instable = findNonCyclicPackage()) {
      removeModuleDependencies(instable);
    }
  }

  private void removeModuleDependencies(int instable) {
    for (int module = 0; module < dependencies.length; module++) {
      dependencies[module][instable] = false;
      dependencies[instable][module] = false;
    }
  }

  int findNonCyclicPackage() {
    for (int module = 0; module < dependencies.length; module++) {
      if (isIrresponsible(module) && isDependent(module))
        return module;
      if (!isDependent(module) && !isIrresponsible(module))
        return module;
    }
    return -1;
  }

  private boolean isDependent(int module) {
    boolean doesDepend = false;
    for (int target = 0; target < dependencies.length; target++)
      if (dependencies[module][target])
        doesDepend = true;
    return doesDepend;
  }

  private boolean isIrresponsible(int module) {
    for (int source = 0; source < dependencies.length; source++)
      if (dependencies[source][module])
        return false;
    return true;
  }
}
