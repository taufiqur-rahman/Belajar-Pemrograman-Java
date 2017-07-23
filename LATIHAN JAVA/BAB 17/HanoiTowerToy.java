public class HanoiTowerToy {
	private int nrOfDisk = 0;
	private char originPole = 'A';
	private char destPole = 'B';
	private char otherPole = 'C';
	private String str = "";
	
	//
	
	public HanoiTowerToy(int nrOfDisk) {
		this.nrOfDisk = nrOfDisk;
		transfer();
	}
	
	public String toString() {
		str = "Menara hanoi dengan " + nrOfDisk + " piringan \n" + 
		      "Asal : " + originPole + " Tujuan : " + destPole + 
		      " Perantara : " + otherPole + "\n" + str;
		      return str;
	}
	
	static void test() {
		System.out.println(new HanoiTowerToy(20));
	}
	
	public static void main(String args[]) {
		test();
	}
	
	private void diskMove(char originPole, char destPole) {
		str += "Pindahkan piringan dari " + originPole + " ke " + destPole + "\n";
	}
	
	private void blockMove(int nrOfDisk, char originPole, char destPole, char otherPole) {
		if (nrOfDisk>0) {
			blockMove(nrOfDisk-1, originPole, otherPole, destPole);
			diskMove(originPole, destPole);
			blockMove(nrOfDisk-1, otherPole, destPole, originPole);
		}
	}
	
	private void transfer() {
		blockMove(nrOfDisk, originPole, destPole, otherPole);
	}
}
		       
