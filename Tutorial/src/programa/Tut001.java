package programa;

import java.io.FileOutputStream;
import java.io.IOException;

public class Tut001 {
	
		
	
	public static void main(String[] args) {
		long startTime = System.nanoTime();
		
        // 
		// 
		try {
			FileOutputStream output = new FileOutputStream("./src/programa/arquivo.txt");
		    output.write("Ola".getBytes());
		    output.close();  // must close manually
		    System.out.println("escreveu com sucesso o arquivo.");
		}
		catch (IOException e) {
			System.out.println("erro ao escrever arquivo.");
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

medio nivel
--------------------------
tempo execução em ms: 0








*/
