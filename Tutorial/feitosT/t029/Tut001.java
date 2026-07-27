package programa;

public class Tut001 {
	
	int idade;
	String nome;
	
	public Tut001(int i, String n) { // construtor
		idade = i;
		nome = n;
	}
	
	
	public static void main(String[] args) {
		
		// construtores
		long startTime = System.nanoTime();

		Tut001 objeto = new Tut001(10, "aladin");
		
		System.out.println(objeto.idade);
		System.out.println(objeto.nome);
		
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
10
aladin
--------------------------
tempo execução em ms:
0



*/
