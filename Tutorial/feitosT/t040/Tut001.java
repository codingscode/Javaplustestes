package programa;

public class Tut001 {
	
	
	public static void main(String[] args) {
		
		// polimorfismo
		long startTime = System.nanoTime();

		Animal meuanimal = new Animal();
		Animal cachorro = new Cachorro();
		Animal galinha = new Galinha();
		
		meuanimal.somAnimal();
		cachorro.somAnimal();
		galinha.somAnimal();
		
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
animal faz um som
cachorro faz au au
galinha faz cócó
--------------------------
tempo execução em ms:
0




*/
