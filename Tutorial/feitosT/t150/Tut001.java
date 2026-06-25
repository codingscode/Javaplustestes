package programa;

public class Tut001 {
	

	public static void main(String[] args) {
		long startTime = System.nanoTime();
		
        // numero aleatorio
		double numero = Math.random(); // 0.0 (inclusive), and 1.0 (exclusive)
		
		int inteiro = (int)(Math.random() * 21); // 0 to 20
		
		while (inteiro != 20) {
			System.out.println(inteiro);
			inteiro = (int)(Math.random() * 21);
		}
		
		
		// System.out.println(numero);
		System.out.println(inteiro);

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
18
1
4
11
12
15
2
11
14
9
1
19
4
3
5
15
20
--------------------------
tempo execução em ms: 1

 
 
*/
