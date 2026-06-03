package programa;

public class Tut001 {
	
	public static void main(String[] args) {
		
		// encapsular
		long startTime = System.nanoTime();

		Pessoa p = new Pessoa();
		
		p.nome = "Aladim"; // erro
		
		System.out.println(p.nome); // erro
		
		
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





*/
