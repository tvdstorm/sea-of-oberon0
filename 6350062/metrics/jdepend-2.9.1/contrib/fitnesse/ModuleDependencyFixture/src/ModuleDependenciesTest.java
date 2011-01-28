
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
    ModuleDependencyPaths.paths.add("C:\\cygwin\\home\\Bob\\ModuleDependencyFixture\\Cycle\\classes");
    String head = "<tr><td></td>" + "<td>a</td>" + "<td>b</td>" + "</tr>";
    String moduleRow1 = "<tr>" + "<td>a</td>" + "<td></td><td></td></tr>";
    String moduleRow2 = "<tr>" + "<td>b</td>" + "<td></td><td></td></tr>";
    table = new Parse("<table>" + FIXTURE_ROW + head + moduleRow1 + moduleRow2 + "</table>");
  }

  public void testCycle() throws Exception {
    makeTableWithCycle();
    Parse tableAfterFixture = table.parts.more;
    md.doRows(tableAfterFixture);
    Parse redRow = tableAfterFixture.at(0, 0);
    assertContains(redRow.tag, "fail");
    assertContains(redRow.text(), "cycles");
    Parse atob = tableAfterFixture.at(1, 2);
    assertContains(atob.text(), "cycle");
    assertContains(atob.tag, "fail");
    Parse btoa = tableAfterFixture.at(2, 1);
    assertContains(btoa.text(), "cycle");
    assertContains(btoa.tag, "fail");
  }

  public void testFitNesse() throws Exception {
    JDepend jd = new JDepend();
    jd.addDirectory("C:\\cygwin\\home\\Bob\\Fitnesse\\classes");
    jd.addDirectory("C:\\cygwin\\home\\Bob\\Fitnesse\\classes\\fitnesse");
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
