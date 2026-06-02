package programa;

public class Tut001 {
	
	public static void main(String[] args) {
		
		// construtores
		long startTime = System.nanoTime();

		for (int i = 0; i < 10; i++) {
			if (i == 4) {
			   continue; // só pula esse
			}
			if (i == 7) {
				break; // para
			}
			System.out.println(i);
		}

		
		System.out.println("--------------------------");

		// Your code here
		long endTime = System.nanoTime();
		long duration = (endTime - startTime)/1000000; // total time in nanoseconds

		// milliseconds
		System.out.println("tempo execução em ms:");
		System.out.println(duration);

	}

}

/*
0
1
2
3
5
6
--------------------------
tempo execução em ms:
0







*/
