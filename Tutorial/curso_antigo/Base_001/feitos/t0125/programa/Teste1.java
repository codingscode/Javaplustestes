package programa;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import entidades.Produto;
import servicos.ServicoCalculo;

public class Teste1 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		List<Produto> lista = new ArrayList<>();

		String caminho = "./src/programa/in.txt";

		try (BufferedReader br = new BufferedReader(new FileReader(caminho))) {

			String linha = br.readLine();
			while (linha != null) {
				String[] campos = linha.split(",");
				lista.add(new Produto(campos[0], Double.parseDouble(campos[1])));
				linha = br.readLine();
			}

			Produto x = ServicoCalculo.max(lista);
			System.out.println("Mais caro:");
			System.out.println(x);

		}
		catch (IOException e) {
			System.out.println("Erro: " + e.getMessage());
		}

		System.out.println();
	}

}
/*
Mais caro:
IPhone X, 910.00




------------------------------------
generics permitem que classes,
interfaces e métodos possam ser parametrizados por tipo. seus beneficios são:
reuso, type safety, performance uso comum: coleções


Genéricos delimitados



*/
