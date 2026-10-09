package programa;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import servicos.ServicoCalculo;

public class Teste1 {

	public static void main(String[] args) {
		List<Integer> lista = new ArrayList<>();

		String caminho = "/home/misterhp/Documentos/de_la/util/java/java_base/Base_001/src/programa/in.txt";

		try (BufferedReader br = new BufferedReader(new FileReader(caminho))) {

			String linha = br.readLine();
			while (linha != null) {
				lista.add(Integer.parseInt(linha));
				linha = br.readLine();
			}

			Integer x = ServicoCalculo.max(lista);
			System.out.println("Max:");
			System.out.println(x);

		} catch (IOException e) {
			System.out.println("Erro: " + e.getMessage());
		}

		System.out.println();
	}

}
/*
Max:
14


 
 
 
 
 
------------------------------------
generics permitem que classes,
interfaces e métodos possam ser parametrizados por tipo. seus beneficios são:
reuso, type safety, performance uso comum: coleções
 
 
Genéricos delimitados
 
 
 
*/
