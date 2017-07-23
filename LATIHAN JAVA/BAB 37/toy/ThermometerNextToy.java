package toy;

public class ThermometerNextToy {
	
	private double valueInCelcius;
	private boolean b;
	
	// constructor
	public ThermometerNextToy() {
		valueInCelcius = 0;
		b = true;
	}
	
	public ThermometerNextToy (double newValueInCelcius) {
		valueInCelcius = newValueInCelcius;
		
		if(valueInCelcius < -272.0)
		{
			b = false;
		} else {
			b = true;
		}
	}
	
	public boolean isValid()
	{
		return b;
	}
	
	public void inValidate()
	{
		b = false;
	}
	
	private void validate()
	{
		b = true;
	}
	
	public void setInCelcius(double newValue) {
		valueInCelcius = newValue;
		if(valueInCelcius < -272.0)
		{
			b = false;
		} else {
			b = true;
		}
	}
	
	public void setInReamur(double newValue) {
		valueInCelcius = (5/4) * newValue;
		if(valueInCelcius < -272.0)
		{
			b = false;
		} else {
			b = true;
		}
	}
	
	public void setInFahrenheit(double newValue) {
		valueInCelcius = (5/9) * (newValue -32);
		if(valueInCelcius < -272.0)
		{
			b = false;
		} else {
			b = true;
		}
	}
	
	public void setInKelvin(double newValue) {
		valueInCelcius = newValue - 272;
		if(valueInCelcius < -272.0)
		{
			b = false;
		} else {
			b = true;
		}
	}
	
	public double getInCelcius() {
		return valueInCelcius;
	}
	
	public double getInReamur() {
		return ((4/5) * valueInCelcius);
	}
	
	public double getInFahrenheit() {
		return (((9/5) * valueInCelcius) + 32) ;
	}	
	
	public double getInKelvin() {
		return (valueInCelcius + 272);
	}
	
	static void test() {
		ThermometerNextToy t = new ThermometerNextToy(0.0);
		
		System.out.println("Pengujian");
		System.out.println("Aplikasi Thermometer");
		System.out.println("Dengan penanganan kondisi pemasukan nilai tak absah");		
		System.out.println("Tanpa memanfaatkan structured exception handling");		
		System.out.println("------------------------------------------------");		
		
		System.out.println("Nilai yang dimasukkan 50..");		
		
		//
		if(t.isValid())
			System.out.println("Nilai celcius : " + t.getInCelcius());
		else 
			System.out.println("Nilai termometer tidak absah..");
		//
		if(t.isValid())
			System.out.println("Nilai fahrenheit : " + t.getInFahrenheit());
		else 
			System.out.println("Nilai termometer tidak absah..");
		//
		if(t.isValid())
			System.out.println("Nilai kelvin : " + t.getInKelvin());
		else 
			System.out.println("Nilai termometer tidak absah..");
		//
		
		t.setInCelcius(50.0);

		//
		if(t.isValid())
			System.out.println("Nilai celcius : " + t.getInCelcius());
		else 
			System.out.println("Nilai termometer tidak absah..");
		//
		if(t.isValid())
			System.out.println("Nilai reamur : " + t.getInReamur());
		else 
			System.out.println("Nilai termometer tidak absah..");
		//
		if(t.isValid())
			System.out.println("Nilai fahrenheit : " + t.getInFahrenheit());
		else 
			System.out.println("Nilai termometer tidak absah..");
		//
		if(t.isValid())
			System.out.println("Nilai kelvin : " + t.getInKelvin());
		else 
			System.out.println("Nilai termometer tidak absah..");
		//
		
		t.setInCelcius(-273.0);

		//
		if(t.isValid())
			System.out.println("Nilai celcius : " + t.getInCelcius());
		else 
			System.out.println("Nilai termometer tidak absah..");
		//
		if(t.isValid())
			System.out.println("Nilai reamur : " + t.getInReamur());
		else 
			System.out.println("Nilai termometer tidak absah..");
		//
		if(t.isValid())
			System.out.println("Nilai fahrenheit : " + t.getInFahrenheit());
		else 
			System.out.println("Nilai termometer tidak absah..");
		//
		if(t.isValid())
			System.out.println("Nilai kelvin : " + t.getInKelvin());
		else 
			System.out.println("Nilai termometer tidak absah..");
		//	
	}
		static public void main (String[] args) {
			test();
		}
	}	


