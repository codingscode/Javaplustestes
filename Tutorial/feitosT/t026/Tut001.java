package programa;

public class Tut001 {
	
	
	public static void main(String[] args) {
		
		// classe
		
		long startTime = System.nanoTime();

		Outra objeto = new Outra();
		
		objeto.saudacao();
		System.out.println(objeto.valor(7));
		
		
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
olá legal
7
--------------------------
tempo execução em ms:
0


*/
