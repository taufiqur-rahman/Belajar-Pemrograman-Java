class BooleanToy {
	public static void main(String args[]) {
		boolean b;
		
		b = false;
		System.out.println("b adalah " + b );
		b = true;
		System.out.println("b adalah " + b );
		
		if (b) System.out.println("Pernyataan ini dieksekusi ");
		
		b = false;
		if (b) System.out.println("Pernyataan ini tidak dieksekusi ");
		
		System.out.println("10 > 7 adalah " + (10 > 7));
	}
}
