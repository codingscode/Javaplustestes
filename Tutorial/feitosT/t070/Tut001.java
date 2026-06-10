package programa;

import java.io.FileWriter;
import java.io.IOException;

public class Tut001 {

	public static void main(String[] args) {
		long startTime = System.nanoTime();

		try {
			FileWriter escrever = new FileWriter("/home/mks/ProgX/Javeiro/ginastica/Tutorial/src/programa/arquivo.txt");
			escrever.write("testando!");
			escrever.close(); // must close manually
			System.out.println("escreveu com sucesso no arquivo.");
		}
		catch (IOException e) {
			System.out.println("ocorreu um erro.");
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
escreveu com sucesso no arquivo.
--------------------------
tempo execução em ms:
0














*/
