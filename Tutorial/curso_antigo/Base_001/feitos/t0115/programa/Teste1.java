package programa;

import java.util.Locale;
import java.util.Scanner;

import servicos.ServicoJurosBrasil;


public class Teste1 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		//quantidade
		double quantidade = 200;
		int meses = 3;

		ServicoJurosBrasil obj = new ServicoJurosBrasil(2.0);
		double pagamento = obj.pagamento(quantidade, meses);

		System.out.println("pagamento depois de " + meses + " meses:");
		System.out.println(String.format("%.2f", pagamento));

		sc.close();

		System.out.println();
	}

}
/*
pagamento depois de 3 meses:
212.24

 
 
https://github.com/acenelio/interfaces5-java 
------------------------------------
default methods
 
 
 
*/
