package programa;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Tut001 {

	public static void main(String[] args) {
		long startTime = System.nanoTime();

		File objeto = new File("./src/programa/meuarquivo.txt");

	    // try-with-resources: Scanner will be closed automatically
	    try (Scanner leitor = new Scanner(objeto)) {
	      while (leitor.hasNextLine()) {
	        String dados = leitor.nextLine();
	        System.out.println(dados);
	      }
	    }
	    catch (FileNotFoundException e) {
	      System.out.println("um erro ocorreu.");
	      e.printStackTrace();
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
isto é um texto
segunda linha
terceira linha
fim!
--------------------------
tempo execução em ms:
40

















*/
