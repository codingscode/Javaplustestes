package programa;

import java.util.Locale;

import servicos.ServicoJuros;
import servicos.ServicoJurosEua;

public class Teste1 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		//quantidade
		double quantidade = 200;
		int meses = 3;

		ServicoJuros obj = new ServicoJurosEua(1.0);
		double pagamento = obj.pagamento(quantidade, meses);

		System.out.println("pagamento depois de " + meses + " meses:");
		System.out.println(String.format("%.2f", pagamento));

		System.out.println();
	}

}
/*
pagamento depois de 3 meses:
206.06

 
 
https://github.com/acenelio/interfaces5-java 
------------------------------------
default methods
 
 
 
*/
