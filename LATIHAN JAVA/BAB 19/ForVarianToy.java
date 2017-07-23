public class ForVarianToy {
	public static void main(String args[]) {
		boolean finish = false;
		
		int i = 0;
		
		for (; !finish;) {
			System.out.println("i = " + i);
			if (i==10) finish = true;
			i++;
		}
	}
}
