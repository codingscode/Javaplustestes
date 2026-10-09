package programa;

import java.util.Scanner;

import servico.ServicoImpressora;

public class Teste1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		ServicoImpressora ps = new ServicoImpressora();

		System.out.print("quantos valores? ");
		int n = sc.nextInt();

		ps.adicValor("maria");

		for (int i = 0; i < n; i++) {
			int valor = sc.nextInt();
			ps.adicValor(valor);
		}

		ps.imprimir();
		Integer x = (Integer) ps.primeiro();
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
[maria, 4, 5, 6]
Exception in thread "main" java.lang.ClassCastException: class java.lang.String cannot be cast to class java.lang.Integer (java.lang.String and java.lang.Integer are in module java.base of loader 'bootstrap')
	at programa.Teste1.main(Teste1.java:25)





------------------------------------
generics permitem que classes, interfaces e métodos possam ser parametrizados por tipo. seus beneficios são:
reuso, type safety, performance
 
 uso comum: coleções
 
 
 
 
*/
