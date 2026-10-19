package programa;

public class Tut001 {

	
	public static void main(String[] args) {
		long startTime = System.nanoTime();

		int a = 4;
		int b = 2;
		
        String res = a > b ? "maior" : "menor";
        
        
		
		System.out.println(res);
		
		

		

		System.out.println("--------------------------");

		// Your code here
		long endTime = System.nanoTime(); // total time in nanoseconds
		long duration = (endTime - startTime);

		// milliseconds
		System.out.print("tempo execução em ns: ");
		System.out.println(duration);
	}

}

/*








 
 
 
*/
