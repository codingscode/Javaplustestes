package servicos;

public class ServicoPaypal implements ServicoPagamentoOnline{

	@Override
	public double taxaPagamento(double quantidade) {
		return quantidade*0.02;
	}

	@Override
	public double juros(double quantidade, int meses) {
		return quantidade*0.01*meses;
	}


}
