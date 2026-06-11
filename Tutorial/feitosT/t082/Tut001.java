package programa;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Tut001 {

	public static void main(String[] args) {
		long startTime = System.nanoTime();

		try (BufferedReader br = new BufferedReader(new FileReader("/home/mks/ProgX/Javeiro/ginastica/Tutorial/src/programa/arquivo.txt"))) {
			String linha;
			while ((linha = br.readLine()) != null) {
				System.out.println(linha);
			}
		}
		catch (IOException e) {
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
2ª linha
fim!
--------------------------
tempo execução em ms:
1




*/
