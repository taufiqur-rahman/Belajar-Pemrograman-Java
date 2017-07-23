package toy;
public class DivByZeroNext2Toy {
	public DivByZeroNext2Toy() {
	}
	
	public static void main(String args[]) {
		int anInt = 10;
		for(int zeroInt = -1; zeroInt < 2; zeroInt++) {
			try {
				int divResult = anInt / zeroInt;
				System.out.println("Hasilnya adalah " + divResult);
			}
			
			catch (ArithmeticException e) {
				System.out.println("Terjadi pembagian dengan nol ");
				System.out.println("Diatasi blok penanganan sendiri ");
			}
			
			System.out.println("Kalimat setelah catch");
		}
	}
}
