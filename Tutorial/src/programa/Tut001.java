package programa;

public class Tut001 {

	public static void main(String[] args) {
		long startTime = System.nanoTime();

		// Generics
		// Create a Box to hold a String
		Generic<String> stringBox = new Generic<>();
	    stringBox.set("Hello");
	    System.out.println("Value: " + stringBox.get());

	    // Create a Box to hold an Integer
	    Generic<Integer> intBox = new Generic<>();
	    intBox.set(50);
	    System.out.println("Value: " + intBox.get());
		
		

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
