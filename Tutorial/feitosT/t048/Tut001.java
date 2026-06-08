package programa;

public class Tut001 {
	
	
	public static void main(String[] args) {
		long startTime = System.nanoTime();
		
		//
		/*
        classe abstrata: é uma classe restrita que nao pode ser usada para criar objetos
        (para acessa-la, ela deve ser herdada de outra classe)

        metodo abstrato: pode somente ser usado em uma classe abstrata, e nao tem um corpo.
        o corpo é fornecido pela subclasse (herdade de )
		*/
		Animal objeto = new Animal(); //erro

		
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
