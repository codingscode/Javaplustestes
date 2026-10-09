package programa;

import java.io.File;

public class Teste1 {

	public static void main(String[] args) {
		// caminho da pasta
		String strCam = "/home/misterhp/Documentos/de_la/util/java/java_base/Base_001/src/programa";
		
		File caminho = new File(strCam);
		
		File[] pastas = caminho.listFiles(File::isDirectory);
		System.out.println("pastas:");
		for (File cada : pastas) {
			System.out.println(cada);
		}

		File[] arquivos = caminho.listFiles(File::isFile);
		System.out.println("arquivos:");
		for (File cada : arquivos) {
			System.out.println(cada);
		}

		// cria diretório
		boolean sucesso = new File(strCam + "/subdir").mkdir();
		System.out.println("diretório criado com sucesso: " + sucesso);

		System.out.println();
	}

}
/*
pastas:
arquivos:
/home/misterhp/Documentos/de_la/util/java/java_base/Base_001/src/programa/Teste1.java
diretório criado com sucesso: true




 ------------------------------------
trabalhando com arquivos
bloco try-with-resources
manipulando pastas com File
 

 * 
 */
