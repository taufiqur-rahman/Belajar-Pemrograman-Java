public class ContinueToy {

public static void main(String args[]) {
int a = 0;
do {
	a++;
	if (a == 7) continue;
	System.out.println("Iterasi ke-" + a);
	System.out.println("saya pusing bray.");
	
	if (a == 10) break;
} while(true);
}
}

