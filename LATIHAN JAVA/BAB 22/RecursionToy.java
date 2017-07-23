public class RecursionToy {
	static void test() {
		RecursionToy t = new RecursionToy();
		try {
			System.out.println("Faktorial dari 0 adalah " + t.factorial(0));
			System.out.println("Faktorial dari 1 adalah " + t.factorial(1));
			System.out.println("Faktorial dari 2 adalah " + t.factorial(2));
			System.out.println("Faktorial dari 5 adalah " + t.factorial(5));
			System.out.println("Faktorial dari 15 adalah " + t.factorial(15));
			System.out.println("Faktorial dari 20 adalah " + t.factorial(20));
			System.out.println("Faktorial dari 25 adalah " + t.factorial(25));
		} catch(Exception e) {
			System.out.println("Terjadi exception yaitu " + e);
		}
	}
	
	public static void main(String args[]) {
		test();
	}
	
	public long factorial(int n) throws Exception {
		if(n < 0 && n > 20) throw new Exception("Tidak boleh < 0 dan > 20");
		if(n == 0 || n == 1) return 1;
		return(factorial(n-1)*n);
	}
}


			
		
		

			
