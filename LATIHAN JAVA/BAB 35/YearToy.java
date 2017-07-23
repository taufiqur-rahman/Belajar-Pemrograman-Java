public class YearToy {
	public final double MERCURY = 88d;
	public final double VENUS = 225d;
	public final double JUPITER = 4380d;
	public final double SATURN = 10767d;
	
	private double year;
	
	public YearToy(double year) {
		this.year = year;
	}
	
	public double getEarth() {
		return year;
	}
	
	public double getMercury() {
		return year * 365 / MERCURY;
	}
	
	public double getVenus() {
		return year * 365 / VENUS;
	}
	
	public double getJupiter() {
		return year * 365 / JUPITER;
	}
	
	public double getSaturn() {
		return year * 365 / SATURN;
	}
	
	public String stoString() {
		String str = "Umur \n" +
		             "Di bumi      = " + getEarth() + " tahun\n" +
		             "Di merkurius = " + getMercury() + " tahun\n" + 
		             "Di venus     = " + getVenus() + " tahun\n" +
		             "Di yupiter   = " + getJupiter() + " tahun\n" +
		             "Di saturnus  = " + getSaturn() + " tahun\n" ;
		 return str;
	 }
	 
	static void test() {
		YearToy t = new YearToy(10);
		System.out.println(t);
	}
	
	public static void main (String args[]) {
		test();
	}
}
             
	
	
	
	

	
