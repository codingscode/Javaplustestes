package dispositivos;

public class Impressora extends Dispositivo {

	public Impressora(String numeroSerial) {
		super(numeroSerial);
	}

	@Override
	public void processarDoc(String doc) {
		System.out.println("Impressora processando: " + doc);
	}

	public void print(String doc) {
		System.out.println("Imprimindo: " + doc);
	}
}
