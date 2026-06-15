package programa;

public class Tut001 {

	public static void main(String[] args) {
		long startTime = System.nanoTime();

		// Generics
		
		// cria uma classe Generic para guardar uma string
		Generic<String> stringGeneric = new Generic<>();
		stringGeneric.set("Olá");
		System.out.print("Valor: ");
	    System.out.println(stringGeneric.get());

	    // cria uma classe Generic para guardar um integer
	    Generic<Integer> intGeneric = new Generic<>();
	    intGeneric.set(50);
	    System.out.print("Valor: ");
	    System.out.println(intGeneric.get());
		

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
Valor: Olá
Valor: 50
--------------------------
tempo execução em ms:
0







*/
