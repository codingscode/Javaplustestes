package programa;

public class Tut001 {
	
	public static void main(String[] args) {
		long startTime = System.nanoTime();
		
        // strings
		//
		
		char[] um_array = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
		System.out.println(um_array);

		String uma_string = "abacatesverdes";
		uma_string.getChars(7, 12, um_array, 4);
		
		System.out.println(um_array);				
		
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
0123456789
0123sverd9
--------------------------
tempo execução em ms: 0





 
 
*/
