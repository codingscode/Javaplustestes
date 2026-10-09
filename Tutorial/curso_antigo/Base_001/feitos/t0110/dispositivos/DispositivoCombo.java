package dispositivos;

public class DispositivoCombo extends Dispositivo implements Scanner, Impressora{

	public DispositivoCombo(String numeroSerial) {
		super(numeroSerial);
	}

	@Override
	public void print(String doc) {
		System.out.println("combo imprimindo: " + doc);
	}

	@Override
	public String scan() {
		return "combo resultado scan";
	}

	@Override
	public void processarDoc(String doc) {
		System.out.println("combo processando: " + doc);
	}


}
