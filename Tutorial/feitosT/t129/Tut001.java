package programa;



class Animal {
	  void fazSom() {
		  System.out.println("Animal som");
	  }
}

class Cachorro extends Animal {
	@Override
	void fazsom() { // erro
		System.out.println("Woof!");
	}
}


public class Tut001 {

	public static void main(String[] args) {
		long startTime = System.nanoTime();

		// Annotations
		// exemplos: @Override, @Deprecated, @SuppressWarnings
		Animal metPet = new Cachorro();
		metPet.fazSom();

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
Animal som
--------------------------
tempo execução em ms:
0








*/
