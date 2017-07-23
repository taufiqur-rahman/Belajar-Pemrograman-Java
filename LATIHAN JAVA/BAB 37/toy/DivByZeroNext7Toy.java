// klausa finaly

package toy;

public class DivByZeroNext7Toy {
	public DivByZeroNext7Toy() {
	}
	
	public static void main (String args[]) {
		int zeroInt = 0;
		int anInt = 0;
		
		try {
			int divResult = anInt / zeroInt;
			System.out.println("Hasilnya adalah " + divResult);
		
		} catch (ArithmeticException e) {
			//
			System.out.println("Terjadi pembagian dengan nol..");
			System.out.println("Diatasi blok penanganan sendiri");
		} finally { 
			System.out.println("Kalimat di finally ..");
		}
		System.out.println("Kalimat diluar blok try - catch - finally .. ");
	}
}
		
