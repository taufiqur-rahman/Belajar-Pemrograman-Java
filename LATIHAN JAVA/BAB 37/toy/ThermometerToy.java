package toy;

public class ThermometerToy {
	private double valueInCelcius;
	
	public ThermometerToy() {
	}
	
	public ThermometerToy (double newValueInCelcius) {
		valueInCelcius = newValueInCelcius;
	}
	
	public void setInCelcius (double newValue) {
		valueInCelcius = newValue;
	}
	
	public void setInReamur (double newValue) {
		valueInCelcius = (5/4) * newValue;
	}
	
	public void setInFahrenheit (double newValue) {
		valueInCelcius = (5/9) * (newValue - 32);
	}
	
	public void setInKelvin (double newValue) {
		valueInCelcius = newValue - 272;
	}
	
	//
	public double getInCelcius() {
		return valueInCelcius;
	}
	
	public double getInReamur() {
		return ((4/5) * valueInCelcius);
	}
	
	public double getInFahrenheit() {
		return (((9/5) * valueInCelcius) + 32);
	}
	
	public double getInKelvin() {
		return (valueInCelcius + 272);
	}
	
	//
	static void test() {
		ThermometerToy t = new ThermometerToy(0.0);
		
		System.out.println("Pengujian");
		System.out.println("Aplikasi Thermometer");
		System.out.println("Nilai Celcius yang dimasukkan adalah 50");
		
		System.out.println("Nilai Celcius >>" + t.getInCelcius());
		System.out.println("Nilai Reamur >>" + t.getInReamur());
		System.out.println("Nilai Kelvin >>" + t.getInKelvin());
		
		//
		t.setInCelcius(50.0);
		//
		
		System.out.println("Nilai Celcius >>" + t.getInCelcius());
		System.out.println("Nilai Reamur >>" + t.getInReamur());
		System.out.println("Nilai Kelvin >>" + t.getInKelvin());

		//
		t.setInCelcius(100.0);
		//
		
		System.out.println("Nilai Celcius >>" + t.getInCelcius());
		System.out.println("Nilai Reamur >>" + t.getInReamur());
		System.out.println("Nilai Kelvin >>" + t.getInKelvin());
	}
	
	static public void main (String[] args) {
		test();
	}
}






	
