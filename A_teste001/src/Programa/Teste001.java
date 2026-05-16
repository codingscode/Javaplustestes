package Programa;

public class Teste001 {
	
	
	public static void main(String[] args) {
		long startTime = System.nanoTime();

		float num1 = 37;
		System.out.println("num1");
		System.out.println(num1);
		
		num1 /= 3;
		System.out.println("num1");
		System.out.println(num1);
		//System.out.printf("%.2f", num1);
		//System.out.println("");
		System.out.println("--------------------------");
		
		float num2 = 4.2f;
		System.out.println(Math.pow(num2, 3));
		
		
		System.out.println("--------------------------");
		String s1 = "camaleao";
		System.out.println("s1:");
		System.out.println(s1);
		
		System.out.println(s1.charAt(0));
		System.out.println(s1.charAt(1));
		
		s1 += " verde";
		System.out.println(s1);
		
		
		System.out.println("--------------------------");
				
		// Your code here
		long endTime = System.nanoTime();
		long duration = (endTime - startTime); // total time in nanoseconds

		//milliseconds
		System.out.println("Execution time: " + (duration / 1000000) + " ms");

	}
	

}

/*
continuar






*/
;