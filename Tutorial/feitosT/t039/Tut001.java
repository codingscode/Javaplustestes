package programa;

public class Tut001 extends Veiculo{
	
	private String nomeModelo = "Mustang"; // atributo
	
	public static void main(String[] args) {
		
		// herança
		long startTime = System.nanoTime();

		
		Tut001 objeto = new Tut001();
		
		objeto.buzinar();
		
		System.out.println("marca:");
		System.out.println(objeto.marca);
		System.out.println("nome modelo:");
		System.out.println(objeto.nomeModelo);
				
		System.out.println("--------------------------");

		// Your code here
		long endTime = System.nanoTime();
		long duration = (endTime - startTime)/1000000; // total time in nanoseconds

		// milliseconds
		System.out.println("tempo execução em ms:");
		System.out.println(duration);
		
		
	}

}

/*
Tuut, tuut!
marca:
Ford
nome modelo:
Mustang
--------------------------
tempo execução em ms:
0


*/
