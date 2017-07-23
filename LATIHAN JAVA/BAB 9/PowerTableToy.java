class PowerTableToy {
	private int numberOfRows;
	
	public PowerTableToy() {
	}

	public PowerTableToy(int numberOfRows) {
		this.numberOfRows = numberOfRows;
	}
	
	public void setNumber(int numberOfRows) {
		this.numberOfRows = numberOfRows;
	}
	
	public int getNumberOfRow() {
		return numberOfRows;
	}
	
	public void printTable() {
		System.out.println("Number square cube " ) ;
		
		for(int i = 0; i < numberOfRows; i++) {
			System.out.println(i + " " + (i * i) + " " + (i * i * i));
		}
	}
	
	static void test() {
		PowerTableToy p = new PowerTableToy(11);
		p.printTable();
	}
	
	public static void main(String args[]) {
		test();
	}
}
