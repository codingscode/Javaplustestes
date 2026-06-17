package programa;

public class Generico {
	
	// metodo Generic funciona com qualquer tipo
	public static <T> void imprimirArray(T[] array) {
	   for (T cada : array) {
	      System.out.println(cada);
	   }
	}
	
	

}
