public class ComplexDefaultToStringToy {
	private double re, im;
	
	public ComplexDefaultToStringToy() {
		re = 0.0;
		im = 0.0;
	}
	
	public ComplexDefaultToStringToy(double re, double im) {
		this.re = re;
		this.im = im;
	}
	
	static void test() {
		ComplexDefaultToStringToy t = new ComplexDefaultToStringToy(5.0, -5.0) ;
		System.out.println(t);
	}
	
	public static void main(String args[]) {
		test();
	}
}

