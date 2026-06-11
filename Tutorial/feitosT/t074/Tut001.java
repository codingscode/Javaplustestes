package programa;

import java.io.File;

public class Tut001 {

	public static void main(String[] args) {
		long startTime = System.nanoTime();

		File objeto = new File("./src/programa/meuarquivo.txt");
	    
	    if (objeto.exists()) {
	      System.out.println("nome do arquivo: " + objeto.getName());
	      System.out.println("path absoluto: " + objeto.getAbsolutePath());
	      System.out.println("escrevivel: " + objeto.canWrite());
	      System.out.println("legivel: " + objeto.canRead());
	      System.out.println("tamanho em bytes: " + objeto.length());
	    }
	    else {
	      System.out.println("o arquivo nao existe.");
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
nome do arquivo: meuarquivo.txt
path absoluto: /home/mks/ProgX/Javeiro/ginastica/Tutorial/src/programa/meuarquivo.txt
escrevivel: true
legivel: true
tamanho em bytes: 50
--------------------------
tempo execução em ms:
19


*/
