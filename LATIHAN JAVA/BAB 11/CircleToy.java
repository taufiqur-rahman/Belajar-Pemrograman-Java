public class CircleToy {
	private double radius ;
	
	public CircleToy() {
	}
	
	public CircleToy(double radius) {
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
	
	public double getCircumference() {
		return calcCircumference();
	}
	
	public double getArea() {
		return calcArea();
	}
	
	public double calcDiameter() {
		return 2 * radius;
	}
	
	private double calcCircumference() {
		return (Math.PI * 2 * radius);
	}
	
	private double calcArea() {
		return (Math.PI * radius * radius);
	}
	
	public String toString() {
		String str = "Lingkaran " + "\n" +
		             "---------" + "\n" +
		             "Radius = " + radius + "\n" +
		             "Diameter = " + calcDiameter() + "\n" +	
		             "Keliling = " + calcCircumference() + "\n" +
		             "Luas = " + calcArea();
		return str;
	}
	
	static void test() {
		CircleToy c = new CircleToy(10);
		System.out.println(c);
	}             
	
	public static void main (String args[]) {
		test();
	}
}	
	
