package geral;

import java.util.List;
import java.util.Locale;

import funcoes.Aposta;
import funcoes.Apostas;


public class Bets {
	
	public static void imprimir(List<List<Integer>> iteravel) {
		for (List<Integer> cada : iteravel) {
			System.out.println(cada);
		}
	}
    
    public static void main(String[] args) {
    	
        long inicio = System.nanoTime();
        Locale.setDefault(Locale.US);

        int qnumeros = 31;
        int casas = 7;
        int napostas = 13;
        
        Aposta ap = new Aposta(qnumeros, casas);
        
        Apostas aps = new Apostas(ap, napostas);
        imprimir(aps.gerar(napostas, ap));
        
        System.out.println("---------------------");
        long fim = System.nanoTime();
        System.out.println("Tempo (ms): " + (fim - inicio)/1000000);
    }
}

