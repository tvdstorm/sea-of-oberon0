package moduleDependencyFixture;

import fit.Parse;
import fit.exception.FitParseException;
import jdepend.framework.*;
import junit.framework.TestCase;
import moduleDependencyFixture.*;

import java.util.*;

public class ModuleDependenciesTest extends TestCase {
  private ModuleDependencies md;
  private final String FIXTURE_ROW = "<tr><td>fixturename</td></tr>";
  private final String SINGLE_MODULE_COLUMN_HEAD = "<tr><td></td><td>noSuchModule</td></tr>";
  private Parse table;
  private final String moduleA = "<td>moduleDependencyFixture.test.a</td>";
  private final String moduleB = "<td>moduleDependencyFixture.test.b</td>";


  protected void tearDown() throws Exception {
    ModuleDependencyPaths.paths.clear();
  }

  protected void setUp() throws Exception {
    md = new ModuleDependencies();
    ModuleDependencyPaths.paths.add("C:\\cygwin\\home\\Bob\\ModuleDependencyFixture\\classes");
  }

  public void testAddComponent() throws Exception {
    assertEquals("", md.getComponents());
    md.addComponent("bob");
    assertEquals("bob", md.getComponents());
    md.addComponent("bill");
    assertEquals("bob,bill", md.getComponents());
    md.addComponent("john");
    assertEquals("bob,bill,john", md.getComponents());
  }

  private void assertTableFailsWith(String messagePart) {
    try {
      md.doRows(table.parts.more);
      fail("did not throw: \"" + messagePart + "\"");
    } catch (Exception e) {
      assertContains(e.getMessage(), messagePart);
    }
  }

  private void assertContains(final String message, final String str) {
    assertTrue("\"" + str + "\"" + " was not found in \"" + message + "\"", message.indexOf(str) >= 0);
  }

  public void testEmptyFixture() throws Exception {
    table = new Parse("<table>" + FIXTURE_ROW + "</table>");
    assertTableFailsWith("no rows");
  }

  public void testTableWithNoModuleRows() throws Exception {
    table = new Parse("<table>" + FIXTURE_ROW + SINGLE_MODULE_COLUMN_HEAD + "</table>");
    assertTableFailsWith("no module rows");
  }

  public void testUnbalancedtable() throws Exception {
    table =
    new Parse("<table>" + FIXTURE_ROW + SINGLE_MODULE_COLUMN_HEAD + "<tr><td>notSame</td><td></td></tr></table>");
    assertTableFailsWith("unbalanced");
  }

  public void testTableWithBlankFirstCell() throws Exception {
    table = new Parse("<table>" + FIXTURE_ROW + "<tr><td>x</td></tr></table>");
    assertTableFailsWith("blank");
  }

  public void testOneNonExistentModule() throws Exception {
    table = new Parse("<table>" + FIXTURE_ROW + SINGLE_MODULE_COLUMN_HEAD + "<tr><td>noSuchModule</td></tr></table>");
    md.doRows(table.parts.more);
    String moduleHeader = table.parts.more.parts.more.text();
    assertContains(moduleHeader, "no such module");
  }

  public void testOneExistentModule() throws Exception {
    String head = "<tr><td></td>" + moduleA + "</tr>";
    String moduleRow = "<tr>" + moduleA + "</tr>";
    table = new Parse("<table>" + FIXTURE_ROW + head + moduleRow + "</table>");
    md.doRows(table.parts.more);
    String moduleHeader = table.parts.more.parts.more.tag;
    assertContains(moduleHeader, "pass");
  }

  public void testIllicitDependencyFound() throws Exception {
    makeTableWithNoAllowedDependencies();
    Parse tableAfterFixture = table.parts.more;
    md.doRows(tableAfterFixture);
    Parse redCell = tableAfterFixture.at(1, 2);
    assertContains(redCell.tag, "fail");
  }

