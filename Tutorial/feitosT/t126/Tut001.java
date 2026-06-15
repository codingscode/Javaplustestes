package programa;

public class Tut001 {

	public static void main(String[] args) {
		long startTime = System.nanoTime();

		// Generics
		
		 // Array de Strings
	    String[] nomes = {"aladim", "mel", "lily", "fiona"};

	    // Array de Integers
	    Integer[] numeros = {4, 5, 6, 7};

	    // Call the generic method with both arrays
	    Generico.imprimirArray(nomes);
	    System.out.println("************************");
	    Generico.imprimirArray(numeros);
		

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
aladim
mel
lily
fiona
************************
4
5
6
7
--------------------------
tempo execução em ms:
0











*/
