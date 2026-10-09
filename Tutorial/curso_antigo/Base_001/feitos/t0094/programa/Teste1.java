package programa;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Teste1 {

	public static void main(String[] args) {
		String[] linhas = new String[]{"bom dia", "boa tarde", "boa noite"};
		String caminho = "./src/programa/meutexto.txt";
		
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(caminho))){
			for (String cada : linhas) {
				bw.write(cada);
				bw.newLine();
			}
		}
		catch (IOException e){
			e.printStackTrace();
		}

		System.out.println();
	}

}
/*
conteudo do arquivo criado:
bom dia
boa tarde
boa noite


 ------------------------------------
trabalhando com arquivos
bloco try-with-resources

 

 * 
 */
