package programa;

import java.util.Locale;

import entidades.Produtos;

public class Teste1 {

	public static final double PI = 3.14159; // constante n pode ser alterada

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		double raio = 5;
		double c = circunferencia(raio);
		double v = volume(raio);
		
		
		System.out.printf("circunferencia: %.2f%n", c);
		System.out.printf("volume: %.2f%n", v);
		System.out.printf("valor de PI: %.2f%n", PI);
		System.out.println();

	}
	
	public static double circunferencia(double r) {
		return 2.0*PI*r;
	}
	
	public static double volume(double r) {
		return (4.0/3.0)*PI*Math.pow(r,3);
	}
	

}
/*
circunferencia: 31.42
volume: 523.60
valor de PI: 3.14


 
 
membros estáticos





*/
