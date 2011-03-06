package eu.wietsevenema.lang.oberon.metrics;

/**
 * This file has been adapted from j0oberon's CollectMetrics.java
 */

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Locale;

import jdepend.textui.JDepend;

public class ComputeMetrics {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException {
		javaNCSSmetrics();
		jDependMetrics();

	}

	private static void jDependMetrics() throws IOException {
		String path = "bin/";
		jDependConsole(path);
		jDependXML(path, "-deps.xml");
	}

	private static void javaNCSSmetrics() throws IOException {
		javaNCSS("-ncss", "-all", "-recursive", fileList());
		javaNCSS("-ncss", "-all", "-xml", "-recursive", "-out", "-ncss.xml", fileList());
	}

	private static String fileList() {
		return "@" + "files.list";
	}

	private static void javaNCSS(String... args) throws IOException {
		Locale.setDefault(Locale.US);
		new javancss.Javancss(args);
	}

	private static void jDependConsole(String dir) throws IOException {
		JDepend jdepend = new JDepend();
		jdepend.addDirectory(dir);
		jdepend.analyze();
	}

	private static void jDependXML(String dir, String output) throws IOException {
		jdepend.xmlui.JDepend jdepend = new jdepend.xmlui.JDepend();
		PrintWriter writer = new PrintWriter(new File(output));
		jdepend.setWriter(writer);
		jdepend.addDirectory(dir);
		jdepend.analyze();
		writer.close();
	}

}