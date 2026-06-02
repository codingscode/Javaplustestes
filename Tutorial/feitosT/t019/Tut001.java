package programa;

public class Tut001 {
	
	static int somar(int n1, int n2) {
		return n1 + n2;
	}
	
	static double somar(double n1, double n2) {
		return n1 + n2; 
	}
	
	static float somar(float n1, float n2) {
		return n1 + n2; 
	}

	public static void main(String[] args) {
		
		// overloading -> funções com mesmo nome

		long startTime = System.nanoTime();

		int res1 = somar(3, 4);
		double res2 = somar(3.34, 4.21);
		float res3 = somar(3.656f, 4.52f);
		
		System.out.println(res1);
		System.out.println(res2);
		System.out.println(res3);
		
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
7
7.55
8.176
--------------------------
tempo execução em ms:
0





*/
