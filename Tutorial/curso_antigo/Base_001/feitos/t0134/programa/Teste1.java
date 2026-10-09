package programa;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public class Teste1 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		List<Integer> meusInts = Arrays.asList(1, 2, 3, 4);
		List<Double> meusDouble = Arrays.asList(3.14, 6.28);
		List<Object> meusObjs = new ArrayList<Object>();
		copiar(meusInts, meusObjs);
		imprimirList(meusObjs);
		copiar(meusDouble, meusObjs);
		imprimirList(meusObjs);
		System.out.println();
	}

	public static void copiar(List<? extends Number> fonte, List<? super Number> destino) {
		for(Number numero : fonte) {
			destino.add(numero);
		}
	}

	public static void imprimirList(List<?> lista) {
		for (Object obj : lista) {
			System.out.print(obj + " ");
		}
		System.out.println();
	}

}
/*
1 2 3 4 
1 2 3 4 3.14 6.28 



 
------------------------------------
curingas delimitados (bounded wildcards)

princípio get/put - covariância e contravariância



*/
