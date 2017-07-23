public class TaxServiceToy {
	private double amount = 0.0;
	private double VATRate = 0.0;
	private double finalAmount = 0.0;
	private double vat = 0.0;
	
	// buat instance
	
	public TaxServiceToy(double amount, double VATRate) {
		this.amount = amount;
		this.VATRate = VATRate;
		
		calc();
	}
	
	private void calc() {
		vat = VATRate * amount;
		finalAmount = amount + vat;
	}
	
	public double getVATRate() {
		return VATRate;
	}
	
	public double getAmount() {
		return amount;
	}
	
	public double getVAT() {
		return vat;
	}
	
	public double getFinalAmount() {
		return finalAmount;
	}
	
	public String toString() {
		String str = "Jumlah      = " + amount + "\n" +
		             "Rate PPN    = " + VATRate + "\n" +
		             "PPN         = " + vat + "\n" +
		             "Total Bayar = " + finalAmount;
		return str;
	}
	
	static void test() {
		TaxServiceToy t = new TaxServiceToy(1000, .10); 
		System.out.println(t);
	}
	
	public static void main(String args[]) {
		test();
	}
	
}
