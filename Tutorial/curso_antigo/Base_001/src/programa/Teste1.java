package programa;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

import entidades.Produto;


public class Teste1 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);
		
		//caminho completo
		String caminho = "/home/misterhp/Documentos/de_la/util/java/java_base/Base_001/src/programa/in.txt";
		
		try (BufferedReader br = new BufferedReader(new FileReader(caminho))) {

			List<Produto> lista = new ArrayList<>();

			String linha = br.readLine();
			while (linha != null) {
				String[] campos = linha.split(",");
				lista.add(new Produto(campos[0], Double.parseDouble(campos[1])));
				linha = br.readLine();
			}

			double media = lista.stream()
					.map(p -> p.getPreco())
					.reduce(0.0, (x,y) -> x + y) / lista.size();
			
			System.out.println("preço médio: " + String.format("%.2f", media));
			
			Comparator<String> comp = (s1, s2) -> s1.toUpperCase().compareTo(s2.toUpperCase());

			List<String> nomes = lista.stream()
					.filter(p -> p.getPreco() < media)
					.map(p -> p.getNome()).sorted(comp.reversed())
					.collect(Collectors.toList());

			nomes.forEach(System.out::println);

		}
		catch (IOException e) {
			System.out.println("Erro: " + e.getMessage());
		}
		sc.close();		
		System.out.println();
	}

}


/*
preço médio: 420.23
Tablet
Mouse
Monitor
HD Case




------------------------------------


*/
