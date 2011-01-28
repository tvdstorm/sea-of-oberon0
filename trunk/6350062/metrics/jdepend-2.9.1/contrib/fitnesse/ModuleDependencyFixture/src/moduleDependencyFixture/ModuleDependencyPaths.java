package moduleDependencyFixture;

import fit.*;

import java.util.ArrayList;

public class ModuleDependencyPaths extends Fixture {
  public static ArrayList paths = new ArrayList();
  public void doRow(Parse row) {
    paths.add(row.parts.text()) ;
  }
}
