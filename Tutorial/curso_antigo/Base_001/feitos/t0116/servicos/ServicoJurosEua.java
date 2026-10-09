package servicos;

import java.security.InvalidParameterException;

public class ServicoJurosEua implements ServicoJuros{
	private double taxaJuros;

	public ServicoJurosEua(double taxaJuros) {
		this.taxaJuros = taxaJuros;
	}

	@Override
	public double getTaxaJuros() {
		return taxaJuros;
	}

	@Override
	public double pagamento(double quantidade, int meses) {
		if (meses < 1) {
			throw new InvalidParameterException("Meses devem ser maiores que zero");
		}
		return quantidade * Math.pow(1.0 + taxaJuros / 100.0, meses);
	}

}
