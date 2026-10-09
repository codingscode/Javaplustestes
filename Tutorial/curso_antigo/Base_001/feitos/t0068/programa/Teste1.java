package programa;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

import entidades.ContratoHora;
import entidades.Departamento;
import entidades.Trabalhador;
import entidades.enums.NivelTrabalhador;

public class Teste1 {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		//nome departamento, dados trabalhador
		String nomeDepartamento = "TI";
		String nomeTrabalhador = "Aladim";
		String nivelTrabalhador = "MEDIO";
		double salarioBase = 1200;
		Trabalhador trabalhador = new Trabalhador(nomeTrabalhador, NivelTrabalhador.valueOf(nivelTrabalhador),
						         salarioBase, new Departamento(nomeDepartamento));

		// quantidade contratos
		int n = 3;

		Date dataContrato1 = sdf.parse("20/08/2018");		
		double horaValor1 = 50;
		int horas1 = 20;
		ContratoHora contrato1 = new ContratoHora(dataContrato1, horaValor1, horas1);
		trabalhador.adicionarContrato(contrato1);
		
		Date dataContrato2 = sdf.parse("13/06/2018");		
		double horaValor2 = 30;
		int horas2 = 18;
		ContratoHora contrato2 = new ContratoHora(dataContrato2, horaValor2, horas2);
		trabalhador.adicionarContrato(contrato2);
		
		Date dataContrato3 = sdf.parse("25/08/2018");		
		double horaValor3 = 80;
		int horas3 = 10;
		ContratoHora contrato3 = new ContratoHora(dataContrato3, horaValor3, horas3);
		trabalhador.adicionarContrato(contrato3);
				
		// mes e ano para calcular renda
		String mesEano = "08/2018";
		int mes = Integer.parseInt(mesEano.substring(0,2));
		int ano = Integer.parseInt(mesEano.substring(3));
		System.out.println("Nome: " + trabalhador.getNome());
		System.out.println("Departamento: " + trabalhador.getDepartamento().getNome());
		System.out.println("Renda para " + mesEano + ": " + String.format("%.2f", trabalhador.renda(ano, mes)));
		System.out.println();

	}

}
/*
Nome: Aladim
Departamento: TI
Renda para 08/2018: 3000.00



------------------------------------
composição



*/
