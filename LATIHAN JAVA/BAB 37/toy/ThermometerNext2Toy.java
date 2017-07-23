package toy;

public class ThermometerNext2Toy {
	private double valueInCelcius;
	
	//
	public ThermometerNext2Toy() {
		valueInCelcius = 0;
	}
	
	public ThermometerNext2Toy(double newValue) throws Exception {
		valueInCelcius = newValue;
		if (valueInCelcius < -272.0) {
			Exception E = new Exception("Tidak boleh kurang dari -272 Derajat Celcius");
			throw (E);
		}
	}
	
	//
	public void setInCelcius(double newValue) throws Exception {
		valueInCelcius = newValue;
		
		if(valueInCelcius < -272.0) {
			Exception E = new Exception("Tidak boleh kurang dari -272 Derajat Celcius");
			throw (E);
		}
	}
	
	//
	public void setInReamur(double newValue) throws Exception {
		valueInCelcius = (5/4) * newValue;
		
		if(valueInCelcius < -272.0) {
			Exception E = new Exception("Tidak boleh kurang dari -272 Derajat Celcius");
			throw (E);
		}
	}
	
	//
	public void setInFahrenheit(double newValue) throws Exception {
		valueInCelcius = (5 / 9) * (newValue - 32);
		
		if(valueInCelcius < -272.0) {
			Exception E = new Exception("Tidak boleh kurang dari -272 Derajat Celcius");
			throw (E);
		}
	}

	//
	public void setInKelvin(double newValue) throws Exception {
		valueInCelcius = newValue - 272;
		
		if(valueInCelcius < -272.0) {
			Exception E = new Exception("Tidak boleh kurang dari -272 Derajat Celcius");
			throw (E);
		}
	}

	public double getInCelcius() {
		return valueInCelcius;
	}
	
	public double getInReamur() {
		return ((4 * 5) * valueInCelcius);
	}
	
	public double getInFahrenheit() {
		return (((9/5) * valueInCelcius) + 32);
	}
	
	public double getInKelvin() {
		return (valueInCelcius + 272);
	}
	
	static void test() {
		ThermometerNext2Toy t = new ThermometerNext2Toy();
		
		System.out.println("Pengujian");
		System.out.println("Aplikasi Thermometer");
		System.out.println("Nilai Celcius yang dimasukkan adalah 50");
		System.out.println("Dengan penanganan kondisi pemasukan nilai tidak absah");
		System.out.println("Memanfaatkan structured exception handling");
		System.out.println("=====================================================");
		
		
		try {
			t.setInCelcius(50.0);
			System.out.println("Nilai di celcius    -> " + t.getInCelcius());
			System.out.println("Nilai di reamur     -> " + t.getInReamur());
			System.out.println("Nilai di fahrenheit -> " + t.getInFahrenheit());
			System.out.println("Nilai di kelvin     -> " + t.getInKelvin());
		} catch (Exception e) {
			System.out.println("Pesan kesalahan : " + e.getMessage());
		}
		
		try {
			t.setInCelcius(-273.0);
			System.out.println("Nilai di celcius    -> " + t.getInCelcius());
			System.out.println("Nilai di reamur     -> " + t.getInReamur());
			System.out.println("Nilai di fahrenheit -> " + t.getInFahrenheit());
			System.out.println("Nilai di kelvin     -> " + t.getInKelvin());
		} catch (Exception e) {
			System.out.println("Pesan kesalahan : " + e.getMessage());
		}
	}
	
	public static void main (String[] args) {
		test();
	}
}
	
