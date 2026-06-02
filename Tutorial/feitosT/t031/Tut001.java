package programa;

public class Tut001 {
	
	int idade;
	String nome;
	
	public Tut001(String nome) {
		this(20, nome); // idade padrão
	}
	
	public Tut001(int idade, String nome) {
		this.idade = idade;
		this.nome = nome;
	}
	
	public void informacao() {
		System.out.println(idade);
		System.out.println(nome);
	}
	
	
	public static void main(String[] args) {
		
		// construtores
		long startTime = System.nanoTime();

		Tut001 pet1 = new Tut001("aladin");
		Tut001 pet2 = new Tut001(14, "mel");
		
		pet1.informacao();
		pet2.informacao();
		
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
20
aladin
14
mel
--------------------------
tempo execução em ms:
0




*/
