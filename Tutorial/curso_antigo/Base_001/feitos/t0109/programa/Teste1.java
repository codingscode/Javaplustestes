package programa;

import dispositivos.Impressora;
import dispositivos.Scanner;

public class Teste1 {

	public static void main(String[] args) {
		Impressora p = new Impressora("1080");
		
		p.processarDoc("Minha Carta");
		p.print("Minha Carta");
		
		Scanner s = new Scanner("2003");
		
		s.processarDoc("Meu Email");
		System.out.println("Resultado scan: " + s.scan());

		System.out.println();
	}

}
/*
Impressora processando: Minha Carta
Imprimindo: Minha Carta
Scanner processando: Meu Email
Resultado scan: Conteudo Scaneado


https://github.com/acenelio/interfaces3-java
 ------------------------------------
combinação interface + classe abstrata


herança multipla e o problema do diamante


 */
