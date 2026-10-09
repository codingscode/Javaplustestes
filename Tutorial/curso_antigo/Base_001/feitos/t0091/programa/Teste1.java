package programa;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Teste1 {

	public static void main(String[] args) {
		File arquivo = new File("./src/programa/meutexto.txt");
		Scanner sc = null;
		
		try {
			sc = new Scanner(arquivo);
			while (sc.hasNextLine()) {
				System.out.println(sc.nextLine());		
			}
		}
		catch(IOException e){
			System.out.println("erro: " + e.getMessage());
		}
		finally {
			if (sc != null){
				sc.close();
			}
		}

		System.out.println();
	}

}
/*
bom dia
boa tarde



 ------------------------------------
trabalhando com arquivos
 

 * 
 */
