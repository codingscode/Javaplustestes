package programa;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;


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
		System.out.println("indice de lili: " + lista.indexOf("lili"));
		System.out.println("indice de xing: " + lista.indexOf("xing"));
		
		System.out.println(lista);
		System.out.println("tamanho: " + lista.size());
		System.out.println("-----------");
		List<String> resultado = lista.stream().filter(cada -> cada.charAt(0) == 'l').collect(Collectors.toList());
		System.out.println(resultado);
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
indice de lili: 3
indice de xing: -1
[aladin, mel, silas, lili, liu, lu]
tamanho: 6
-----------
[lili, liu, lu]



------------------------------------
Lista (é uma interface)
inicia vazia
classes que implementam LIst: ArrayList, LinkedList, etc
Lista nao aceita tipos primitivos



*/
