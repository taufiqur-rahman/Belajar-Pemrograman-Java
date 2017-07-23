package toy;

public class GravityToy {
	public final double EARTH = 1;
	public final double MERCURY = 0.4;
	public final double JUPITER = 2.5;
	public final double SATURN = 1.1;
	
	private double weight;
	
	public GravityToy(double weight) {
		this.weight = weight;
	}
	
	public double getEarth() {
		return weight;
	}
	
	public double getMercury() {
		return (MERCURY * weight);
	}
	
	public double getJupiter() {
		return (JUPITER * weight);
	}
	
	public double getSaturn() {
		return (SATURN * weight);
	}
	
	public String toString() {
		String str = "Berat " + "\n" +
		             "Di bumi      = " + getEarth() + "\n" + 
		             "Di merkurius = " + getMercury() + "\n" +
		             "Di yupiter   = " + getJupiter() + "\n" +
		             "Di saturn    = " + getSaturn() ;
		return str;
	}
	
	static void test() {
		System.out.println(new GravityToy(55)) ;
	}
	
	public static void main(String args[]) {
		test();
	}
}

             
