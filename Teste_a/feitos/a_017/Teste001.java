package Programa;

public class Teste001 {
	
	public static boolean presente(int[] l, int e) {
		boolean b = false;
		for (int cada : l) {
			if (e == cada) {
				b = b || true;
			}
		}
		return b;
	}
	
	public static void main(String[] args) {
		long startTime = System.nanoTime();
		
		int num1 = 3, num2 = 6, num3 = 7, num4 = 5;
		
		int lista[] = {2, 3, 5, 8, 3, 10};
		
		System.out.println(presente(lista, num1));
		System.out.println(presente(lista, num2));
		System.out.println(presente(lista, num3));
		System.out.println(presente(lista, num4));
		
		System.out.println("--------------------------");
		
		System.out.println("--------------------------");
				
		// Your code here
		long endTime = System.nanoTime();
		long duration = (endTime - startTime)/1000000; // total time in nanoseconds

		//milliseconds
		System.out.println("tempo execução em ms:");
		System.out.println(duration);

	}
	

}

/*
criar código para ver um se um numero está presente em um array int
true
false
false
true
--------------------------
--------------------------
tempo execução em ms:
0


*/
;