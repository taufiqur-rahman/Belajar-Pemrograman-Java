public class SeparateNumberToy {
	private int number;
	
	public SeparateNumberToy(int number) {
		this.number = number;
	}
	
	public String toString() {
		String str = number + "Dapat dipisahkan menjadi : " + separate();
		return str;
	}
	
	static void test() {
		System.out.println(new SeparateNumberToy(42339));
		System.out.println(new SeparateNumberToy(0));
	}
	
	public static void main(String args[]) {
		test();
	}
	
	private String separate() {
		String t = " " + number;
		String str = " ";
		
		for (int i = 0; i < t.length(); i++) {
			str += t.substring(i, i+1) + "\t";
		}
		return str;
	}
}
		
