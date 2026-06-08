package programa;

public class Tut001 {
	
	enum Nivel {
		BAIXO,
		MEDIO,
		ALTO
	}
	
	
	public static void main(String[] args) {
		long startTime = System.nanoTime();
		
		// Enum
		Nivel variavel = Nivel.MEDIO;
		
		System.out.println(variavel);

		System.out.println("--------------------------");

		// Your code here
		long endTime = System.nanoTime();
		long duration = (endTime - startTime)/1000000; // total time in nanoseconds

		// milliseconds
		System.out.println("tempo execução em ms:");
		System.out.println(duration);
		
		
	}

}

/*
MEDIO
--------------------------
tempo execução em ms:
0



*/
