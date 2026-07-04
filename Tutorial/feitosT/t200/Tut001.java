package programa;

public class Tut001 {
	
	public static void main(String[] args) {
		long startTime = System.nanoTime();
		
        // métodos math
		// .acos(),.addExact(n1, n2),.asin(),.atan(),.atan2(),
		
		// raiz cubica
		System.out.println(Math.cbrt(4));
		System.out.println(Math.cbrt(9));
		System.out.println(Math.cbrt(27));
		
		
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
1.5874010519681996
2.080083823051904
3.0
--------------------------
tempo execução em ms: 0




*/
