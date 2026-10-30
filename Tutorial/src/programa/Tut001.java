package programa;

public class Tut001 {

	
	public static void main(String[] args) {
		long startTime = System.nanoTime();

        
        try {
        	int a = 4;
        	String b = "oi";
        	int c = a + b;
        	System.out.println(c);
        }
        catch (Exception e) {
        	System.out.println("houve erro");
        }
		
		
		

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
