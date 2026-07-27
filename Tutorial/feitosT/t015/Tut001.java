package programa;

import java.util.Arrays;

public class Tut001 {

	public static void main(String[] args) {

		long startTime = System.nanoTime();

		String nomes[] = {"mário", "pietro", "laisa", "oto"};
		
		System.out.println(Arrays.toString(nomes));
		System.out.println(nomes.length);
		System.out.println(nomes[0]);
		System.out.println(nomes[1]);
		
		nomes[0] = "josé";
		System.out.println(Arrays.toString(nomes));
		
		
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
0
1
2
3
5
6
--------------------------
tempo execução em ms:
0


*/
