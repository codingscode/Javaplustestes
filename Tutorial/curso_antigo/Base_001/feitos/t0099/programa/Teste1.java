package programa;

import java.io.File;

public class Teste1 {

	public static void main(String[] args) {
		// caminho do arquivo
		String strCam = "/home/misterhp/Documentos/de_la/util/java/java_base/Base_001/src/programa/Teste1.java";
		
		File caminho = new File(strCam);
		
		System.out.println("getName: " + caminho.getName());
		System.out.println("getParent: " + caminho.getParent());
		System.out.println("getPath: " + caminho.getPath());
		
		System.out.println();
	}

}
/*
getName: Teste1.java
getParent: /home/misterhp/Documentos/de_la/util/java/java_base/Base_001/src/programa
getPath: /home/misterhp/Documentos/de_la/util/java/java_base/Base_001/src/programa/Teste1.java


 ------------------------------------
trabalhando com arquivos
bloco try-with-resources
manipulando pastas com File
 informações do caminho do arquivo
 

 * 
 */
