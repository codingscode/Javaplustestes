package programa;

public class Tut001 {
	
	public static void main(String[] args) {
		long startTime = System.nanoTime();
		
        // métodos math
		// converte graus para radianos
		System.out.println(Math.toRadians(57));
		System.out.println(Math.toRadians(180));
		System.out.println(Math.toRadians(45));
		System.out.println(Math.toRadians(-30));
		System.out.println(Math.toRadians(340));
		
		
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
0.9948376736367679
3.141592653589793
0.7853981633974483
-0.5235987755982988
5.934119456780721
--------------------------
tempo execução em ms: 0






*/
