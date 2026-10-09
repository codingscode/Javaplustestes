package programa;

import java.util.Scanner;

import servico.ServicoImpressora;

public class Teste1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		ServicoImpressora<Integer> ps = new ServicoImpressora();

		System.out.print("quantos valores? ");
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			int valor = sc.nextInt();
			ps.adicValor(valor);
		}

		ps.imprimir();
		Integer x = ps.primeiro();
		System.out.println("primeiro: " + x);

		sc.close();

		System.out.println();
	}

}
/*
quantos valores? 3
4
5
6
[4, 5, 6]
primeiro: 4



------------------------------------
generics permitem que classes, interfaces e métodos possam ser parametrizados por tipo. seus beneficios são:
reuso, type safety, performance
 
uso comum: coleções
 
 
 
 
*/
