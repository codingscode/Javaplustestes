package programa;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Teste1 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		List<Integer> listaInt = new ArrayList<Integer>();
		
		listaInt.add(10);
		listaInt.add(5);
		
		List<? extends Number> lista = listaInt;
		Number x = lista.get(0);
		lista.add(20); // erro de compilacao

		System.out.println();
	}

}
/*


 
------------------------------------
curingas delimitados (bounded wildcards)

princípio get/put - covariância e contravariância



*/
