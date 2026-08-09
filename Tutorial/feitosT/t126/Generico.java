package programa;

public class Generico {
	
	// metodo Generic funciona com qualquer tipo
	public static <T> void imprimirArray(T[] array) { // nao aceita tipo primitivo
	   for (T cada : array) {
	      System.out.println(cada);
	   }
	}

}
