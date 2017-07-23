public class BallNextToy {
	private double radius;
	
	public BallNextToy() {
	}
	
	public BallNextToy(double radius) {
		this.radius = radius;
	}
	
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public double getRadius() {
		return radius;
	}
	
	public double getDiameter() {
		return calcDiameter();
	}
	
	public double getVolume() {
		return calcVolume();
	}
	
	public double getArea() {
		return calcArea();
	}
	
	private double calcDiameter() {
		return 2 * radius;
	}
	
	private double calcVolume() {
		return (4/3 * Math.PI * radius * radius * radius);
	}
	
	private double calcArea() {
		return 4 * Math.PI * radius * radius;
	}
	
	public String toString() {
		String str = "Bola " + "\n" +
		             "---- " + "\n" +
		             "Radius   = " + radius + "\n" +
		             "Diameter = " + calcDiameter() + "\n" +
		             "Luas     = " + calcArea() + "\n" +
		             "Volume   = " + calcVolume() + "\n";
		return str;
	}
	
	static void test() {
		BallNextToy b = new BallNextToy(10);
		System.out.println(b);
	}
	
	public static void main(String args[]) {
		test();
	}
}             
	
		
