package programa;

import java.io.File;

public class Teste1 {

	public static void main(String[] args) {
		// caminho da pasta
		String strCam = "/home/misterhp/Documentos/de_la/util/java/java_base";
		
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
		

		System.out.println();
	}

}
/*
pastas:
/home/misterhp/Documentos/de_la/util/java/java_base/ZJava_lot
/home/misterhp/Documentos/de_la/util/java/java_base/Base_001
/home/misterhp/Documentos/de_la/util/java/java_base/.metadata

arquivos:
/home/misterhp/Documentos/de_la/util/java/java_base/.gitignore




 ------------------------------------
trabalhando com arquivos
bloco try-with-resources
manipulando pastas com File
 

 * 
 */
