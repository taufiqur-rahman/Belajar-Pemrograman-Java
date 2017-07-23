public class WaterToy {
	private double temperature;
	
	public WaterToy(double temperature) {
		this.temperature = temperature;
	}
	
	public String getForm() {
		if(temperature < 0) return "Es - Beku";
		if(temperature == 0) return "Transisi Es dan Air";
		if(temperature > 0 && temperature < 100) return "Air - Cair";
		if(temperature == 100) return "Transisi cair dan uap";
		if(temperature > 100) return "Uap - Gas";
		return "";
	}
	
	public String getWorseForm() {
		//
		String str = "";
		if(temperature < 0) str = "Es - Beku";
		else if(temperature == 0) str = "Transisi Es dan Air";
		else if(temperature > 0 && temperature < 100) str = "Air - Cair";
		else if(temperature == 100) str = "Transisi cair dan uap";
		else if(temperature > 100) str = "Uap - Gas";
		return str;
	}
	
	public String getWorstForm() {
		//
		String str = "";
		if(temperature < 0) {
			str = "Es - Beku";
		} else {
			if(temperature == 0) {
				str = "Transisi Es dan Air";
			} else {
				if(temperature > 0 && temperature < 100) {
					str = "Air - Cair";
				} else {
					if(temperature == 100) {
						str = "Transisi cair dan uap";
					}  else {
						if(temperature > 100) {
							str = "Uap - Gas";
						}
					}
				}
			}
		}
		return str;
	}
	
	public String toString() {
		String str = "Air bersuhu : " + temperature + "\n" + 
		             "Berbentuk1   : " + getForm();
		             return str;
				 }
	
	public String toWorseString() {
		String str = "Air bersuhu : " + temperature + "\n" + 
		             "Berbentuk2   : " + getWorseForm();
		             return str;
				 }
		
	public String toWorstString() {
		String str = "Air bersuhu : " + temperature + "\n" + 
		             "Berbentuk3   : " + getWorstForm();
		             return str;
				 }		
		
	static void test01() {
		System.out.println(new WaterToy(-10));
		System.out.println(new WaterToy(0));
		System.out.println(new WaterToy(10));
		System.out.println(new WaterToy(100));
		System.out.println(new WaterToy(110));
	}

	static void test02() {
		WaterToy t = new WaterToy(-10);
		System.out.println(t.toWorseString());
	}
	
	static void test03() {
		WaterToy t = new WaterToy(-10);
		System.out.println(t.toWorstString());
	}
	
	static void test() {
		test01();
		test02();
		test03();
	}
	
	public static void main(String args[]) {
		test();
	}
}
	
