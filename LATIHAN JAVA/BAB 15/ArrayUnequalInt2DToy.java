class ArrayUnequalInt2DToy {
	public static void main(String args[]) {
		int int2DUnequalArr[][] = new int[4][];
		int2DUnequalArr[0] = new int[1];
		int2DUnequalArr[1] = new int[2];
		int2DUnequalArr[2] = new int[3];
		int2DUnequalArr[3] = new int[4];
		int k=0;
		
		for (int i=0; i<4; i++) {
			for (int j=0; j<i+1; j++) {
				int2DUnequalArr[i][j] = k++;
			}
		}
			
		for (int i=0; i<4; i++) {
			for (int j=0; j<i+1; j++) {
				System.out.print(int2DUnequalArr[i][j] + " ");
			}
			System.out.println();
		}
	}
}	
		
