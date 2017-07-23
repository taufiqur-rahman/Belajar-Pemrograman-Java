public class CharIntToy {
	static void test() {
		String str = "";
		
		for(int i=0; i<256; i++) {
			str += (char) i + " ";
			
			if(i % 30 == 0) str += "\n";
			if(i % 256 == 0) str += "\n\n";
		}
		
		System.out.println("Karakter dari 0 sampe 255 : ");
		System.out.println(str);
		
		str = "";
		
		for (int i=60; i<60+30; i++) {
			char ch = (char)i;
			str += ch + " : " + (int)ch + "\n";
		}
		
		System.out.println(str);
	}
	
	public static void main(String args[]) {
		test();
	}
}	
			
