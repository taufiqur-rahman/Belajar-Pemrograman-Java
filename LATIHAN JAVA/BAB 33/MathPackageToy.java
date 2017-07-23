import java.lang.System;
import java.lang.Math;

public class MathPackageToy {

	public MathPackageToy() {
	}
	
	static void test() {
		System.out.println(Math.E);
		System.out.println(Math.PI);
		System.out.println(Math.abs(-1234));
		System.out.println(Math.cos(Math.PI/4));
		System.out.println(Math.sin(Math.PI/2));
		System.out.println(Math.tan(Math.PI/4));
		System.out.println(Math.log(1));
		System.out.println(Math.exp(Math.PI));
		
		for(int i=0; i<3; ++i) 
			System.out.println(Math.random() + " ");
			System.out.println();
		}
	
	public static void main(String args[]) {
		test();
	}
}

	
		

