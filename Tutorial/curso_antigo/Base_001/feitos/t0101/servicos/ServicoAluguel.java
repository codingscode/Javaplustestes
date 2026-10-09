package model.servicos;

import model.entidades.AluguelCarro;
import model.entidades.Fatura;

public class ServicoAluguel {
	private Double precoHora;
	private Double precoDia;
	
	private ServicoImpostoBrasil servicoImposto;

	public ServicoAluguel(Double precoHora, Double precoDia, ServicoImpostoBrasil servicoImposto) {
		this.precoHora = precoHora;
		this.precoDia = precoDia;
		this.servicoImposto = servicoImposto;
	}

	public void processarFatura(AluguelCarro carroAluguel){
		carroAluguel.setFatura(new Fatura(50.0, 10.0));
	}


}
