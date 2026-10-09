package dispositivos;

public class Scanner extends Dispositivo {

	public Scanner(String numeroSerial) {
		super(numeroSerial);
	}

	@Override
	public void processarDoc(String doc) {
		System.out.println("Scanner processando: " + doc);
	}

	public String scan() {
		return "Conteudo Scaneado";
	}
}