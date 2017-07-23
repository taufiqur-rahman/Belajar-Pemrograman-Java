public class PrimeToy {
	public static void main (String args[]) {
		int num = 19;
		
		boolean isPrime = true;
		
		for (int i = 2; i <= num/2; i++) {
			if((num % i) == 0) {
				isPrime = false;
				break;
			}
			
		}
		
		if (isPrime) 
			System.out.println(num + " adalahh bilangan prima");
		else 
			System.out.println(num + " adalah bukan bilangan prima");
		}
	}
