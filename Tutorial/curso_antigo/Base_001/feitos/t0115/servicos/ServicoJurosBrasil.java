package servicos;

import java.security.InvalidParameterException;


public class ServicoJurosBrasil {
	private double taxaJuros;

	public ServicoJurosBrasil(double taxaJuros) {
		this.taxaJuros = taxaJuros;
	}

	public double getTaxaJuros() {
		return taxaJuros;
	}

	public double pagamento(double quantidade, int meses) {
		if (meses < 1) {
			throw new InvalidParameterException("Meses devem ser maiores que zero");
		}
		return quantidade * Math.pow(1.0 + taxaJuros / 100.0, meses);
	}

}
