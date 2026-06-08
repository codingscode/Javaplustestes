package programa;

public class Tut001 {
	
	
	
	
	public static void main(String[] args) {
		long startTime = System.nanoTime();
		
		// Enum construtor
		for (Nivel cada : Nivel.values()) {
			System.out.print(cada);
			System.out.print(": ");
			System.out.println(cada.getDescricao());
		}
		
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
BAIXO: baixo nivel
MEDIO: medio nivel
ALTO: alto nivel
--------------------------
tempo execução em ms:
0








*/
