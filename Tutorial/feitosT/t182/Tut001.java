package programa;

public class Tut001 {
	
	public static void main(String[] args) {
		long startTime = System.nanoTime();
		
        // strings
		//
		String s1 = "aladim";
		String s2 = "mel";
		String s3 = "Aladim";
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
		System.out.println( (s1.hashCode()) == (s2.hashCode()) );
		System.out.println( (s1.hashCode()) == (s3.hashCode()) );
		
		
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
-1415210190
107988
1963624274
false
false
--------------------------
tempo execução em ms: 0





 
 
*/
