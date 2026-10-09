package model.servicos;

import java.time.Duration;

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
	
	public void processarFatura(AluguelCarro carroAluguel ){
		double minutos = Duration.between(carroAluguel.getInicio(), carroAluguel.getFim()).toMinutes();
		double horas = minutos/60.0;
		
		double pagamentoBase;
		if (horas <= 12.0){
			pagamentoBase = precoHora*Math.ceil(horas);
		}
		else {
			pagamentoBase = precoDia*Math.ceil(horas/24.0);
		}
		
		double imposto = servicoImposto.imposto(pagamentoBase);
				
		carroAluguel.setFatura(new Fatura(pagamentoBase, imposto));
	}
	
	
}
