package toy;
import java.util.NoSuchElementException;

public class AStackToy implements Stack {
	private Object[] elements;
	private int capacity;
	private int top = 0;
	
	public AStackToy(int capacity) {
		this.capacity = capacity;
		reset();
	}
	
	public boolean isEmpty() {
		return (top == 0) ;
	}
	
	public void add(Object o) {
		if(top == capacity) expand();
		elements[top] = o;
		top++;
	}
	
	public void clear() {
		reset();
	}
	
	public Object get() {
		if(top == 0) throw new NoSuchElementException();
		return elements[top-1];
	}
	
	public void remove() {
		if(top == 0) throw new NoSuchElementException();
		elements[top--] = null;
	}
	
	public int size() {
		return top;
	}
	
	public String toString() {
		String str = "";
		for (int i = 0; i < top; i++ ) str += elements[i] + " ";
		return str;
	}
	
	static void test01() {
		AStackToy t = new AStackToy(15);
		
		for(int i = 0; i < 10; i++) t.add(new Integer(i));
		System.out.println("Stack berisi : \n") ;
		for(int i = 0; i < 10; i++) {
			System.out.println(t.get());
			t.remove();
		}
	}
	
	static void test02() {
		AStackToy t = new AStackToy(5);
		
		for(int i = 0; i < 10; i++) t.add(new Integer(i));
		System.out.println("Stack berisi : \n") ;
		for(int i = 0; i < 10; i++) {
			System.out.println(t.get());
			t.remove();
		}
	}	
	
	public static void main(String[] args) {
		test01();
		test02();
	}
	
	private void expand() {
		capacity = capacity + 10 + (int)(.1 * capacity);
		Object[] newElements = new Object[capacity];
		for(int i = 0; i < top; i++) newElements[i] = elements[i];
		elements = newElements;
	}
	
	private void reset() {
		elements = new Object[capacity];
		top = 0;
	}
	
	
}
