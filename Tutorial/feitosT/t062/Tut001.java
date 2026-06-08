package programa;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Tut001 {
	
	public static void main(String[] args) {
		long startTime = System.nanoTime();
		
		
		LocalDateTime objeto = LocalDateTime.now();
		System.out.println("antes de formatar: " + objeto);
		DateTimeFormatter formatado = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
		
		String dataFormatada = formatado.format(objeto);
		System.out.println("depois de formatar: " + dataFormatada);
		
		System.out.println("--------------------------");

		// Your code here
		long endTime = System.nanoTime();
		long duration = (endTime - startTime)/1000000; // total time in nanoseconds

		// milliseconds
		System.out.println("tempo execução em ms:");
		System.out.println(duration);
		
	}

}

/*
antes de formatar: 2026-06-08T10:28:01.914422063
depois de formatar: 08-06-2026 10:28:01
--------------------------
tempo execução em ms:
36








*/
