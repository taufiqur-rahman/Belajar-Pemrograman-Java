package toy;

public class PopulationToy {
	private double c;
	private double k;
	private double x;
	
	public PopulationToy(double c, double k, double x) {
		this.c = c;
		this.k = k;
		this.x = x;
	}
	
	public double getPopulation() {
		return (c * Math.exp(k * x)) ;
	}
	
	public String toString() {
		String str = "Populasi \n" + 
		             "C = " + c + "\n" + 
		             "K = " + k + "\n" + 
		             "X = " + x + "\n" + 
		             "Y = " + getPopulation() + "\n" ; 
		return str;
	}
	
	public static void test() {
		PopulationToy t = new PopulationToy(1000000d, 0.03466, 30);
		System.out.println(t);
	}
	
	public static void main(String args[]) {
		test();
	}
}             
