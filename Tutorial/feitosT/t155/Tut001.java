package programa;

public class Tut001 {
	

	public static void main(String[] args) {
		long startTime = System.nanoTime();
		
        // contar digitos em uma string
		String texto = "W3Schools was founded in 1998";
		int contador = 0;

		for (char c : texto.toCharArray()) {
		  if (Character.isDigit(c)) {
			  contador++;
		  }
		}

		System.out.print("Digitos: ");
		System.out.println(contador);
		
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
Digitos: 5
--------------------------
tempo execução em ms: 0





 
 
*/
