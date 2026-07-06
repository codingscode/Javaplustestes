package programa;

public class Tut001 {
	
	public static void main(String[] args) {
		long startTime = System.nanoTime();
		
        // arrays metodos
		// 
		
		int[] numeros = {10, 4, 2, 7};
		int comprimento = numeros.length;
		
		System.out.println(comprimento);
		
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
4
--------------------------
tempo execução em ms: 0






*/
