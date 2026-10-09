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
		
		System.out.println(lista);
		System.out.println("tamanho: " + lista.size());
		
		for (String cada : lista) {
			System.out.println(cada);
		}
		
		System.out.println("-----------");
		lista.removeIf(cada -> cada.charAt(0) == 'l');
		
		System.out.println(lista);
		System.out.println("tamanho: " + lista.size());
		
	}

}
/*
[aladin, mel, silas, lili, liu]
tamanho: 5
aladin
mel
silas
lili
liu
-----------
[aladin, mel, silas]
tamanho: 3


------------------------------------
Lista (é uma interface)
inicia vazia
classes que implementam LIst: ArrayList, LinkedList, etc
Lista nao aceita tipos primitivos



*/
