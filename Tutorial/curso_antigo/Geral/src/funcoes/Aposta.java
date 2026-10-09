package funcoes;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Aposta {
	private Integer quantnumeros;
	private Integer ncasas;
	
	public Aposta() {
	}

	public Aposta(Integer quantnumeros, Integer ncasas) {
		this.quantnumeros = quantnumeros;
		this.ncasas = ncasas;
	}

	public Integer getQuantnumeros() {
		return quantnumeros;
	}

	public void setQuantnumeros(Integer quantnumeros) {
		this.quantnumeros = quantnumeros;
	}

	public Integer getNcasas() {
		return ncasas;
	}

	public void setNcasas(Integer ncasas) {
		this.ncasas = ncasas;
	}

	public List<Integer> criar() {
		List<Integer> ap = new ArrayList<>();
		while (ap.size() < ncasas) {
			int x = (new Random()).nextInt(quantnumeros) + 1;
			if (!ap.contains(x)) {
				ap.add(x);
			}
		}
		return ap;
	}
	
}
