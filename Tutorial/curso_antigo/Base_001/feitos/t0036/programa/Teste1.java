package programa;

import java.util.Locale;

import util.Calculator;

public class Teste1 {
	
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Calculator calc = new Calculator();
		
		double raio = 5;
		double c = calc.circunferencia(raio);
		double v = calc.volume(raio);


		System.out.printf("circunferencia: %.2f%n", c);
		System.out.printf("volume: %.2f%n", v);
		System.out.printf("valor de PI: %.2f%n", calc.PI);
		System.out.println();

	}

}
/*
circunferencia: 31.42
volume: 523.60
valor de PI: 3.14



 
 
membros estáticos





*/
