package programa;

public class Tut001 {
	

	public static void main(String[] args) {
		long startTime = System.nanoTime();
		
        // remover vogais de uma string
		String texto = "como vai Java";
		String resultado = texto.replaceAll("[aeiouAEIOU]", "");

		System.out.println(resultado);
		
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
cm v Jv
--------------------------
tempo execução em ms: 0





 
 
*/
