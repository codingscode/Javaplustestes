package programa;

import java.util.Scanner;

import servico.ServicoImpressora;

public class Teste1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		ServicoImpressora<String> ps = new ServicoImpressora();

		System.out.print("quantos valores? ");
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			String valor = sc.next();
			ps.adicValor(valor);
		}

		ps.imprimir();
		String x = ps.primeiro();
		System.out.println("primeiro: " + x);

		sc.close();

		System.out.println();
	}

}
/*
quantos valores? 3
aladin
mel
lily
[aladin, mel, lily]
primeiro: aladin





------------------------------------
generics permitem que classes, interfaces e métodos possam ser parametrizados por tipo. seus beneficios são:
reuso, type safety, performance
 
uso comum: coleções
 



*/
