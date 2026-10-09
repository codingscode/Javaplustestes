package funcoes;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Apostas {
	private Aposta ap;
	private Integer quantapostas;
	List<List<Integer>> aps = new ArrayList<>();
	
	public Apostas() {
	}
	
	public Apostas(Aposta ap, Integer quantapostas) {
		this.ap = ap;
		this.quantapostas = quantapostas;
	}

	public Aposta getAp() {
		return ap;
	}

	public void setAp(Aposta ap) {
		this.ap = ap;
	}

	public Integer getQuantapostas() {
		return quantapostas;
	}

	public void setQuantapostas(Integer quantapostas) {
		this.quantapostas = quantapostas;
	}

	public static boolean comparar(List<Integer> a, List<Integer> b) {
		Set<Integer> a1 = new HashSet<>(a);
		Set<Integer> b1 = new HashSet<>(b);
		return a1.equals(b1);
	}
	
	public static boolean ord(List<Integer> l1, List<Integer> l2) { // ordena 2 lists e ve se são iguais
		List<Integer> a1 = new ArrayList<>(l1);
		a1.sort(null);
		List<Integer> a2 = new ArrayList<>(l2);
		a2.sort(null);
		return a1.equals(a2);
	}
	
	public static boolean ordl(List<Integer> col, List<List<Integer>> listas) { // ordena uma list de lists e e ve se uma list pertence a ela
		List<List<Integer>> dlistas = listas.stream()
			    .map(innerList -> new ArrayList<>(innerList)) // Corrected line
			    .collect(Collectors.toList());
		
		List<Integer> dcol = col.stream().map(Integer::new).collect(Collectors.toList());
		
		dcol.sort(null);
		boolean v = true;
		for (List<Integer> cada : dlistas) {
			cada.sort(null);
		}
		for (List<Integer> cada : dlistas) {
			v = v && !(dcol.equals(cada));
		}
		return !v;
	}
	
	public List<List<Integer>> gerar(Integer quantapostas, Aposta ap){
		while (aps.size() < quantapostas) {
			List<Integer> a = ap.criar();
			if (!(aps.contains(a))) {
			//if (!( ordl(a, aps))) {
				aps.add(a);
			}
		}
		return aps;
	}
	
	
}
