package programa;

public class Tut001 {

	static void checarIdade(int idade) {
		if (idade < 18) {
			throw new ArithmeticException("acesso negado, vc deve ter pelo menos 18 anos.");
		}
		else {
			System.out.println("acesso concedido, vc é velho o suficiente");
		}
	}

	public static void main(String[] args) {
		long startTime = System.nanoTime();

		// java erros
		checarIdade(15);

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
Exception in thread "main" java.lang.ArithmeticException: acesso negado, vc deve ter pelo menos 18 anos.
	at programa.Tut001.checarIdade(Tut001.java:7)
	at programa.Tut001.main(Tut001.java:18)













*/
