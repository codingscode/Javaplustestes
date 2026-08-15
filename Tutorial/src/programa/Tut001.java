package programa;

public class Tut001 {
	
	
	public static void main(String[] args) {
		long startTime = System.nanoTime();
		
		String s1 = "sa";
		String s2 = "ba";
		String s3 = s1.concat(s2);
		
		System.out.print("s1: ");
		System.out.println(s1);
		System.out.print("s2: ");
		System.out.println(s2);
		System.out.print("s3: ");
		System.out.println(s3);
		
		
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
