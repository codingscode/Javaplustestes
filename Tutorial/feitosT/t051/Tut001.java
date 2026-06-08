package programa;

public class Tut001 {
	
	
	public static void main(String[] args) {
		long startTime = System.nanoTime();
		
		// interface

		ClasseDemo objeto = new ClasseDemo();
		objeto.meuMetodo();
		objeto.outroMetodo();

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
algum texto...
algum outro texto...
--------------------------
tempo execução em ms:
1



*/
