public class ComplexProtectedCloneCopyToy {
	private double re;
	private double im;
	
	public ComplexProtectedCloneCopyToy() {
		re = 0.0;
		im = 0.0;
	}
	
	public ComplexProtectedCloneCopyToy(double re, double im) {
		this.re = 0.0;
		this.im = 0.0;
	}
	
	public void setRe(double re) {
		this.re = re;
	}
	
	public void setIm(double im) {
		this.im = im;
	}
	
	public double getRe() {
		return re;
	}
	
	public double getIm() {
		return im;
	}
	
	
	//
	public ComplexProtectedCloneCopyToy cloneComplex() {
		try {
			return(ComplexProtectedCloneCopyToy) super.clone();
		} catch (CloneNotSupportException e) {
			System.out.println("Clonning tidak diijinkan..!!");
			
			return this;
		}
	}
	
	static void test() {
		ComplexProtectedCloneCopyToy t1 = new ComplexProtectedCloneCopyToy();
		ComplexProtectedCloneCopyToy t2; 
		
		t1.setRe(10.0);
		t2.setIm(50.0);
		
		t2.cloneComplex();
		
		System.out.println("t1 : " + t1.getRe() + " " + t1.getIm());
		System.out.println("t2 : " + t2.getRe() + " " + t1.getIm());
	}
	
	public static void main(String[] args) {
		test();
	}
}
		
