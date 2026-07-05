package programa;

public class Tut001 {
	
	public static void main(String[] args) {
		long startTime = System.nanoTime();
		
        // métodos math
		// 
		System.out.println(Math.random());
		
		int aleatorio = (int) (5*(Math.random())) + 1; // 1 a 5
		
		while (aleatorio != 5) {
			System.out.println(aleatorio);
			aleatorio = (int) (5*(Math.random())) + 1;
		}
		
		
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
0.4811034783044795
3
2
1
4
2
3
2
--------------------------
tempo execução em ms: 1






*/