  public void testPrefix() throws Exception {
    Parse table = new Parse("<table><tr><td>fixture</td></tr>"+
                            "<tr><td></td><td>.a</td><td>b</td></tr>"+
                            "<tr><td>.a</td><td></td><td></td></tr>"+
                            "<tr><td>b</td><td></td><td></td></tr></table>");
    Parse tableAfterFixture = table.parts.more;
    md.doRows(tableAfterFixture);
    md.prefix = "x";
    assertEquals("x.a", md.getModuleName(1,0));
    assertEquals("b", md.getModuleName(2,0));
  }

  private void makeTableWithNoAllowedDependencies() throws FitParseException {
    String head = "<tr><td></td>" + moduleA + moduleB + "</tr>";
    String moduleRow1 = "<tr>" + moduleA + "<td></td><td></td></tr>";
    String moduleRow2 = "<tr>" + moduleB + "<td></td><td></td></tr>";
    table = new Parse("<table>" + FIXTURE_ROW + head + moduleRow1 + moduleRow2 + "</table>");
  }

  public void testExpectedDependencyFound() throws Exception {
    String head = "<tr><td></td>" + moduleA + moduleB + "</tr>";
    String moduleRow1 = "<tr>" + moduleA + "<td></td><td>!</td></tr>";
    String moduleRow2 = "<tr>" + moduleB + "<td></td><td></td></tr>";
    table = new Parse("<table>" + FIXTURE_ROW + head + moduleRow1 + moduleRow2 + "</table>");
    Parse tableAfterFixture = table.parts.more;
    md.doRows(tableAfterFixture);
    Parse greenCell = tableAfterFixture.at(1, 2);
    assertContains(greenCell.tag, "pass");
  }

  public void testDiagonal() throws Exception {
    makeTableWithNoAllowedDependencies();
    Parse tableAfterFixture = table.parts.more;
    md.doRows(tableAfterFixture);
    Parse diagonal1 = tableAfterFixture.at(1, 1);
    Parse diagonal2 = tableAfterFixture.at(2, 2);
    assertContains(diagonal1.tag, "ignore");
    assertContains(diagonal2.tag, "ignore");
  }

  public void testModuleLookup() throws Exception {
    makeTableWithNoAllowedDependencies();
    Parse tableAfterFixture = table.parts.more;
    md.doRows(tableAfterFixture);
    assertEquals(0, md.getModuleNumber("moduleDependencyFixture.test.a"));
    assertEquals(1, md.getModuleNumber("moduleDependencyFixture.test.b"));
    try {
      md.getModuleNumber("noSuchModule");
      fail("found 'noSuchModule'");
    } catch (Throwable e) {
    }
  }

  private void makeTableWithCycle() throws FitParseException {
    // c--->a<---->b--->d
    ModuleDependencyPaths.paths.add("C:\\cygwin\\home\\Bob\\ModuleDependencyFixture\\Cycle\\classes");
    String head = "<tr><td></td>" + "<td>a</td>" + "<td>b</td>" + "<td>c</td>"+"<td>d</td>"+"</tr>";
    String moduleRow1 = "<tr>" + "<td>a</td>" + "<td></td><td></td><td></td><td></td></tr>";
    String moduleRow2 = "<tr>" + "<td>b</td>" + "<td></td><td></td><td></td><td></td></tr>";
    String moduleRow3 = "<tr>" + "<td>c</td>" + "<td></td><td></td><td></td><td></td></tr>";
    String moduleRow4 = "<tr>" + "<td>d</td>" + "<td></td><td></td><td></td><td></td></tr>";
    table = new Parse("<table>" + FIXTURE_ROW + head + moduleRow1 + moduleRow2 + moduleRow3 + moduleRow4 + "</table>");
  }

  public void testDependencyMap() throws Exception {
    makeTableWithCycle();
    Parse tableAfterFixture = table.parts.more;
    md.doRows(tableAfterFixture);
    boolean dependencies[][] = md.getDependencyMap();
    assertEquals(4, dependencies.length);
    assertEquals(4, dependencies[0].length);
    assertTrue(dependencies[0][1]);
    assertTrue(dependencies[1][0]);
    assertTrue(dependencies[2][0]);
    assertTrue(dependencies[1][3]);
    assertEquals(4, countTrueCells(dependencies));
  }

