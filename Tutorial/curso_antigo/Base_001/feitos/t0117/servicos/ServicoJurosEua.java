package servicos;

public class ServicoJurosEua implements ServicoJuros{
	private double taxaJuros;

	public ServicoJurosEua(double taxaJuros) {
		this.taxaJuros = taxaJuros;
	}

	@Override
	public double getTaxaJuros() {
		return taxaJuros;
	}
		
	
}
