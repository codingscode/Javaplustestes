package programa;

public class Tut001 {
	
	public static void main(String[] args) {
		long startTime = System.nanoTime();
		
        // métodos math
		// logaritmo natural
		System.out.println(Math.log(6));
		System.out.println(Math.log(Math.E));
		System.out.println(Math.log(2));
		System.out.println(Math.log(1));
		System.out.println(Math.log(0));
		System.out.println(Math.log(-1));
		
		
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
1.791759469228055
1.0
0.6931471805599453
0.0
-Infinity
NaN
--------------------------
tempo execução em ms: 0






*/
