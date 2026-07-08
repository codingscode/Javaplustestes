package programa;

public class Tut001 {
	
	public static void main(String[] args) {
		long startTime = System.nanoTime();
		
        // 
		// 
		// trocar duas variaveis
		int a = 5;
		int b = 3;
		int temp;
			
		System.out.print("a: ");
		System.out.print(a);
		System.out.print(", b: ");
		System.out.println(b);
				
		temp = b;
		b = a;
		a = temp;
				
		System.out.print("a: ");
		System.out.print(a);
		System.out.print(", b: ");
		System.out.println(b);
		
		
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
a: 5, b: 3
a: 3, b: 5
--------------------------
tempo execução em ms: 0









*/
