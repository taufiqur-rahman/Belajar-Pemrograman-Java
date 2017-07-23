public class SwitchToy {
	static public void main (String args[]) {
		int a;
		
		a = 5;
		
		switch (a) {
			case 0: System.out.println("Nol");
			case 1: System.out.println("Satu");
			case 2: System.out.println("Dua");
			case 3: System.out.println("Tiga");
			case 4: System.out.println("Empat");
			case 5: System.out.println("Lima");
			case 6: System.out.println("Enam");
			case 7: System.out.println("Tujuh");
			case 8: System.out.println("Delapan");
			case 9: System.out.println("Sembilan");
			default: System.out.println("Bukan karakter digit");
			
			// jangan lupa pake pernyataan break, contoh
			// case 5: System.out.println("Lima"); break;
			
		}
	}
}
