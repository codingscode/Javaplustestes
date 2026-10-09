package programa;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Teste1 {

	public static void main(String[] args) {
		String caminho = "./src/programa/meutexto.txt";
		
		try (BufferedReader br = new BufferedReader(new FileReader(caminho))) {
			String linha = br.readLine();
			
			while (linha != null) {
				System.out.println(linha);		
				linha = br.readLine();
			}
		}
		catch(IOException e){
			System.out.println("erro: " + e.getMessage());
		}

		System.out.println();
	}

}
/*
bom dia
boa tarde


 ------------------------------------
trabalhando com arquivos
bloco try-with-resources

 

 * 
 */
