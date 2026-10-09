package programa;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import entidades.Funcionario;

public class Teste1 {

	public static void main(String[] args) {
		List<Funcionario> lista = new ArrayList<>();
		String caminho = "./src/programa/in.txt";
		
		try (BufferedReader br = new BufferedReader(new FileReader(caminho))) {
			String funcionarioCsv = br.readLine();
			while (funcionarioCsv != null) {
				String[] campos = funcionarioCsv.split(",");
				lista.add(new Funcionario(campos[0], Double.parseDouble(campos[1])));
				funcionarioCsv = br.readLine();
			}
			Collections.sort(lista);
			for (Funcionario cada : lista) {
				System.out.println(cada.getNome() + ", " + cada.getSalario());
			}
		}
		catch (IOException e) {
			System.out.println("Erro: " + e.getMessage());
		}

		System.out.println();
	}

}
/*
Marta Blue, 6100.0
Alex Brown, 5000.0
Eduardo Rose, 4390.0
Maria Brown, 4300.0
Anna White, 3500.0
Alex Green, 3100.0
Bob Grey, 3100.0
Willian Red, 2900.0
Alex Black, 2450.0



 
 
 
------------------------------------
combinação interface + classe abstrata
 
herança multipla e o problema do diamante
 
interface comparable
 
 
 
*/
