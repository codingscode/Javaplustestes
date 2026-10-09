package programa;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;


public class Teste1 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		List<String> lista = new ArrayList<>() ; // ArrayList implementa List
		
		System.out.println(lista);

		lista.add("aladin");
		lista.add("mel");
		lista.add("lili");
		lista.add("liu");
		
		System.out.println(lista);
		
		for (String cada : lista) {
			System.out.println(cada);
		}
		
		
	}

}
/*
[aladin, mel, lili, liu]
aladin
mel
lili
liu



------------------------------------
Lista (é uma interface)
inicia vazia
classes que implementam LIst: ArrayList, LinkedList, etc
Lista nao aceita tipos primitivos



*/
