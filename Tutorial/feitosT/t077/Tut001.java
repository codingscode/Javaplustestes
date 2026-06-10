package programa;

import java.io.FileInputStream;
import java.io.IOException;

public class Tut001 {

	public static void main(String[] args) {
		long startTime = System.nanoTime();
	    
	    // try-with-resources: FileInputStream will be closed automatically
	    try (FileInputStream entrada = new FileInputStream("/home/mks/ProgX/Javeiro/ginastica/Tutorial/src/programa/arquivo.txt")) {

	      int i;  // variable to store each byte that is read

	      // Read one byte at a time until end of file (-1 means "no more data")
	      while ((i = entrada.read()) != -1) {
	        // Convert the byte to a character and print it to the console
	        System.out.print((char) i);
	      }

	    }
	    catch (IOException e) {
	      // If an error happens (e.g. file not found), print an error message
	      System.out.println("erro ao ler arquivo.");
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
um texto
segunda linha
terceira linha
fim!--------------------------
tempo execução em ms:
2







*/
