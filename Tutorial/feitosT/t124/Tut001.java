package programa;

public class Tut001 {

	public static void main(String[] args) {
		long startTime = System.nanoTime();

		// Wrapper Class -> Integer, Character, Double, Boolean...
		// Primitive Data Type -> int, char, double, boolean...

		Integer inteiro = 100;
		
	    String umaString = inteiro.toString();
	    
	    System.out.println(umaString);
	    
	    System.out.println(umaString.length());
		
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
100
3
--------------------------
tempo execução em ms:
0






*/
