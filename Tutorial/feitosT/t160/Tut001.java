package programa;

public class Tut001 {
	

	public static void main(String[] args) {
		long startTime = System.nanoTime();
		
        // remover espaço em branco
		String texto = "  estrada bonita     ";
		String semespaco = texto.replaceAll("\\s+", "");

		System.out.println(semespaco);

		
		
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
estradabonita
--------------------------
tempo execução em ms: 8




 
 
*/
