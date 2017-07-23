package bigToy;

public class SLLNode {
	protected Object o;
	protected SLLNode next;
	
	public SLLNode (Object o, SLLNode next) {
		this.o = o;
		this.next = next;
	}	
	
	public Object getObject() {
		return o;
	}
	
	public String toString() {
		return "" + o;
	}
}

	
