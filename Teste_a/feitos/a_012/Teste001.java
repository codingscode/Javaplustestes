package Programa;

import java.util.Arrays;

public class Teste001 {
	
	public static float media(int[] seq) {
		int tamanho = seq.length;
		float soma = 0;
		
		for (int cada : seq) {
			soma += cada;
		}
		
		return soma/tamanho;
	}
	
	public static void main(String[] args) {
		long startTime = System.nanoTime();
		
		int numeros[] = {3, 5, 10};
		System.out.println(Arrays.toString(numeros));
		
		int numeros2[] = {17, 37, 22};
		System.out.println(Arrays.toString(numeros2));
						
		System.out.println("média:");
		float mediaCalc = media(numeros);
		System.out.println(mediaCalc);
		
		System.out.println("média:");
		System.out.println(media(numeros2));


		System.out.println("--------------------------");
		
		System.out.println("--------------------------");
				
		// Your code here
		long endTime = System.nanoTime();
		long duration = (endTime - startTime)/1000000; // total time in nanoseconds

		//milliseconds
		System.out.println("tempo execução em ms:");
		System.out.println(duration);

	}
	

}

/*
criar código que mostre a média de uma lista de números
[3, 5, 10]
[17, 37, 22]
média:
6.0
média:
25.333334
--------------------------
--------------------------
tempo execução em ms:
0




*/
;