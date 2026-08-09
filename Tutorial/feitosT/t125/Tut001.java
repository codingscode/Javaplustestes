package programa;

public class Tut001 {
	
		
	
	public static void main(String[] args) {
		long startTime = System.nanoTime();
		
		// Generics
		
		// cria uma classe Generic para guardar uma string
		Generico<String> str_generico = new Generico<>();
		
		str_generico.set("Olá");
		
		System.out.print("Valor: ");
		System.out.println(str_generico.get());

		// cria uma classe Generic para guardar um integer
		Generico<Integer> int_generico = new Generico<>();
		
		int_generico.set(50);
		
		System.out.print("Valor: ");
		System.out.println(int_generico.get());
		
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
