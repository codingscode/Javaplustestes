package servicos;

public interface ServicoJuros {
	double getTaxaJuros();

	double pagamento(double quantidade, int meses);
}
