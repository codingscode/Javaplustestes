package programa;

public class Tut001 {
	
	public static void main(String[] args) {
		long startTime = System.nanoTime();
		
        // 
		// 
        
        int valor = 1 + (int) (Math.random()*5 );
        
        while (valor != 1) {
        	System.out.println(valor);
        	valor = 1 + (int) (Math.random()*5 );
        }
        
        
		
		
        System.out.println("");
		
		
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
