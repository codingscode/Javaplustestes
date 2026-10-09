package programa;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import model.entidades.Reserva;
import model.excecoes.DominioExcecoes;

public class Teste1 {

	public static void main(String[] args) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		try {
			// numero quarto
			int numero = "aaa";
			// datas
			Date entrada = sdf.parse("26/09/2026");
			Date saida = sdf.parse("23/09/2026");

			Reserva reserva = new Reserva(numero, entrada, saida);
			System.out.println("Reserva: " + reserva);
			
			System.out.println();
			System.out.println("digite data atualizar reserva.");
			entrada = sdf.parse("24/09/2024");
			saida = sdf.parse("29/09/2024");

			reserva.atualizarDatas(entrada, saida);
			System.out.println("Reserva: " + reserva);
		}
		catch (ParseException e) {
			System.out.println("formato de data inválido");
		}
		catch(DominioExcecoes e){
			System.out.println("erro na reserva: " + e.getMessage());
		}
		catch(RuntimeException e){
			System.out.println("erro inesperado!");
		}
		System.out.println();
	}

}
/*
Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
	Type mismatch: cannot convert from String to int

	at programa.Teste1.main(Teste1.java:17)






 ------------------------------------
 solução boa
 

 * 
 */
