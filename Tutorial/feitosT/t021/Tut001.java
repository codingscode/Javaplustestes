package programa;

public class Tut001 {
	
	static int fatorial(int numero) {
		if (numero > 1) {
			return numero*fatorial(numero-1);
		}
		else {
			return 1;
		}
	}

	public static void main(String[] args) {
		
		// recursão -> função chama ela mesma

		long startTime = System.nanoTime();

		System.out.println(fatorial(5));
		
		
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
120
--------------------------
tempo execução em ms:
0



*/
