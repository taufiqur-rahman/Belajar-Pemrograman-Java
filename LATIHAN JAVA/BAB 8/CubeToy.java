public class CubeToy {
	private double side = 0;
	
	public CubeToy() {
	}
	
	public CubeToy(double side) {
		this.side = side;
	}
	
	public void setSide(double side) {
		this.side = side;
	}
	
		public double getSide(double side) {
		return this.side;
	}
	
	public double getCircumference() {
		return calcCircumference();
	}	
	
	public double getArea() {
		return calcArea();
	}
	
	public double getVolume() {
		return calcVolume();
	}
	
	public double calcCircumference() {
		return(12 * this.side);
	}
	
	public double calcArea() {
		return (6 * this.side * this.side);
	}
	
	public double calcVolume() {
		return (side * side * side);
	}
	
	static void test() {
		CubeToy c = new CubeToy(10);
		System.out.println(c);
	}
	
	public static void main (String args[]) {
		test();
	}
	
	public String toString() {
		String str = "Kubus " + "\n" + "Panjang Sisi = " + side + "\n" + "Keliling = " + calcCircumference() + "\n" + "Luas = " + calcArea() + "\n" + "Volume = " + calcVolume() + "\n";
		return str;
	}
}	
	
	
