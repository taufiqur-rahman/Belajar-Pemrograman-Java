package bigToy;
import java.awt.event.*;
import java.text.*;
import javax.swing.*;

public class AnonymousToy {
	
	public AnonymousToy() {
	}
	
	public static void main(String args[]) {
		BankAccountClass acc = new BankAccountClass(10000.0);
		acc.start(10);
		
		JOptionPane.showMessageDialog(null, "Keluar dari program ?");
		System.exit(0);
	}
}

class BankAccountClass {
	private double balance;
	
	public BankAccountClass(double newBalance) {
		balance = newBalance;
	}
	
	public void start(final double rate) {
		ActionListener adder = new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				double interest = balance * rate / 100;
				balance += interest;
				
				NumberFormat formatter = NumberFormat.getCurrencyInstance();
				System.out.println("Balance = " + formatter.format(balance));
			}
		};
		
		Timer t = new Timer(1000, adder);
		t.start();
	}
}
