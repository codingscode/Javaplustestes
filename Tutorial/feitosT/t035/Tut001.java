package programa;

public class Tut001 {
	
	public static void main(String[] args) {
		
		// construtores
		long startTime = System.nanoTime();

		Outra2 objeto = new Outra2();

		System.out.println("nome");
	    System.out.println(objeto.nome);
	    System.out.println("idade");
	    System.out.println(objeto.idade);
	    System.out.println("raça");
	    System.out.println(objeto.raca);
	    
	    objeto.latir(); // call abstract method
		
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
nome
Aladim
idade
8
raça
pinscher
au au
--------------------------
tempo execução em ms:
1




*/
