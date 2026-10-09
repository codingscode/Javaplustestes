package programa;



public class Teste1 {

	public static void main(String[] args) {
		int m;
		int[] numeros = { 2, 5, 3 };
		
		m = maior(numeros);
		System.out.println("maior numero: " + m);
	}
	
	public static int maior(int[] lista) {
		int a = lista[i];
		int i = 0;
		int l = lista.length;
		
		while (i < l) {
		   if (a <= lista[i])  {
		      a = lista[i];
		   }
		   i += 1;
		}
		return a;
	}

}
/*
maior numero: 5




*/
