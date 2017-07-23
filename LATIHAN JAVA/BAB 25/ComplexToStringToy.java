public class ComplexToStringToy {
	private double re, im;
	
	public ComplexToStringToy() {
		re = 0.0;
		im = 0.0;
	}
	
	public ComplexToStringToy(double re, double im) {
		this.re = re;
		this.im = im;
	}
	
	public String toString() {
		double tempIm;
		if(im >= 0) return re + " + " + im + " i ";
		tempIm = -im;
		return re + " - " + tempIm + "i";
	}
	
	static void test() {
		ComplexToStringToy t = new ComplexToStringToy(5.0, -5.0) ;
		System.out.println(t);
	}
	
	public static void main(String args[]) {
		test();
	}
}

