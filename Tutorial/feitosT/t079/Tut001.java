package programa;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Tut001 {

	public static void main(String[] args) {
		long startTime = System.nanoTime();

	    String texto = "olá isto aqui é um texto!";

	    // try-with-resources: stream will be closed automatically
	    try (FileOutputStream saida = new FileOutputStream("./src/programa/texto.txt")) {
	    	saida.write(texto.getBytes());  // convert text to bytes and write
	        System.out.println("escreveu no arquivo com sucesso.");
	    }
	    catch (IOException e) {
	      System.out.println("erro ao escrever arquivo.");
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
escreveu no arquivo com sucesso.
--------------------------
tempo execução em ms:
0







*/
