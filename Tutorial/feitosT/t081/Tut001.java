package programa;

import java.io.FileOutputStream;
import java.io.IOException;

public class Tut001 {

	public static void main(String[] args) {
		long startTime = System.nanoTime();

		
		String texto = "\ntexto acrescentado!";

	    // true = append mode (keeps existing content)
	    try (FileOutputStream saida = new FileOutputStream("/home/mks/ProgX/Javeiro/ginastica/Tutorial/src/programa/arquivo.txt", true)) {
	       saida.write(texto.getBytes());
	       System.out.println("acrescentado ao arquivo com sucesso.");
	    }
	    catch (IOException e) {
	       System.out.println("erro ao escrever no arquivo.");
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
acrescentado ao arquivo com sucesso.
--------------------------
tempo execução em ms:
0










*/
