package programa;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Tut001 {

	public static void main(String[] args) {
		long startTime = System.nanoTime();

		// true = append mode
		try (BufferedWriter bw = new BufferedWriter(new FileWriter("./src/programa/arquivo.txt", true))) {
			bw.newLine();
			bw.write("linha acrescentada");
			System.out.println("escreveu no arquivo com sucesso.");
		}
		catch (IOException e) {
			System.out.println("erro ao escrever arquivo.");
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
