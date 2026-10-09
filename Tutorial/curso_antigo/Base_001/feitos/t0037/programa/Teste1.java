package programa;

import java.util.Locale;

import util.Calculator;

public class Teste1 {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		double raio = 5;
		double c = Calculator.circunferencia(raio);
		double v = Calculator.volume(raio);

		System.out.printf("circunferencia: %.2f%n", c);
		System.out.printf("volume: %.2f%n", v);
		System.out.printf("valor de PI: %.2f%n", Calculator.PI);
		System.out.println();

	}


}
/*
circunferencia: 31.42
volume: 523.60
valor de PI: 3.14



 
 
membros estáticos





*/
