public class CircleDemoNextToy {
	public static final double PHI = 3.14;
	
	static void test() {
		CircleDemoNextToy t = new CircleDemoNextToy();
		
		double radius = 100;
		
		System.out.println("Keliling lingkaran berjari-jari " + radius + " adalah " + t.calcCircumference(radius));
		System.out.println("Luas lingkaran berjari-jari " + radius + " adalah " + t.calcArea(radius));
    }
    
    public static void main(String args[]) {
		test();
	}
	
	static double calcCircumference(double r) {
		return (2 * PHI * r);
	}
	
	static double calcArea(double r) {
		return (PHI * r * r);
	}			
}	
