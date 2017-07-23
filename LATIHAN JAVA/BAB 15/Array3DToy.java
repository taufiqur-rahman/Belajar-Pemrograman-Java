public class Array3DToy {
	private double width = 0;
	private double length = 0;
	private double height = 0;
	
	public Array3DToy() {
	}
	
	public Array3DToy(double length, double width, double height) {
		this.width = width;
		this.length = length;
		this.height = height;
	}
	
	public void setWidth(double width) {
		this.width = width;
	}
	
	public void setLength(double length) {
		this.length = length;
	}
	
	public void setHeight(double height) {
		this.height = height;
	}
	
	public double getWidth() {
		return width;
	}
	
	public double getLength() {
		return length;
	}	
	
	public double getHeight() {
		return height;
	}
	
	public double calcArea() {
		return 2 * ((width * length) + (width * height) + (length * height));
	}
	
	public double calcVolume() {
		return width * length * height;
	}
	
	public String toString() {
		String str = "Balok " + "\n" +
		             "Panjang : " + length + "\n" +
		             "Lebar   : " + width + "\n" +
		             "Tinggi  : " + height + "\n" +
		             "Luas    : " + calcArea() + "\n" +
		             "Volume  : " + calcVolume() + "\n";
		return str;
	}
	
	static void test() {
		Array3DToy b = new Array3DToy(10, 20, 50);
		System.out.println(b);
	}
	
	public static void main (String args[]) {
		test();
	}
}              
		
