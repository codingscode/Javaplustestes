package programa;

public class Tut001 {
	
		
	public static void main(String[] args) {
		
		// classe

		long startTime = System.nanoTime();

		Valores obj1 = new Valores();
		Valores obj2 = new Valores();
		
		//modificando atributos da classe
		obj1.v1 = 4;
		obj1.v2 = 12;
		//obj1.v3 = 7; // dá erro
		
		System.out.println(obj1.v1);
		System.out.println(obj1.v2);
		System.out.println(obj1.v3);
		
		System.out.println(obj2.v1);
		System.out.println(obj2.v2);
		System.out.println(obj2.v3);
		
		
		System.out.println("--------------------------");

		// Your code here
		long endTime = System.nanoTime();
		long duration = (endTime - startTime) / 1000000; // total time in nanoseconds

		// milliseconds
		System.out.println("tempo execução em ms:");
		System.out.println(duration);

	}

}

/*
4
12
5

3
10
5

--------------------------
tempo execução em ms:
0



*/
