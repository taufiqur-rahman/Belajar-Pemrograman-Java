public class StringConversionToy {
	public StringConversionToy() {
	}
	
	static void test() {
		int anInt = 2002;
		System.out.println(anInt + " dalam biner adalah " + Integer.toBinaryString(anInt));
		System.out.println(anInt + " dalam oktal adalah " + Integer.toOctalString(anInt));
		System.out.println(anInt + " dalam heksadesimal adalah " + Integer.toHexString(anInt));
	}
	
	static public void main(String args[]) {
		test();
	}
}

		
