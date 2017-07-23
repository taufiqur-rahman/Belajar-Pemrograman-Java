public class FactorialMachineToy {
	private int number = 0;
	private long result = 1;
	
	public FactorialMachineToy() {
	}
	
	public FactorialMachineToy(int number) {
		this.number = number;
		for (int i=0; i<number; i++) next();
	}
	
	public void setNumber(int number) {
		this.number = 1;
		for (int i=0; i<number; i++) next();
	}
	
	public int getNumber() {
		return number;
	}
	
	public void next() {
		number++;
		result *= number;
	}
	
	public void prev() {
		result /= number;
		number--;
	}
	
	public long get() {
		return result;
	}
	
	public void clear() {
		reset();
	}
	
	static void test() {
		FactorialMachineToy m = new FactorialMachineToy();
		for (int i=0; i<11; i++) {
			System.out.println("Factorial ke " + i + " : " + m.get());
			m.next();
		}
		
		System.out.println("Bergerak mundur");
		for (int i= m.getNumber(); i>0; i--) {
			System.out.println("Factorial ke " + i + " : " + m.get());
			m.prev();
		}
	}
	
	public static void main(String args[]) {
		test();
	}
	
	private void reset() {
		number = 0;
		result = 1;
	}
}

	
		
		
