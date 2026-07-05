package programa;

public class Tut001 {
	
	public static void main(String[] args) {
		long startTime = System.nanoTime();
		
        // métodos math
		// .signum(), converte radianos para graus
		System.out.println(Math.toDegrees(1));
		System.out.println(Math.toDegrees(Math.PI));
		System.out.println(Math.toDegrees(Math.PI / 4));
		System.out.println(Math.toDegrees(-0.5236));
		System.out.println(Math.toDegrees(6));
		
		
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
57.29577951308232
180.0
45.0
-30.0000701530499
343.77467707849394
--------------------------
tempo execução em ms: 0






*/
