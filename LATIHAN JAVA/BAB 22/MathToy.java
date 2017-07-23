public class MathToy {
	public static int gcd(int m, int n) {
		int t;
		while ((m % n) != 0) {
			t = m;
			m = n;
			n = t % n;
		}
		return n;
	}
	
	public static long gcd(long m, long n) {
		long t;
		while((m % n) != 0) {
			t = m;
			m = n;
			n = t % n;
		}
		return n;
	}
	
	static void test() {
		System.out.println("gcd(2,3) = " + gcd(2,3));
		System.out.println("gcd(2,4) = " + gcd(2,4));
		System.out.println("gcd(5,7) = " + gcd(5,7));
		System.out.println("gcd(12,4) = " + gcd(12,4));
		System.out.println("gcd(5,35) = " + gcd(5,35));
		System.out.println("gcd(7,35) = " + gcd(7,35));
	}
	
	public static void main(String args[]) {
		test();
	}
}
			
		
