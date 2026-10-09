package geral;
import java.util.Arrays;
import java.util.Locale;
import java.util.Random;
import java.util.Set;
import java.util.stream.Collectors;



public class Bets {
	
	public static int presente(int elemento, int[] lista) {
		int soma = 0;
		for (int i=0; i<lista.length; i++) {
			if (elemento == lista[i]) {
				soma += 1;
			}
		}
		return soma;
	}
	
	public static int[] ap(int casas, int qnumeros) {
		int[] g = new int[casas];
		int x = (new Random()).nextInt(qnumeros + 1) + 1;
		int c = 0;
		while (c < casas) {
			if (presente(x, g) == 0) {
				g[c] = x;
				c += 1;
			}
			else {
				x = (new Random()).nextInt(32) + 1;
			}
		}
		return g;
	}
	
	public static boolean conj(int[] a, int[] b) { // se um vetor é igual a outro
		Set<Integer> e1 = Arrays.stream(a).boxed().collect(Collectors.toSet());
		Set<Integer> e2 = Arrays.stream(b).boxed().collect(Collectors.toSet());
		
		if (e1.equals(e2)) {
			return true;
		}
		return false;
	}
	
	public static int[][] aps(int qaps, int casas, int qnumeros){
		int[][] aps = new int[qaps][casas];
		int c1 = 0;
		
		while (c1 < qaps) {
			for (int[] cada : aps) {
				if (!(conj(cada, ap(casas,qnumeros)))) {
					aps[c1] = ap(casas, qnumeros);
					c1 += 1;
				}
			}
		}
		return aps;
	}
	
	public static void imprimir(int[] ap) {
		for (int cada : ap) {
			System.out.print(cada + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		long inicio = System.nanoTime();
		Locale.setDefault(Locale.US);
		
		int qnumeros = 31;
		int casas = 7;
		int minimo = 4;
		int napostas = 100;
		int[] a = {1,2,3};
		int[] b = {3,2,5};
		
		
		System.out.println(conj(a, b));
		
		for (int[] cada : aps(napostas, casas, qnumeros)) {
			imprimir(cada);
		}
		
		System.out.println("---------------------");
		imprimir(ap(casas, qnumeros));
		
		System.out.println("---------------------");
		
		long fim = System.nanoTime();
		System.out.println((fim - inicio)/1000000);
		System.out.println("oi");

	}
	// set 1941

}







