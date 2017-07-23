public class MathExploreToy {
	
	public MathExploreToy() {
	}

	static void test() {
		testE();
		testPI();
		testAbs();
	}	
	
	static void betterTest() {
		testIntAbs();
	}	
	
	static void testE() {
		System.out.println("Testing untuk Math.E");
		System.out.println("Math.E = " + Math.E);
		System.out.println("");
	}	
	
	static void testPI() {
		System.out.println("Testing untuk Math.PI");
		System.out.println("Math.PI = " + Math.PI);
		System.out.println("");
	}
	
	static void testAbs() {
		System.out.println("Testing untuk Math.Abs()");
		System.out.println("Math.abs(-23.7) = " + Math.abs(-23.7));
		System.out.println("Math.abs(0.0) = " + Math.abs(0.0));
		System.out.println("Math.abs(23.7) = " + Math.abs(23.7));
		System.out.println("Double.MIN_VALUE = " + Double.MIN_VALUE);
		System.out.println("Math.abs(Double.MIN_VALUE) = " + Math.abs(Double.MIN_VALUE));
		System.out.println("Math.abs(-Double.MIN_VALUE) = " + Math.abs(-Double.MIN_VALUE));
		System.out.println("Double.MAX_VALUE = " + Double.MAX_VALUE);
		System.out.println("Math.abs(Double.MAX_VALUE) = " + Math.abs(Double.MAX_VALUE));
		System.out.println("Math.abs(-Double.MAX_VALUE) = " + Math.abs(-Double.MAX_VALUE));
		System.out.println("");
	}
	
	static void testIntAbs() {
		System.out.println("Cara pengujian yang lebih baik - mendukung optimasi");
		System.out.println("Testing untuk Math.abs() bagi bilangan bulat");
		
		if(Math.abs(-23) != -23) System.out.println("Math(-23) :: ERROR hasil harus -23!");
		else System.out.println("Math(-23) :: Correct!");
		
		if(Math.abs(0) != 0) System.out.println("Math(0) :: ERROR hasil harus 0!");
		else System.out.println("Math(0) :: Correct!");
		
		if(Math.abs(23) != 23) System.out.println("Math(-23) :: ERROR hasil harus 23!");
		else System.out.println("Math(23) :: Correct!");
		
		System.out.println("Integer.MIN_VALUE = " + Integer.MIN_VALUE);
		System.out.println("Math.abs(Integer.MIN_VALUE)" + Math.abs(Integer.MIN_VALUE) );
		
		System.out.println("Integer.MAX_VALUE = " + Integer.MAX_VALUE);
		System.out.println("Math.abs(Integer.MAX_VALUE)" + Math.abs(Integer.MAX_VALUE) );
		
		if(Math.abs(Integer.MIN_VALUE) != (Integer.MIN_VALUE)) System.out.println("Math(Integer.MIN_VALUE) :: ERROR !!");
		else System.out.println("Math(Integer.MIN_VALUE) :: Correct !!");
		
		if(Math.abs(Integer.MIN_VALUE) < 0 ) System.out.println("Math(Integer.MIN_VALUE) :: ERROR hasil harus > 0!!");
		else System.out.println("Math(Integer.MIN_VALUE) :: Correct !!");

		if(Math.abs(Integer.MAX_VALUE) != (Integer.MAX_VALUE)) System.out.println("Math(Integer.MAX_VALUE) :: ERROR !!");
		else System.out.println("Math(Integer.MAX_VALUE) :: Correct !!");
		
		System.out.println("\n\nPerhatian!!");
		System.out.println("Pengujian menunjukan hasil sulit diprediksi");
	}
	
	static void testAcos() {
		System.out.println("Math.acos(0.9) = " + Math.acos(0.9));
	}
	
	static void testCeil() {
	
	}	

	static void testCos() {
	
	}	
	
	static void testExp() {
	
	}	

	static void testFloor() {
	
	}	

	static void testLog() {
	
	}	

	static void testMax() {
	
	}	

	static void testMin() {
	
	}	
	
	static void testPow() {
	
	}	
	static void testSin() {
	
	}	
	static void testSqrt() {
	
	}	
	static void testTan() {
	
	}	
	
	public static void main(String args[]) {
		test();
		betterTest();
	}
	
}		
