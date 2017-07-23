public class MassToy {
	private String name = "";
	private double density = 0;
	
	public MassToy() {
	
    }	
    
    public MassToy(String name, double density) {
		this.name = name ;
		this.density = density;
	}
	
	public double getMass (double volume) {
		return density * volume ;
	}
	
	public double getDensity() {
		return density;
	}
	
	public double getVolume(double mass) {
		return mass/density;
	}
	
	public String toString() {
		String str = "Benda " + "\n" + "Nama benda = " + name + "\n" + "Massa jenis = " + density + "\n";
		return str;
	}
	
	static void test() {
		MassToy m = new MassToy("Alumunium ",2.7);
		System.out.println(m);
	}
	
	public static void main (String args[])	{
		test();
	}
}		 					
		
