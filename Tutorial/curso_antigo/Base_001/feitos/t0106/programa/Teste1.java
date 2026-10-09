package programa;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

import entidades.Contrato;
import entidades.Parcelamento;
import servicos.ServicoContrato;
import servicos.ServicoPaypal;

public class Teste1 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

		int numero = 8028;
		LocalDate data = LocalDate.parse("25/06/2018", fmt);
		double valorTotal = 600;

		Contrato obj = new Contrato(numero, data, valorTotal);
		//numero de parcelas
		int n = 3;

		ServicoContrato servicoContrato = new ServicoContrato(new ServicoPaypal());
		servicoContrato.processarContrato(obj, n);

		System.out.println("parcelas:");
		for (Parcelamento cada : obj.getParcelas()){
			System.out.println(cada);
		}

		System.out.println();
	}

}
/*
parcelas:
25/07/2018 - 206.04
25/08/2018 - 208.08
25/09/2018 - 210.12









 ------------------------------------
interfaces
é um tipo que define um conjunto de operações que uma classe deve implementar
a interface estabelece um contrato que a classe deve cumprir


inversao de controle, injeção de dependencia


 */
