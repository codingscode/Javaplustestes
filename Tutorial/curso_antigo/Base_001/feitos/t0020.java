package programa;

public class Teste1 {

	public static void main(String[] args) {
		
		double preco = 15.00;
		int quantidade = 30;
		double total;
		
		// ternário
		total = (quantidade < 18) ? preco*quantidade : 0.85*preco*quantidade;
		
		
		System.out.println("o total é : " + total);
		
	}

}
/*
o total é : 382.5



*/
