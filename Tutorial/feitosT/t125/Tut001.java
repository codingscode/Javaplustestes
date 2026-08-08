package programa;

public class Tut001 {
	
		
	
	public static void main(String[] args) {
		long startTime = System.nanoTime();
		
		// Generics
		
		// cria uma classe Generic para guardar uma string
		Generico<String> stringGeneric = new Generico<>();
		
		stringGeneric.set("Olá");
		
		System.out.print("Valor: ");
		System.out.println(stringGeneric.get());

		// cria uma classe Generic para guardar um integer
		Generico<Integer> intGeneric = new Generico<>();
		
		intGeneric.set(50);
		
		System.out.print("Valor: ");
		System.out.println(intGeneric.get());
		
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
Valor: Olá
Valor: 50
--------------------------
tempo execução em ms: 0










*/
