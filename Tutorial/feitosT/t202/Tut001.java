package programa;

public class Tut001 {
	
	public static void main(String[] args) {
		long startTime = System.nanoTime();
		
        // métodos math
		// .cos(),.cosh(),
		
		// numero neperiano e elevado um numero tal
		System.out.println(Math.exp(0));
		System.out.println(Math.exp(1));
		System.out.println(Math.exp(2));
		System.out.println(Math.exp(4.8));
		System.out.println(Math.exp(Math.E)); // Math.E numero neperiano tambem
		
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
1.0
2.718281828459045
7.38905609893065
121.51041751873485
15.154262241479262
--------------------------
tempo execução em ms: 0




*/
