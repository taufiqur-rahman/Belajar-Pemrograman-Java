package toy;

public class DivByZeroNextToy {
	
	public DivByZeroNextToy() {
	}
	
	public static void main(String args[]) {
		int zeroInt = 0;
		int anInt = 10;
		
		try {
			int divResult = anInt / zeroInt;
			System.out.println("Hasilnya adalah " + divResult);
		}
		
		catch (ArithmeticException e) {
			System.out.println("Terjadi pembagian dengan nol");
			System.out.println("Diatasi blok penanganan sendiri");
		}
		
		System.out.println("Kalimat setelah catch");
	}
}
