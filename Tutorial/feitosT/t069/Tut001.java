package programa;

import java.io.File;
import java.io.IOException;

public class Tut001 {

	public static void main(String[] args) {
		long startTime = System.nanoTime();

		try {
			File objeto = new File("./src/programa/arquivo.txt"); // Create File object
			
			if (objeto.createNewFile()) { // Try to create the file
				System.out.println("arquivo criado: " + objeto.getName());
			}
			else {
				System.out.println("arquivo já existe.");
			}
		}
		catch (IOException e) {
			System.out.println("um erro aconteceu.");
			e.printStackTrace(); // Print error details
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
arquivo criado: arquivo.txt
--------------------------
tempo execução em ms:
11













*/
