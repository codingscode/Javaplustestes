package programa;

public class Tut001 {

	public static void main(String[] args) {
		long startTime = System.nanoTime();

		// java erros
		try {
			int[] numeros = { 1, 2, 3 };
			System.out.println(numeros[10]); // ArrayIndexOutOfBoundsException
			int resultado = 10 / 0; // ArithmeticException
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("indice de array nao existe.");
		}
		catch (ArithmeticException e) {
			System.out.println("nao pode dividir por zero.");
		}
		catch (Exception erro) {
			System.out.println("algo errado.");
		}

		System.out.println("--------------------------");

		// Your code here
		long endTime = System.nanoTime();
		long duration = (endTime - startTime) / 1000000; // total time in nanoseconds

		// milliseconds
		System.out.println("tempo execução em ms:");
		System.out.println(duration);

	}

}

/*
indice de array nao existe.
--------------------------
tempo execução em ms:
0



*/
