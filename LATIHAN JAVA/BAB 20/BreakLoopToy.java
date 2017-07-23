public class BreakLoopToy {
	public static void main(String args[]) {
		int i = 0;
		
		do {
			i++;
			System.out.println(i);
			if (i == 5 ) break;
		}
		while (true);
	}
}
