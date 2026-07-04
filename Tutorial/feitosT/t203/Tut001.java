package programa;

public class Tut001 {
	
	public static void main(String[] args) {
		long startTime = System.nanoTime();
		
        // métodos math
		//
		
		// arredonda para o inteiro abaixo
		System.out.println(Math.floor(0.60));
		System.out.println(Math.floor(0.40));
		System.out.println(Math.floor(5));
		System.out.println(Math.floor(5.1));
		System.out.println(Math.floor(-5.1));
		System.out.println(Math.floor(-5.9));
		
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
0.0
0.0
5.0
5.0
-6.0
-6.0
--------------------------
tempo execução em ms: 0




*/
