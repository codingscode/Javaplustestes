package programa;

public class Tut001 {
	public static void main(String[] args) {

		long startTime = System.nanoTime();

		int dia = 4;
		
		switch (dia) {
		  case 1:
		    System.out.println("segunda");
		    break;
		  case 2:
		    System.out.println("terca");
		    break;
		  case 3:
		    System.out.println("quarta");
		    break;
		  case 4:
		    System.out.println("quinta");
		    break;
		  case 5:
		    System.out.println("sexta");
		    break;
		  case 6:
		    System.out.println("sabado");
		    break;
		  case 7:
		    System.out.println("domingo");
		    break;
		  default:
			System.out.println("nenhum");
		}

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
quinta
--------------------------
tempo execução em ms:
0



*/
