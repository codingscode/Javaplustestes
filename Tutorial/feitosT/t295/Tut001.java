package programa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Tut001 {
	
	public static void main(String[] args) {
		long startTime = System.nanoTime();
		
        // 
		
		ArrayList<Integer> numeros = new ArrayList<>(List.of(12, 5, 10, 3, 8, 4));
		
		System.out.println(numeros);
		
		numeros.sort(null); // ordena
		
		System.out.println(numeros);
		
		// 3. Executar a busca binária
        int alvo = 10;
        int indiceResultado = Collections.binarySearch(numeros, alvo);

        // 4. Verificar o resultado
        if (indiceResultado >= 0) {
            System.out.print("elemento ");
            System.out.print(alvo);
            System.out.print(" ");
            System.out.print("encontrado no indice: ");
            System.out.println(indiceResultado);
        }
        else {
            System.out.println("Elemento não encontrado.");
        }
		
		System.out.println("--------------------------");

		// Your code here
		long endTime = System.nanoTime(); // total time in nanoseconds
		long duration = (endTime - startTime) / 1000000;

		// milliseconds
		System.out.print("tempo execução em ms: ");
		System.out.println(duration);
	}

}

/*
[12, 5, 10, 3, 8, 4]
[3, 4, 5, 8, 10, 12]
elemento 10 encontrado no indice: 4
--------------------------
tempo execução em ms: 1







*/
