public class MagicNumberToy {
	static final int ADJUST = 1;
	
	private int side;
	private int[][] square;
	
	private boolean fValid = false;
	
	public MagicNumberToy(int side) {
		if(side % 2 == 1) {
			this.fValid = true;
			this.side = side;
			square = new int[side][side];
			makeMagic();
		}
	}
	
	static void test01() {
		MagicNumberToy t = new MagicNumberToy(5);
		
		if (t.isValid()) t.printSquare();
		else System.out.println("Nilai sisi yang dimasukan tidak sah!");
		System.out.println("");
	}
	
	static void test02() {
		MagicNumberToy t = new MagicNumberToy(5);
		
		if (t.isValid()) System.out.println(t);
		else System.out.println("Nilai sisi yang dimasukan tidak sah!");
		System.out.println("");
	}

	static void test03() {
		MagicNumberToy t = new MagicNumberToy(5);
		
		if (t.isValid()) t.printSquare();
		else System.out.println("Nilai sisi yang dimasukan tidak sah!");
		System.out.println("");
	}
		
	public static void main(String args[]) {
		test01();
		test02();
		test03();
	}
	
	public boolean isValid() {
		return fValid;
	}
	
	private void makeMagic() {
		int row = 1-ADJUST;
		int col = side/2;
		square[row][col] = 1;
		for (int k=2; k<=(side*side) ; k++) {
			int oldRow = row;
			int oldCol = col;
			
			row = row - 1;
			col = col + 1;
			
			if(row < 0) row = side-ADJUST;
			if(col>side-ADJUST) col = 1-ADJUST;
			if(square[row][col] == 0) square[row][col] = k;
			else {
				row = oldRow + 1;
				col = oldCol;
				square[row][col] = k;
			}
		}
	}
	
	public void printSquare() {
		//
		for(int i=0; i<side; i++) {
			for(int j=0; j<side; j++) {
				//
				System.out.print(square[i][j]+"\t");
			}
			System.out.println();
		}
	}
	
	public String toString() {
		//
		String str = "";
		
		for (int i=0; i<side; i++) {
			for (int j=0; j<side; j++) {
				str += square[i][j] + "\t";
			}
			str += "\n";
		}
		return str;
	}
}
			
		
