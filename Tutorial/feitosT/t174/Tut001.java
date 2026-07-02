package programa;

public class Tut001 {
	
	public static void main(String[] args) {
		long startTime = System.nanoTime();
		
        // strings
		String string1 = "bacana";
		String string2 = "BaCana";
		String string3 = "aladim";
		System.out.println(string1.compareToIgnoreCase(string2)); // desc caixa alta baixa, 0 se iguais
		System.out.println(string1.compareToIgnoreCase(string3));
		
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
0
1
--------------------------
tempo execução em ms: 0




 
 
*/
