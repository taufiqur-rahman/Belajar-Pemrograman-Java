class LightSpeedToy {
	public static void main(String args[]) {
		int lightSpeed;
		long days;
		long seconds;
		long distance;
		
		lightSpeed = 300000;
		days = 100;
		
		seconds = days * 24 * 60 * 60;
		
		distance = lightSpeed * seconds;
		
		System.out.print("Dalam " + days);
		System.out.print(" hari, cahaya telah merambat sejauh ");
		System.out.println(distance + " kilometer");
	} 

}
