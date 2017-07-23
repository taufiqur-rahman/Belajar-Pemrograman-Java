public class CaloryToy {
	private double weight;
	
	public CaloryToy() {
	}
	
	public CaloryToy(double weight) {
		this.weight = weight;
	}
	
	public double getCalory() {
		return (19 * weight);
	}
	
	public String toString() {
		String str = "Berat            = " + weight + " pound " + "\n" +
					 "Kebutuhan kalori = " + getCalory();
		return str;
	}
		
	static void test02() {
		double sebuahvariabel = 100.0;
		CaloryToy nganu = new CaloryToy(sebuahvariabel);
		
		System.out.println(nganu);
	}
	
	public static void main(String args[]) {
		test02();
	}
}
