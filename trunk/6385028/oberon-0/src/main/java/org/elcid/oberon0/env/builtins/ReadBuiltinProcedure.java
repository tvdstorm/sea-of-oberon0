package org.elcid.oberon0.env.builtins;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import javax.swing.JOptionPane;
import org.elcid.oberon0.ast.IntTypeNode;
import org.elcid.oberon0.env.Environment;
import org.elcid.oberon0.env.FormalParameter;
import org.elcid.oberon0.env.Procedure;
import org.elcid.oberon0.env.ReferenceFormalParameter;
import org.elcid.oberon0.values.Int;
import org.elcid.oberon0.values.Value;

/**
 *
 * @author Pieter Brandwijk
 */
public class ReadBuiltinProcedure extends Procedure {

	private static String INPUT_PARAM = "input";

	public ReadBuiltinProcedure() {
		
	}

	@Override
	public List<FormalParameter> getFormalParams() {
		List<FormalParameter> params = new ArrayList<FormalParameter>();
		params.add(new ReferenceFormalParameter(INPUT_PARAM, new IntTypeNode()));
		return params;
	}

	@Override
	public void execute(Environment env) {
		System.out.println("Waiting for input>>");
//		int i = Integer.parseInt(JOptionPane.showInputDialog("input"));
//		Scanner s = new Scanner(System.in);
		Value input = env.getValue(INPUT_PARAM);
//		input.set(new Int(s.nextInt()));
		int random = new Random().nextInt(10);
		System.out.println(random);
		input.set(new Int(random));
	}
}
