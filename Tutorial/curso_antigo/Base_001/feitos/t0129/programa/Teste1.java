package programa;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public class Teste1 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		List<Integer> meusInts = Arrays.asList(5, 2, 10);
		imprimirList(meusInts);

		List<String> minhaStrs = Arrays.asList("aladin", "mel", "lily");
		imprimirList(minhaStrs);

		System.out.println();
	}

	public static void imprimirList(List<?> lista){
		//lista.add(3); // dá erro
		for (Object obj : lista) {
			System.out.println(obj);
		}
	}
}
/*
5
2
10
aladin
mel
lily


 
------------------------------------
generics permitem que classes,
interfaces e métodos possam ser parametrizados por tipo. seus beneficios são:
reuso, type safety, performance uso comum: coleções
 
 
Genéricos delimitados
 
Tipos curinga (wildcard types))
com tipos curinga podemos fazer métodos que recebem um genérico de "qualquer tipo"
porém nao é possível adicionar dados a uma coleção de tipo curinga



*/
