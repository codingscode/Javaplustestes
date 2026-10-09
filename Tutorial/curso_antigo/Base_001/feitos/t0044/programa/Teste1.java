package programa;

import java.util.Locale;


public class Teste1 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		double soma = 0;
		double alturas[] = { 1.9, 1.68, 1.75 };
		
		for (int i=0; i < alturas.length; i++) {
			soma += alturas[i];
		}
		
		System.out.println("soma: " + soma);
		System.out.println("média: " + soma/(alturas.length));
		
		/*
		double[] vetor = new double[3]
		*/
		
	}


}
/*
soma: 5.33
média: 1.7766666666666666


----------------------------------------
stack vs heap
valor null aponta para ninguém
tipos primitivos são tipos valor
tipos valor são Caixas e não ponteiros

valores padrão
numeros: 0
boolean: false
char: caractere codigo 0
objeto: null

garbage collector

desalocação por escopo

vetores


*/
