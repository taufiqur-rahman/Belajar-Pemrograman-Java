//package toy;

public class PromotionToy {
	public static void main (String args[]) {
		byte aByteB = 42;
		char aCharC = 'a';
		short aShortS = 1024;
		int anIntI = 5000;
		float aFloatF = 5.67f;
		double aDoubleD = .1234;
		double result = (aFloatF * aByteB) + (anIntI / aCharC) - (aDoubleD * aShortS);
		
		System.out.println((aFloatF * aByteB) + " + " + (anIntI / aCharC) + " - " + (aDoubleD * aShortS));
		System.out.println("result = " + result);
	}
}
