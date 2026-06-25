package programa;

public class Tut001 {
	

	public static void main(String[] args) {
		long startTime = System.nanoTime();
		
        // contar vogais
		String texto = "ola Java";
		int contador = 0;

		for (char c : texto.toLowerCase().toCharArray()) {
		  if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
			  contador++;
		  }
		}

		System.out.print("vogais: ");
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
vogais: 4
--------------------------
tempo execução em ms: 0





 
 
*/
