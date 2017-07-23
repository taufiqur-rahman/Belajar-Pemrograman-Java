package toy;

public class DivByZeroNext5Toy {
	
	public DivByZeroNext5Toy(){
	}
	
	public static void main (String args[]) {
		int anInt = 10;
		
		try {
			int divBy = args.length;
			int divResult = anInt / divBy;
			
			System.out.println("Hasilnya adalah " + divResult);
			int c[] = {1}; 
			    c[10] = 100;
		} catch (Exception e) {
			//
			System.out.println("Terjadi kesalahan");
			System.out.println("Diatasi blok penanganan A");
		} catch (ArithmeticException e) {
			//
			System.out.println("Terjadi pembagian dengan nol");
			System.out.println("Diatasi blok penanganan B");
		}
		System.out.println("Kalimat setelah catch");
	}	
}
	
	


