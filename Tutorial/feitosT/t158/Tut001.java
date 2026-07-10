package programa;

public class Tut001 {
	

	public static void main(String[] args) {
		long startTime = System.nanoTime();
		
        // converter string para array
		String string1 = "borboleta linda";
		
		char[] meu_array = string1.toCharArray();
		
		System.out.println(meu_array);
		System.out.println(meu_array[0]);
		System.out.println(meu_array[1]);
		
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
borboleta linda
b
o
--------------------------
tempo execução em ms: 0




 
 
*/
