public class PolymorphismToy {
	
	static void test() {
		RectangleToy theRectangle = new RectangleToy(100, 200);
		SquareToy theSquare = new SquareToy(100);
		CircleToy theCircle = new CircleToy(200);
		
		printGeometry(theRectangle);
		printGeometry(theSquare);
		printGeometry(theCircle);
	}
	
	public static void main(String args[]) {
		test();
	}
	
	static void printGeometry (GeometryToy theG) {
		System.out.println("-------------------------");
		System.out.println("Geometri          : " + theG.getGeometry());
		System.out.println("Luas Geometri     : " + theG.area());
		System.out.println("Keliling Geometri : " + theG.circumference());
		System.out.println("-------------------------");
	}
}

abstract class GeometryToy {
	abstract public String getGeometry();
	abstract public double area();
	abstract public double circumference();
}

class RectangleToy extends GeometryToy {
	double width, height;
	
	public RectangleToy(double newWidth, double newHeight) {
		width = newWidth;
		height = newHeight;
	}
	
	public String getGeometry() {
		return "Persegi Panjang..";
	}
	
	public double area() {
		return width * height;
	}
	
	public double circumference() {
		return 2 * (width + height) ;
	}
}

class SquareToy extends GeometryToy {
	double side;
	
	public SquareToy(double newSide) {
		side = newSide;
	}
	
	public String getGeometry() {
		return "Bujur sangkar..";
	}
	
	public double area() {
		return side * side;
	}
	
	public double circumference() {
		return 4 * side;
	}
}

class CircleToy extends GeometryToy {
	final double PI = 3.14159;
	double radius;
	
	public CircleToy(double newRadius) {
		radius = newRadius;
	}
	
	public String getGeometry() {
		return "Lingkaran";
	}
	
	public double area() {
		return PI * radius * radius;
	}
	
	public double circumference() {
		return 2.0 * PI * radius;
	}
}

		
		
		
