package programa;

public class Tut001 {
	public static void main(String[] args) {

		long startTime = System.nanoTime();

		int num = 1;
		
		do {
			System.out.println(num);
			num += 1;
		}
		while (num <6 );
		
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
