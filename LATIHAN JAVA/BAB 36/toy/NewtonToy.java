package toy;

public class NewtonToy {
	public final double K = 6.67e-8;
	
	private double m1;
	private double m2;
	private double d;
	
	public NewtonToy(double m1, double m2, double d) {
		this.m1 = m1;
		this.m2 = m2;
		this.d = d;
	}
	
	public double getM1() {
		return m1;
	}
	
	public double getM2() {
		return m2;
	}
	
	public double getD() {
		return d;
	}
	
	public double getForce() {
		return (K * (m1 * m2) / (d * d));
	}
	
	public String toString() {
		String str = "Hukum Newton = \n" +
		             "Massa 1 = " + getM1() + " gram\n" + 
		             "Massa 2 = " + getM2() + " gram\n" +
		             "Jarak   = " + getD() + " cm\n" +
		             "Gaya    = " + getForce() + " dyne cm2/gram2";
		return str;
	}
	
	static void test() {
		System.out.println(new NewtonToy(5.98e27, 7.347e25, 3.844e10));
	}
	
	public static void main(String args[]) {
		test();
	}
}             
		             
