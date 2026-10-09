package programa;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.Instant;
import java.util.Date;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

import entidades.LogEntrada;

public class Teste1 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		// caminho do arquivo
		String caminho = "/home/misterhp/Documentos/de_la/util/java/java_base/Base_001/src/programa/in.txt";
		
		try (BufferedReader br = new BufferedReader(new FileReader(caminho))) {

			Set<LogEntrada> set = new HashSet<>();

			String linha = br.readLine();
			while (linha != null) {

				String[] campos = linha.split(" ");
				String nomeusu = campos[0];
				Date momento = Date.from(Instant.parse(campos[1]));

				set.add(new LogEntrada(nomeusu, momento));

				linha = br.readLine();
			}
			System.out.println("Total de usuários: " + set.size());

		} catch (IOException e) {
			System.out.println("Erro: " + e.getMessage());
		}

		System.out.println();
	}


}


/*
Total de usuários: 4



hascode equal só em relação nome. evita repetição
set evita repetição
------------------------------------
Set
hashset, treeset, linkedhashset
hashset: mais rapido, nao garante ordem



*/
