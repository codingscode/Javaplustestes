package Programa;

import java.util.HashMap;

public class Teste001 {

	
	public static void main(String[] args) {
		long startTime = System.nanoTime();
		
		Sorteios s = new Sorteios();

		HashMap<Integer, Integer> numeros = new HashMap<>();

		// Inicializa os números de 1 a 31
		for (int i = 1; i <= 31; i++) {
		    numeros.put(i, 0);
		}

		System.out.println(numeros);

		// Atualiza as contagens em tempo O(1) para cada número sorteado
		for (int[] cada : s.sorteios) {
		    for (int n : cada) {
		        // Se o número existir no HashMap, incrementa 1. Se não, inicia em 0 e soma 1.
		        numeros.put(n, numeros.getOrDefault(n, 0) + 1);
		    }
		}

		System.out.println(numeros);
				
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
{1=0, 2=0, 3=0, 4=0, 5=0, 6=0, 7=0, 8=0, 9=0, 10=0, 11=0, 12=0, 13=0, 14=0, 15=0, 16=0, 17=0, 18=0, 19=0, 20=0, 21=0, 22=0, 23=0, 24=0, 25=0, 26=0, 27=0, 28=0, 29=0, 30=0, 31=0}
{1=2, 2=4, 3=3, 4=1, 5=3, 6=1, 7=2, 8=5, 9=5, 10=5, 11=4, 12=4, 13=2, 14=3, 15=3, 16=0, 17=3, 18=3, 19=3, 20=3, 21=4, 22=3, 23=7, 24=5, 25=0, 26=4, 27=3, 28=4, 29=4, 30=3, 31=2}
--------------------------
--------------------------
tempo execução em ms:
1


*/
;