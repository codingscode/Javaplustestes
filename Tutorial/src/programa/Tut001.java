package programa;

public class Tut001 {
	
	public static void main(String[] args) {
		long startTime = System.nanoTime();
		
        
        String s1 = "macaco na arvore, macaco quer banana na";
		
		System.out.println(s1.lastIndexOf("macaco")); // ultima ocorrencia
		System.out.println(s1.lastIndexOf("n")); // " ultimo n nos 10 primeiros
		        
        
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













*/
