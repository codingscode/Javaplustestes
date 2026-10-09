package dispositivos;

public class ImpressoraConcreto extends Dispositivo implements Impressora{

	public ImpressoraConcreto(String numeroSerial) {
		super(numeroSerial);
	}

	@Override
	public void processarDoc(String doc) {
		System.out.println("Impressora processando: " + doc);
	}

	@Override
	public void print(String doc) {
		System.out.println("Imprimindo: " + doc);
	}
}
