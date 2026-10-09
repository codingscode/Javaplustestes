package util;

public class Calculator {
	public static double PI = 3.14159;

	public static double circunferencia(double r) {
		return 2.0*PI*r;
	}
	
	public static double volume(double r) {
		return (4.0/3.0)*PI*Math.pow(r,3);
	}


}
