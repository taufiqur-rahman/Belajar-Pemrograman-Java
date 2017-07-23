import java.util.*;

public class MorseToy {
	private String asciiText = "";
	private String morseText = "";
	
	private boolean fDirect = true;
	
	private static int NR_CHARS = 36;
	private static char[] ch = {
		
		' ',
		'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z',
		'1','2','3','4','5','6','7','8','9','0' };
	
	private static String[] mc = {
		null,
		".-", // a
		"-...", // b
		"-.-.", // c
		"-..", // d
		".", // e
		"..-.", // f
		"--.", // g
		"....", // h
		"..", // i
		".---", // j
		"-.-", // k
		".-..", // l
		"--", // m
		"-.", // n
		"---", // o
		".--.", // p
		"--.-", // q
		".-.", // r
		"...", // s
		"-", // t
		"..-", // u
		"...-", // v
		".--", // w
		"-..-", // x
		"-.--.", // y
		"--..", // z

		".----", // 1
		"..---", // 2
		"...--", // 3
		"....-", // 4
		".....", // 5
		"-....", // 6
		"--...", // 7
		"---..", // 8
		"----.", // 9
		"-----"  // 0
	};
				
	public MorseToy(String s, boolean fDirect) {
		if(fDirect) {
			this.asciiText = s;
			convertToMorse();
		} else {
			this.morseText = s;
			convertToAscii();
		}
	}
	
	public String getMorse() {
		return morseText;
	}
	
	public String getAscii() {
		return asciiText;
	}
	
	public String toString() {
		String str = "Teks Ascii = " + getAscii() + "\n" +
		             "Teks Morse = " + getMorse();
		return str;
	}
	
	static void test() {
		System.out.println(new MorseToy("TAUFIQUR RAHMAN", true));
		System.out.println(new MorseToy((new MorseToy("TAUFIQUR RAHMAN", true)).getMorse(), false));
	}
	
	public static void main (String args[]) {
		test();
	}
	
	private int searchMorse(String s) {
		int i = NR_CHARS-1;
		mc[0] = s;
		
		while (!mc[i].equals(s)) i--; 
		return i;
	}
	
	private int searchChar(char ch) {
		int i = NR_CHARS-1;
		while(this.ch[i]!=ch) i--;
		return i;
	}
	
	private void convertToMorse() {
		morseText = "";
		for(int i = 0; i<asciiText.length(); i++) {
			int idx = searchChar(asciiText.charAt(i));
			if(idx == 0) {
				morseText += "\t";
			} else {
				morseText += mc[idx];
				morseText += " ";
			}
		}
	}
	
	private void convertToAscii() {
		asciiText = "";
		StringTokenizer tokensA = new StringTokenizer(morseText);
		
		while (tokensA.hasMoreTokens()) {
			String morseWord = tokensA.nextToken("\t");
			StringTokenizer tokensB = new StringTokenizer(morseWord);
			
			while(tokensB.hasMoreTokens()) {
				int idx = searchMorse(tokensB.nextToken());
				if (idx == 0) {
					asciiText += " ";
				} else {
					asciiText += ch[idx];
				}
			}
			
			asciiText += " ";
		}
	}
}

			
		             
