package programa;

public class Tut001 {
	
	final int x = 10;
	final double PI = 3.14;
	
	
	public static void main(String[] args) {
		long startTime = System.nanoTime();
		
        // 
		// 
		
		Tut001 objeto = new Tut001();
		//objeto.x = 50; // err
		//objeto.PI = 25; // erro
		System.out.println(objeto.x);

		
		
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
