package programa;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

import model.entidades.AluguelCarro;
import model.entidades.Veiculo;
import model.servicos.ServicoAluguel;
import model.servicos.ServicoImpostoBrasil;

public class Teste1 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		
		//dados do aluguel
		String modeloCarro = "civic";
		LocalDateTime inicio = LocalDateTime.parse("25/06/2018 10:30", fmt);
		LocalDateTime fim = LocalDateTime.parse("25/06/2018 14:40", fmt);
		
		AluguelCarro ac = new AluguelCarro(inicio, fim, new Veiculo(modeloCarro));
		
		//ServicoImpostoBrasil servicoImposto = new ServicoImpostoBrasil();

		//preços
		double precoHora = 10;
		double precoDia = 130;
		
		ServicoAluguel servicoAluguel = new ServicoAluguel(precoHora, precoDia, new ServicoImpostoBrasil());
		servicoAluguel.processarFatura(ac);

		System.out.println("fatura:");		
		System.out.println("pagamento basico: " + ac.getFatura().getPagamentoBase());
		System.out.println("Imposto: " + ac.getFatura().getImposto());
		System.out.println("Pagamento total: " + ac.getFatura().pagamentoTotal());
		
		
		System.out.println();
	}

}
/*
fatura:
pagamento basico: 50.0
Imposto: 10.0
Pagamento total: 40.0





resolvendo sem interface
 ------------------------------------
interfaces
é um tipo que define um conjunto de operações que uma classe deve implementar
a interface estabelece um contrato que a classe deve cumprir

 

 * 
 */
