package toy;

public class ThrowToy {
	public ThrowToy() {
	}
	
	static void throwException() throws Exception {
		try {
			//
			throw new Exception("Demo terhadap kalimat throw ");
		}
		catch (Exception e) {
			System.out.println("Penangkapan exception di test");
			throw e;
		}
	}
	
	static void test() {
		try {
			throwException();
		} catch (Exception e) {
			System.out.println("Kembali ditangkap exception : " + e); 
		}
	}
	
	public static void main (String args[]) {
		test();
	}
}


		
			
