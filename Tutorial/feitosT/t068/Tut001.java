package programa;

import java.io.FileOutputStream;
import java.io.IOException;

public class Tut001 {

	public static void main(String[] args) {
		long startTime = System.nanoTime();
		
		//
		try {
			FileOutputStream output = new FileOutputStream("/x/arquivo.txt");
		    output.write("Ola".getBytes());
		    output.close();  // must close manually
		    System.out.println("escreveu com sucesso o arquivo.");
		}
		catch (IOException e) {
			System.out.println("erro ao escrever arquivo.");
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
escreveu com sucesso o arquivo.
--------------------------
tempo execução em ms:
0


*/
