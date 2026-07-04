package programa;

public class Tut001 {
	
	public static void main(String[] args) {
		long startTime = System.nanoTime();
		
        // métodos para string
		// .toUpperCase(), .toLowerCase(), .toString(), .trim(), 
		
		char[] meu_array = {'b', 'a', 'c', 'a', 'n', 'a'};
		System.out.println(String.valueOf(meu_array));
		System.out.println(String.valueOf('A'));
		System.out.println(String.valueOf(true));
		System.out.println(String.valueOf(4.5f));
		System.out.println(String.valueOf(5.2));
		System.out.println(String.valueOf(12));
		System.out.println(String.valueOf(1400L));
		
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
bacana
A
true
4.5
5.2
12
1400
--------------------------
tempo execução em ms: 0
 
*/
