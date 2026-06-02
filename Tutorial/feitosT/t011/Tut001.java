package programa;

public class Tut001 {
	public static void main(String[] args) {

		long startTime = System.nanoTime();

		int[] lista = {5, 2, 7, 4};

		for (int cada : lista) {
			System.out.println(cada);
		}
		
		
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
1
2
3
4
5
--------------------------
tempo execução em ms:
0



*/
