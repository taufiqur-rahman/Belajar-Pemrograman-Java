import javax.swing.*;

public class DoubleInputToy {
	public static void main (String args[]) {
		String input = JOptionPane.showInputDialog("Berapa tinggi menara pisa : ");
		double height = Double.parseDouble(input);
		System.out.println("Tinggi menara pisa = " + height);
		System.exit(0);
		
	}
}
