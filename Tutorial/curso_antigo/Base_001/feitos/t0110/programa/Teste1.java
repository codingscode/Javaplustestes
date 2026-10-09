package programa;

import dispositivos.DispositivoCombo;
import dispositivos.ImpressoraConcreto;
import dispositivos.ScannerConcreto;

public class Teste1 {

	public static void main(String[] args) {
		ImpressoraConcreto p = new ImpressoraConcreto("1080");
		p.processarDoc("Minha Carta");
		p.print("Minha Carta");

		System.out.println();
		ScannerConcreto s = new ScannerConcreto("2003");
		s.processarDoc("Meu Email");
		System.out.println("Resultado scan: " + s.scan());

		System.out.println();
		DispositivoCombo c = new DispositivoCombo("2081");
		c.processarDoc("minha dissertação");
		c.print("minha dissertação");
		System.out.println("resultado scan: " + c.scan());

		System.out.println();
	}

}
/*
Impressora processando: Minha Carta
Imprimindo: Minha Carta

Scanner processando: Meu Email
Resultado scan: Conteudo Scaneado

combo processando: minha dissertação
combo imprimindo: minha dissertação
resultado scan: combo resultado scan





https://github.com/acenelio/interfaces3-java
 ------------------------------------
combinação interface + classe abstrata


herança multipla e o problema do diamante


 */
