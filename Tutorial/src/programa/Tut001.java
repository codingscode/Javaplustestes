package programa;


interface FuncaoString {
	String executar(String str);
}

public class Tut001 {
	
	public static void imprimirFormatado(String str, FuncaoString formato) {
	    String resultado = formato.executar(str);
	    System.out.println(resultado);
	}
	
	public static void main(String[] args) {
		long startTime = System.nanoTime();
		
		// lambda
		
		FuncaoString exclamacao = (s) -> s + "!";
				
		FuncaoString pergunta = (s) -> s + "?";
		
		imprimirFormatado("Olá", exclamacao);
		
		imprimirFormatado("Olá", pergunta);
		
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
Olá!
Olá?
--------------------------
tempo execução em ms: 10






*/
