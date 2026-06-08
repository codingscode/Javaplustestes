package programa;

public class Tut001 {
	
	public static void main(String[] args) {
		long startTime = System.nanoTime();
		
		// java erros
		try {
			int[] numeros = {1, 2, 3};
			System.out.println(numeros[5]);
		}
		catch (Exception erro) {
			System.out.println("há erro");
		}
		
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
há erro
--------------------------
tempo execução em ms:
0










*/
