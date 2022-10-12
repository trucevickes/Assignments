package assignments;

import javax.swing.*;

public class SwingGui {
	public static void main (String[] args) {
		String name = JOptionPane.showInputDialog("What is your name?");
		String input = JOptionPane.showInputDialog("How old are you " + name + " ?");
		int age = Integer.parseInt(input);
		
		System.out.print("Hello, " + name + ".");
		System.out.print(" In ten years, you will be " + (age + 10));
		System.out.print(". In fifty years, you will be " + (age + 50));
		
		System.exit(0);
	}

}
