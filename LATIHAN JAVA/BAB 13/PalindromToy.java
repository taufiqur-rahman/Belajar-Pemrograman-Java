import java.io.DataInputStream;
import java.util.Stack;

public class PalindromToy {
	public PalindromToy() {
	}
	
	public static boolean isPalindrom (String theString) {
		int stringLength, div2Length;
		int i, j;
		
		Stack aStack = new Stack();
		
		stringLength = theString.length();
		div2Length = stringLength / 2;
		
		for(i = 0; i < div2Length; i++) {
			Character C = new Character(theString.charAt(i));
			aStack.push(C);
		}
		
		if (stringLength % 2 != 0) i++;
		
		for(j=i; j<stringLength; j++) {
			Character C = new Character(theString.charAt(j));
			if(!(C.equals(aStack.pop()))) return false;
		}
		
		return true;
	}
	
	private static String inputSetence () throws java.io.IOException {
		DataInputStream dis = new DataInputStream(System.in);
		return(dis.readLine());
	}
	
	static void test() {
		try {
			String aString = new String(inputSetence());
			
			if (PalindromToy.isPalindrom(aString)) {
				System.out.println(aString+ " adalah Palindrom");
			}
			
			else {
				System.out.println(aString + " adalah bukan Palindrom");
			}
		} 
		
		catch (Exception E) {
			System.out.println(E.getMessage());
		}
	}
	
	static public void main(String args[]) {
		test();
	}
}
	
