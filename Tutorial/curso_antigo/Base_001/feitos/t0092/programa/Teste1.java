package programa;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Teste1 {

	public static void main(String[] args) {
		String caminho = "./src/programa/meutexto.txt";
		//String caminho = "/cu";
		
		FileReader fr = null;
		BufferedReader br = null;
		
		try {
			fr = new FileReader(caminho);
			br = new BufferedReader(fr);
			String linha = br.readLine();
			
			while (linha != null) {
				System.out.println(linha);		
				linha = br.readLine();
			}
		}
		catch(IOException e){
			System.out.println("erro: " + e.getMessage());
		}
		finally {
			try {
				if (br != null){
					br.close();
				}
				if (fr != null){
					fr.close();
				}
			}
			catch(IOException e){
				e.printStackTrace();
			}
		}

		System.out.println();
	}

}
/*
bom dia
boa tarde

***********
erro: /cu (Arquivo ou diretório inexistente)




 ------------------------------------
trabalhando com arquivos
 

 * 
 */
