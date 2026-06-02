package programa;

import java.util.Arrays;

public class Tut001 {

	public static void main(String[] args) {

		long startTime = System.nanoTime();

		String[] nomes = new String[3]; // limite de 3 elementos
		nomes[0] = "mário";
		nomes[1] = "pietro";
		nomes[2] = "laisa";
		//nomes[3] = "josé"; // dá erro
		
		for (String cada : nomes) {
			System.out.println(cada);
		}
		
		System.out.println("--------------------------");

		// Your code here
		long endTime = System.nanoTime();
		long duration = (endTime - startTime) / 1000000; // total time in nanoseconds

		// milliseconds
		System.out.println("tempo execução em ms:");
		System.out.println(duration);

	}

}

/*
mário
pietro
laisa
--------------------------
tempo execução em ms:
0



*/
