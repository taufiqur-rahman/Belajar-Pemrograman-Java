class FloatToy {
	public static void main (String args[]) {
		float x = 5.5F;
		float y = 0;
		
		System.out.println("Nilai x dan y mula-mula : ");
		System.out.println("x = " + x);
		System.out.println("y = " + y);
		
		y = x++;
		System.out.println("Nilai x dan y setelah x++ : ");
		System.out.println("x = " + x);
		System.out.println("y = " + y);
		
		y = ++x;
		System.out.println("Nilai x dan y setelah ++x : ");
		System.out.println("x = " + x);
		System.out.println("y = " + y);
	}
}
