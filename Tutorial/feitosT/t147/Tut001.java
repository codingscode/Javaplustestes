package programa;

public class Tut001 {
	

	public static void main(String[] args) {
		long startTime = System.nanoTime();
		
        // 
		int numero = 3;
		
		float valor = (float) Math.sqrt(numero);
		
		System.out.println(valor);

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
1.7320508
--------------------------
tempo execução em ms: 0







 
 
*/
