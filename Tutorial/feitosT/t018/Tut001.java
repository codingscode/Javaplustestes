package programa;

public class Tut001 {

	public static void main(String[] args) {

		long startTime = System.nanoTime();

		int numeros[][] = {
				{1,2,3},
				{4,5,6},
				{7,8,9}
		};

		System.out.println(numeros[1][2]);
		System.out.println("--------------------------");
		
		for (int[] linha : numeros) {
			for (int cada : linha) {
				System.out.println(cada);
			}
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





*/
