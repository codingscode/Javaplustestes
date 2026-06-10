package programa;

import java.io.File;

public class Tut001 {

	public static void main(String[] args) {
		long startTime = System.nanoTime();

		File objeto = new File("/home/mks/ProgX/Javeiro/ginastica/Tutorial/src/programa/meuarquivo.txt");

	    if (objeto.delete()) { 
	      System.out.println("apagou o arquivo: " + objeto.getName());
	    } else {
	      System.out.println("falhou ao apagar o arquivo.");
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
apagou o arquivo: meuarquivo.txt
--------------------------
tempo execução em ms:
7





*/
