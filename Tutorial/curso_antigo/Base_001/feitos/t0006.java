package programa;

import java.util.Locale;

public class Teste1 {

	public static void main(String[] args) {
	   Locale.setDefault(Locale.US);

	   String nome = "maria";
	   int idade = 23;
	   double renda = 2000.0;
	   
	   System.out.printf("%s tem %d anos e ganha R$ %.2f %n", nome, idade, renda);
	   
	}

}
