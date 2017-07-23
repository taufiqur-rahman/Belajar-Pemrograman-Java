public class SequenceToy {
	public SequenceToy() {
	}
	
	static void test01() {
		NaturalSequence t = new NaturalSequence();
		System.out.println("Aplikasi Barisan Aseli " );
		System.out.println("Item ke : " + t.getTH());
		System.out.println("Nilai item : " + t.item());
		System.out.println("Nilai item  ke 1  : " + t.itemTH(0));
		System.out.println("Nilai item  ke 2  : " + t.itemTH(1));
		System.out.println("Nilai item  ke 3  : " + t.itemTH(2));
		System.out.println("Nilai item  ke 4  : " + t.itemTH(3));
		System.out.println("Nilai item  ke 5  : " + t.itemTH(4));
		System.out.println("Nilai item  ke 6  : " + t.itemTH(5));
		System.out.println("Nilai item  ke 7  : " + t.itemTH(6));
		System.out.println("Nilai item  ke 8  : " + t.itemTH(7));
		System.out.println("Nilai item  ke 9  : " + t.itemTH(8));
		System.out.println("Nilai item  ke 10 : " + t.itemTH(9));
	}
	
	static void test02() {
		OddSequence t = new OddSequence();
		System.out.println("Aplikasi Barisan Ganjil " );
		System.out.println("Item ke : " + t.getTH());
		System.out.println("Nilai item : " + t.item());
		System.out.println("Nilai item  ke 1  : " + t.itemTH(0));
		System.out.println("Nilai item  ke 2  : " + t.itemTH(1));
		System.out.println("Nilai item  ke 3  : " + t.itemTH(2));
		System.out.println("Nilai item  ke 4  : " + t.itemTH(3));
		System.out.println("Nilai item  ke 5  : " + t.itemTH(4));
		System.out.println("Nilai item  ke 6  : " + t.itemTH(5));
		System.out.println("Nilai item  ke 7  : " + t.itemTH(6));
		System.out.println("Nilai item  ke 8  : " + t.itemTH(7));
		System.out.println("Nilai item  ke 9  : " + t.itemTH(8));
		System.out.println("Nilai item  ke 10 : " + t.itemTH(9));
	}
	
	static void test03() {
		EvenSequence t = new EvenSequence();
		System.out.println("Aplikasi Barisan Genap " );
		System.out.println("Item ke : " + t.getTH());
		System.out.println("Nilai item : " + t.item());
		System.out.println("Nilai item  ke 1  : " + t.itemTH(0));
		System.out.println("Nilai item  ke 2  : " + t.itemTH(1));
		System.out.println("Nilai item  ke 3  : " + t.itemTH(2));
		System.out.println("Nilai item  ke 4  : " + t.itemTH(3));
		System.out.println("Nilai item  ke 5  : " + t.itemTH(4));
		System.out.println("Nilai item  ke 6  : " + t.itemTH(5));
		System.out.println("Nilai item  ke 7  : " + t.itemTH(6));
		System.out.println("Nilai item  ke 8  : " + t.itemTH(7));
		System.out.println("Nilai item  ke 9  : " + t.itemTH(8));
		System.out.println("Nilai item  ke 10 : " + t.itemTH(9));
	}

	static void test04() {
		FibonacciSequence t = new FibonacciSequence();
		System.out.println("Aplikasi Barisan Pibonacci " );
		System.out.println("Nilai item  ke 1 ");
		System.out.println("Nilai item  " + t.item());
		t.next();

		System.out.println("Nilai item  ke 2 ");
		System.out.println("Nilai item  " + t.item());
		t.next();

		System.out.println("Nilai item  ke 3 ");
		System.out.println("Nilai item  " + t.item());
		t.next();
		
		System.out.println("Nilai item  ke 4 ");
		System.out.println("Nilai item  " + t.item());
		t.next();
		
		System.out.println("Nilai item  ke 5 ");
		System.out.println("Nilai item  " + t.item());
		t.next();
		
		System.out.println("Nilai item  ke 6 ");
		System.out.println("Nilai item  " + t.item());
		t.next();

		System.out.println("Nilai item  ke 7 ");
		System.out.println("Nilai item  " + t.item());
		t.next();

		System.out.println("Nilai item  ke 8 ");
		System.out.println("Nilai item  " + t.item());
		t.next();

		System.out.println("Nilai item  ke 9 ");
		System.out.println("Nilai item  " + t.item());
		t.next();

		System.out.println("Nilai item  ke 10 ");
		System.out.println("Nilai item  " + t.item());
		t.next();
		
		t.reset();
		
		System.out.println("Aplikasi barisan fibonacci");
		System.out.println("Nilai Item : " + t.item());		
		
		System.out.println("Nilai item  ke 1  : " + t.itemTH(0));
		System.out.println("Nilai item  ke 2  : " + t.itemTH(1));
		System.out.println("Nilai item  ke 3  : " + t.itemTH(2));
		System.out.println("Nilai item  ke 4  : " + t.itemTH(3));
		System.out.println("Nilai item  ke 5  : " + t.itemTH(4));
		System.out.println("Nilai item  ke 6  : " + t.itemTH(5));
		System.out.println("Nilai item  ke 7  : " + t.itemTH(6));
		System.out.println("Nilai item  ke 8  : " + t.itemTH(7));
		System.out.println("Nilai item  ke 9  : " + t.itemTH(8));
		System.out.println("Nilai item  ke 10 : " + t.itemTH(9));	
			
	}
	
	public static void main (String args[]) {
		System.out.println("Aplikasi barisan bilangan");		
		System.out.println("=========================");
		
		test01();
		
		System.out.println("=========================");
		
		test02();
		
		System.out.println("=========================");
		
		test03();

		System.out.println("=========================");
		
		test04();
		
	}
}


abstract class Sequence {
	protected int th;
	public Sequence() {
		th = 0;
	}
	
	public void reset() {
		th = 0;
	}
	
	public int getTH() {
		return th;
	}
}

abstract class IntegerSequence extends Sequence {
	protected int value;
	
	public IntegerSequence() {
		super();
		value = 1;
	}
	
	public void reset() {
		super.reset();
		value = 1;
	}
	
	public int item() {
		return value;
	}
	
	abstract public void next() ;
	
	public int itemTH (int Nr) {
		reset();
		for(int i = 0; i< Nr; i++) next() ;
		return value;
	}
}
	

class NaturalSequence extends IntegerSequence {
	public NaturalSequence() {
		super();
	}
	
	public void next() {
		value++;
		th++;
	}
}

class OddSequence extends IntegerSequence {
	public OddSequence() {
		super();
	}
	
	public void next() {
		value += 2;
		th++;
	}
}

class EvenSequence extends IntegerSequence {
	public EvenSequence() {
		super();
		value = 2;
	}
	
	public void reset() {
		super.reset();
		value = 2;
	}
	
	public void next() {
		value += 2;
		th++;
	}
}

class FibonacciSequence extends IntegerSequence {
	private int prevValue;
	
	public FibonacciSequence() {
		super();
		prevValue = 0;
	}
	
	public void reset() {
		super.reset();
		prevValue = 0;
	}
	
	public int intemTH (int Nr) {
		prevValue = 0;
		return (super.itemTH(Nr));
	}
	
	public void next() {
		int temp = value;
		value += prevValue;
		prevValue = temp;
		th++;
	}
}
