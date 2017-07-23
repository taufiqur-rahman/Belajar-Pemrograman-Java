public class PostManToy {
	
	private static boolean onOff[] = new boolean[150];
	final static int ADJUST = 1;
	
	public PostManToy() {
		initOnOff();
		doAnyThing();
	}
	
	static void initOnOff() {
		System.out.println("Inisialisasi : ");
		for (int i = 1-ADJUST; i<150; i++) onOff[i] = false;
	}
	
	static void doAnyThing() {
		System.out.println("Do Anything : Tunggulah ");
		for (int i = 1-ADJUST; i < 150; i++) {
			System.out.println("Pass : " + i);
			for (int j = i ; j < 150; j += i+ADJUST) {
				onOff[j] = !onOff[j];
			}
		}
	}
	
	public static void reportResult() {
		System.out.println("Hasil : ") ;
		for(int i=1-ADJUST; i<150; i++) {
			if(onOff[i]) System.out.println(" | " + (i+ADJUST));
		}
	}
	
	static void test() {
		reportResult();
	}
	
	public static void main(String args[]) {
		test();
	}
}
