package Programa;

public class Teste001 {
	

	
	public static void main(String[] args) {
		long startTime = System.nanoTime();
		
		int num1 = 3;
		int exp1 = 4;
		double res1 = Math.pow(num1, exp1);
				
		System.out.println(res1);

		int num2 = 12;
		float exp2 = 0.5f;
		float res2 = (float) Math.pow(num2, exp2);
		System.out.println(res2);

		System.out.println("--------------------------");
		
		System.out.println("--------------------------");
				
		// Your code here
		long endTime = System.nanoTime();
		long duration = (endTime - startTime)/1000000; // total time in nanoseconds

		//milliseconds
		System.out.println("tempo execução em ms:");
		System.out.println(duration);

	}
	

}

/*
criar código potencialização 
81.0
3.4641016
--------------------------
--------------------------
tempo execução em ms:
0





*/
;