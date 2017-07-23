package bigToy;

public class SLListToy {
	private SLLNode header;
	
	public SLListToy() {
		this.header = null;
	}
	
	public void printAll() {
		for(SLLNode cur = header; cur != null; cur = cur.next) {
			System.out.println(cur.o + " ");
		}
	}
	
	public void insertFirst(SLLNode n) {
		n.next = header;
		header = n;
	}
	
	public void insertAfter(SLLNode bef, SLLNode n) {
		n.next = bef.next ;
		bef.next = n;
	}
	
	public void insertLast(SLLNode n) {
		SLLNode p = header;
		if(p == null) {
			header = n ;
		} else {
			while (p.next != null) p = p.next;
			p.next = n;
		}
	}
	
	public void deleteFirst() {
		if(header != null) header = header.next;
	}
	
	public void deleteLast() {
		if(header == null) return;
		
		SLLNode p = header;
		SLLNode prev = null;
		while (p.next != null) { 
			prev = p;
			p = p.next;
		}
		
		//
		if(prev == null) header = null;
		else prev.next = null;
	}
	
	public void deleteAll() {
		header = null;
	}
	
	public void deleteNode (SLLNode n) {
		SLLNode p = header;
		SLLNode prev = null;
		while (p != n) {
			prev = p;
			p = p.next;
		}
		
		//
		if(p == n) {
			if(prev == null) header = null;
			else prev.next = n.next;
		}
	}
	
	public SLLNode createSLLNode (Object o) {
		return (new SLLNode (o, null));
	}
	

	
	static void test01() {
		//
		SLListToy t = new SLListToy();
		for (int i = 0; i < 10; i++ ) {
			Integer o = new Integer(i);
			SLLNode n = new SLLNode(o, null);
			t.insertFirst(n);
		}
		
		t.printAll();
	}
	
	static void test02() {
		//
		SLListToy t = new SLListToy();
		for (int i = 0; i < 10; i++ ) {
			Integer o = new Integer(i);
			SLLNode n = new SLLNode(o, null);
			t.insertLast(n);
		}
		
		System.out.println(t);
	}
	
	public static void main (String[] args) {
		test01();
		test02();
	}
	
	public String toString() {
		String str = "";
		for(SLLNode cur = header; cur != null ; cur = cur.next) {
			str += cur + "\n";
		}
		return str;
	}
}
		
