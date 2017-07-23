public class FractionToy {
	private int num;
	private int denom;
	
	public FractionToy(int num, int denom) {
		int t = MathToy.gcd(num, denom);
		this.num = num / t;
		this.denom = denom / t;
	}
	
	public FractionToy add(FractionToy theF) {
		int tNum = (num * theF.denom) + (theF.num * denom);
		int tDenom = denom * theF.denom;
		return(new FractionToy(tNum, tDenom));
	}
	
	public String toString() {
		return num + "/" + denom;
	}
	
	static void test() {
		System.out.println("Aplikasi aritmatika bilangan pecahan ");
		
		FractionToy a = new FractionToy(2, 3);
		FractionToy b = new FractionToy(4, 6);
		FractionToy c = a.add(b);
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(a + " + " + b + " = " + c);
	}
	
	public static void main(String args[]) {
		test();
	}
	
}
		 
