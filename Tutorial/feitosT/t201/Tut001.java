package programa;

public class Tut001 {
	
	public static void main(String[] args) {
		long startTime = System.nanoTime();
		
        // métodos math
		// .acos(),.addExact(n1, n2),.asin(),.atan(),.atan2(),
		
		// arredonda para o numero superior
		System.out.println(Math.ceil(0.60));
		System.out.println(Math.ceil(0.40));
		System.out.println(Math.ceil(5));
		System.out.println(Math.ceil(5.1));
		System.out.println(Math.ceil(-5.1));
		System.out.println(Math.ceil(-5.9));
		
		
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
1.0
5.0
6.0
-5.0
-5.0
--------------------------
tempo execução em ms: 0




*/
