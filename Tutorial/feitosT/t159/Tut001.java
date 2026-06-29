package programa;

public class Tut001 {
	

	public static void main(String[] args) {
		long startTime = System.nanoTime();
		
        // remover espaço em branco
		String texto = "  estrada bonita     ";
		String aparado = texto.trim();

		System.out.println(aparado);

		
		
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
estrada bonita
--------------------------
tempo execução em ms: 0




 
 
*/
