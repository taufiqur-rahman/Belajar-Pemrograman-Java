package bigToy;
import java.awt.event.*;
import java.text.*;
import javax.swing.*;

public class InnerClassBToy {
	//
	public InnerClassBToy() {
	}
	
	public static void main (String[] args) {
		BankAccountClass acc = new BankAccountClass(10000);
		acc.start(10);
		
		JOptionPane.showMessageDialog(null, "Keluar dari program ?");
		System.exit(0);
	}
}

class BankAccountClass {
	private double balance;
	
	private class InterestAdder implements ActionListener {
		private double rate;
		
		public InterestAdder(double theRate) {
			rate = theRate;
		}
		
		public void actionPerformed(ActionEvent evt) {
			double interest = balance * rate / 100;
			
			balance += interest;
			
			NumberFormat formatter = NumberFormat.getCurrencyInstance();
			System.out.println("balance = " + formatter.format(balance));
		}
	}
	
	public BankAccountClass(double newBalance) {
		balance = newBalance;
	}
	
	public void start(double rate) {
		ActionListener adder = new InterestAdder(rate);
		Timer t = new Timer(1000, adder);
		t.start();
	}
}
			
