package servicos;

public interface ServicoPagamentoOnline {
	double taxaPagamento(double quantidade);
	double juros(double quantidade, int meses);

}
