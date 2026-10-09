package programa;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.stream.Stream;


public class Teste1 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		List<Integer> lista = Arrays.asList(3,4,5,10,7);

		Stream<Integer> st1 = lista.stream().map(p -> p*10);
		System.out.println(Arrays.toString(st1.toArray()));

		System.out.println();
	}


	/*
	public static <T> void imprimir(List<T> l) {
		for (T cada : l) {
			System.out.println(cada);
		}
	}
	*/

}


/*
[30, 40, 50, 100, 70]




------------------------------------
programação funcional e calculo lambda

interface funcional -> tem um unico metodo abstrato

predicate -> 

consumer -> interface
lambda

Function(exemplo com map)
*map só age em stream

funcões que recebem funções como parametro

Stream


*/