  private int countTrueCells(boolean[][] dependencies) {
    int trueCells = 0;
    for (int from=0; from<dependencies.length; from++)
      for (int to=0; to<dependencies.length; to++)
        if (dependencies[from][to])
          trueCells++;
    return trueCells;
  }

  public void testRemoveCycles() throws Exception {
    boolean[][] noCycle = {{false, true},{false, false}};
    boolean[][] noDependencies = new boolean[2][2];

    removeNonCyclicDependencies(noCycle);
    assertDependenciesEquals(noDependencies, noCycle);

    boolean[][] cycle = {{false, true},{true, false}};
    boolean[][] cycle2 = {{false, true},{true, false}};
    removeNonCyclicDependencies(cycle);
    assertDependenciesEquals(cycle2, cycle);
  }

  private void removeNonCyclicDependencies(boolean[][] d) {
    md.dependencies = d;
    md.removeNonCyclicDependencies();
  }

  public void testFindInstablePackage() throws Exception {
    boolean[][] noInstable = {{false, false},{false,false}};
    assertEquals(-1, findInstablePackage(noInstable));

    boolean[][] cycle = {{false, true},{true, false}};
    assertEquals(-1, findInstablePackage(cycle));

    boolean[][] firstColInstable = {{false, true, false},{false, false, false},{false, false, false}};
    assertEquals(0, findInstablePackage(firstColInstable));

    boolean[][] secondColInstable = {{false, false, false},{false, false, true}, {false, false, false}};
    assertEquals(1, findInstablePackage(secondColInstable));
  }

  private int findInstablePackage(boolean[][] d) {
    md.dependencies = d;
    return md.findNonCyclicPackage();
  }

  private void assertDependenciesEquals(boolean[][] expected, boolean[][] actual)
  {
    assertTrue("arrays not same size", expected.length == actual.length);
    for (int i=0; i<expected.length; i++)
      for (int j=0; j<actual.length; j++)
        assertTrue("expected["+i+"]["+j+"] does not match", expected[i][j] == actual[i][j]);
  }

  public void testCycle() throws Exception {
    makeTableWithCycle();
    Parse tableAfterFixture = table.parts.more;
    md.doRows(tableAfterFixture);
    Parse redRow = tableAfterFixture.at(0, 0);
    assertContains(redRow.tag, "fail");
    assertContains(redRow.text(), "cycles");
    // assert cycle from a to b.
    Parse atob = tableAfterFixture.at(1, 2);
    assertContains(atob.text(), "cycle");
    assertContains(atob.tag, "fail");

    // assert cycle from b to a
    Parse btoa = tableAfterFixture.at(2, 1);
    assertContains(btoa.text(), "cycle");
    assertContains(btoa.tag, "fail");

    // assert no cycle from c to a
    Parse ctoa = tableAfterFixture.at(3,1);
    assertEquals("", ctoa.text());

    // assert no cycle from b to d
    Parse btod = tableAfterFixture.at(2,4);
    assertEquals("", btod.text());
  }

  public void testFitNesse() throws Exception {
    JDepend jd = new JDepend();
    jd.addDirectory("C:\\cygwin\\home\\Bob\\Fitnesse\\classes");
    jd.setComponents("fitnesse,eg,fit");
    jd.analyze();

    Collection packages = jd.getPackages();
    for (Iterator pi = packages.iterator(); pi.hasNext();) {
      JavaPackage p = (JavaPackage) pi.next();
      System.out.println("p.getName() = " + p.getName());
    }

    assertNotNull(jd.getPackage("fit"));
    assertNotNull(jd.getPackage("fitnesse"));
    assertNotNull(jd.getPackage("eg"));
  }
}
