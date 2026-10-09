package servicos;

import java.security.InvalidParameterException;

public interface ServicoJuros {
	double getTaxaJuros();
	
	default double pagamento(double quantidade, int meses) {
		if (meses < 1) {
			throw new InvalidParameterException("Meses devem ser maiores que zero");
		}
		return quantidade * Math.pow(1.0 + getTaxaJuros() / 100.0, meses);
	}

}
