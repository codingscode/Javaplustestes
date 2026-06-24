package programa;

public class Tut001 {
	

	public static void main(String[] args) {
		long startTime = System.nanoTime();

		
        // numero reverso
		int numero = 9483;
		
		System.out.print("numero: ");
		System.out.println(numero);
		
		String paraString = String.valueOf(numero);
		String temp = "";
		
		for (int i=paraString.length()-1; i>=0;i--) {
			temp += paraString.charAt(i);
		}
		
		numero = Integer.parseInt(temp);
		
		System.out.print("numero: ");
		System.out.println(numero);
		

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
numero: 9483
numero: 3849
--------------------------
tempo execução em ms: 20







 
 
*/
