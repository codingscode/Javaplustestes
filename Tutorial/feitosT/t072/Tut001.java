package programa;

import java.io.FileWriter;
import java.io.IOException;

public class Tut001 {

	public static void main(String[] args) {
		long startTime = System.nanoTime();

		// true = append mode
		try ( FileWriter escrever = new FileWriter("./src/programa/arquivo.txt", true) ) {
			escrever.write("adicionando mais!");
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

















*/
