package programa;

public class Tut001 {
	
	public static void main(String[] args) {
		
		// construtores
		long startTime = System.nanoTime();

		Pessoa objeto = new Pessoa();
		
		System.out.println(objeto.nome);
		//System.out.println(objeto.idade); // nao é visivel
		
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
null
--------------------------
tempo execução em ms:
0



*/
