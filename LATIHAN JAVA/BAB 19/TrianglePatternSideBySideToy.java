public class TrianglePatternSideBySideToy {
	private int number;
	
	public TrianglePatternSideBySideToy() {
	}
	
	public TrianglePatternSideBySideToy(int number) {
		this.number = number;
	}
	
	public int getNumber() {
		return number;
	}
	
	public void printPattern() {
	for (int i = 0; i < number; i++) {
			
			// pertama
			for(int j = 0; j <= i; j++) {
				System.out.print("*");
			}
			
			// spasi
			for (int j=i; j<number+1; j++) System.out.print(" ");
			
			// kedua
			for(int j=number-0; i<j; j--) {
				System.out.print("*");
			}
			
			// spasi
			for (int j=0; j<i+1; j++) System.out.print(" ");
			
			// spasi
			for (int j=0; j<i+1; j++) System.out.print(" ");
			
			// ketiga
			for(int j=0; i<j; j++) {
				System.out.print(" ");
			}
			for(int j=0; j<number-i; j++) {
				System.out.print("*");
			}
			
			// spasi
			for (int j=0; j<i; j++) System.out.print(" ");
			
			// keempat
			for(int j=0; j<number-i; j++) {
				System.out.print(" ");
			}
			for(int j=0; j<i+1; j++) {
				System.out.print("*");
			}
			
			// enter
			System.out.println();
		}
	}
	
	static void test() {
		TrianglePatternSideBySideToy t = new TrianglePatternSideBySideToy(10);
		t.printPattern();
	}
	
	public static void main(String args[]) {
		test();
	}
}
