package programa;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Teste1 {

	public static void main(String[] args) {
		List<String> lista = new ArrayList<>();
		String caminho = "./src/programa/in.txt";
		
		try (BufferedReader br = new BufferedReader(new FileReader(caminho))) {
			String nome = br.readLine();
			while (nome != null) {
				lista.add(nome);
				nome = br.readLine();
			}
			Collections.sort(lista);
			for (String cada : lista) {
				System.out.println(cada);
			}
		}
		catch (IOException e) {
			System.out.println("Erro: " + e.getMessage());
		}

		System.out.println();
	}

}
/*
Alex Black
Alex Brown
Alex Green
Anna White
Bob Grey
Eduardo Rose
Maria Brown
Marta Blue
Willian Red

 
 
------------------------------------
combinação interface + classe abstrata
 
herança multipla e o problema do diamante
 
interface comparable
 
 
 
*/
