package programa;

public class Tut001 {
	

	public static void main(String[] args) {
		long startTime = System.nanoTime();
		
        // 
		String original = "masupial";
		String reverso = "";

		for (int i = 0; i < original.length(); i++) {
			reverso = original.charAt(i) + reverso; // ordem importa aqui
		}

		System.out.print("reverso: ");
		System.out.println(reverso);
		
		System.out.println("--------------------------");

		// Your code here
		long endTime = System.nanoTime(); // total time in nanoseconds
		long duration = (endTime - startTime) / 1000000;

		// milliseconds
		System.out.print("tempo execução em ms: ");
		System.out.println(duration);
	}

}

/*
reverso: laipusam
--------------------------
tempo execução em ms: 19





 
 
*/
