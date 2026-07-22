package programa;

public class Tut001 {
	
	public static void main(String[] args) {
		long startTime = System.nanoTime();
		
        // 
		// 
		int[] fonte = {10, 20, 30, 40, 50, 60};
        int[] destino = new int[4]; // Must be initialized first

        // Copy elements 30, 40, 50 (indices 2, 3, 4) into destination starting at index 1
        System.arraycopy(fonte, 2, destino, 1, 3);

        // Print destination contents: [0, 30, 40, 50]
        for (int cada : destino) {
            System.out.println(cada);
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
0
30
40
50
--------------------------
tempo execução em ms: 0





*/
