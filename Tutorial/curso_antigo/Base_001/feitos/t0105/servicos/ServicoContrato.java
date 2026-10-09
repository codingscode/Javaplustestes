package servicos;

import java.time.LocalDate;

import entidades.Contrato;
import entidades.Parcelamento;

public class ServicoContrato {
	private ServicoPagamentoOnline servicoPagamentoOnline;

	public ServicoContrato(ServicoPagamentoOnline servicoPagamentoOnline) {
		this.servicoPagamentoOnline = servicoPagamentoOnline;
	}

	public void processarContrato(Contrato contrato, int meses){
		contrato.getParcelas().add(new Parcelamento(LocalDate.of(2018,7,25), 206.04));
		contrato.getParcelas().add(new Parcelamento(LocalDate.of(2018,8,25), 208.08));
	}

}
