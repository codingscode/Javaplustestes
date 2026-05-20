package Programa;

import java.util.Arrays;

public class Teste001 {
	
	// Método para calcular o MDC de dois números usando o Algoritmo de Euclides
    public static int calcularMDC(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // Método para calcular o MDC de todo o vetor
    public static int calcularMDCVetor(int[] vetor) {
        if (vetor.length == 0) {
            return 0;
        }
        
        int mdcAtual = vetor[0];
        for (int i = 1; i < vetor.length; i++) {
            mdcAtual = calcularMDC(mdcAtual, vetor[i]);
            
            // Se o MDC chegar a 1, ele não pode mais diminuir, então podemos parar
            if (mdcAtual == 1) {
                return 1;
            }
        }
        return mdcAtual;
    }
    
 // Função recursiva para calcular o Máximo Divisor Comum (MDC)
    public static int mdc(int a, int b) {
        if (b == 0) {
            return a;
        }
        return mdc(b, a % b);
    }

    // Função para calcular o MMC de dois números
    public static int mmc(int a, int b) {
        // Evita divisão por zero e lida com números negativos
        if (a == 0 || b == 0) {
            return 0;
        }
        return Math.abs(a * b) / mdc(a, b);
    }

    // Função que calcula o MMC de um vetor inteiro
    public static int mmcDoVetor(int[] vetor) {
        if (vetor == null || vetor.length == 0) {
            return 0; // Retorna 0 para vetor vazio ou nulo
        }
        
        int resultado = vetor[0];
        for (int i = 1; i < vetor.length; i++) {
            resultado = mmc(resultado, vetor[i]);
        }
        
        return resultado;
    }
	
	
	public static void main(String[] args) {
		long startTime = System.nanoTime();

		int numeros[] = {4, 6, 18, 24};
		
		System.out.println(Arrays.toString(numeros));
		
		System.out.println("mdc:");
		System.out.println(calcularMDCVetor(numeros));
		System.out.println("mmc:");
		System.out.println(mmcDoVetor(numeros));
		

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
criar código que mostre o mdc e o mmc de uma lista de números


[4, 6, 18, 24]
mdc:
2
mmc:
72
--------------------------
--------------------------
tempo execução em ms:
0






*/
;