package programa;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;


public class Teste1 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		List<String> lista = new ArrayList<>() ; // ArrayList implementa List
		
		lista.add("aladin");
		lista.add("mel");
		lista.add("lili");
		lista.add("liu");
		lista.add(2, "silas"); //adiciona no indice 2 e empurra o resto
		lista.add("lu");
		
		System.out.println(lista);
		System.out.println("tamanho: " + lista.size());
		
		for (String cada : lista) {
			System.out.println(cada);
		}
		
		System.out.println("-----------");
		// 1º elemento atendendo criterio
		String nome = lista.stream().filter(cada -> cada.charAt(0) == 'l').findFirst().orElse(null);
		System.out.println(nome);
		
		String nome2 = lista.stream().filter(cada -> cada.charAt(0) == 'k').findFirst().orElse(null);
		System.out.println(nome2);
	}

}
/*
[aladin, mel, silas, lili, liu, lu]
tamanho: 6
aladin
mel
silas
lili
liu
lu
-----------
lili
null



------------------------------------
Lista (é uma interface)
inicia vazia
classes que implementam LIst: ArrayList, LinkedList, etc
Lista nao aceita tipos primitivos



*/
