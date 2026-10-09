package programa;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import entidades.Empregado;
import entidades.EmpregadoTerceirizado;

public class Teste1 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		List<Empregado> lista = new ArrayList<>();
		
		char perg1 = 'n';
		String nome1 = "Aladim";
		int horas1 = 50;
		double valorHora1 = 20;
		if (perg1 == 's'){
			//despesa adicional
			double dadicional = 0;
			Empregado emp = new EmpregadoTerceirizado(nome1, horas1, valorHora1,dadicional);
			lista.add(emp);
		}
		else {
			Empregado emp = new Empregado(nome1, horas1, valorHora1);
			lista.add(emp);
		}
		//
		char perg2 = 's';
		String nome2 = "Mel";
		int horas2 = 100;
		double valorHora2 = 15;
		if (perg2 == 's'){
			//despesa adicional
			double dadicional = 200;
			Empregado emp = new EmpregadoTerceirizado(nome2, horas2, valorHora2, dadicional);
			lista.add(emp);
		}
		else {
			Empregado emp = new Empregado(nome2, horas2, valorHora2);
			lista.add(emp);
		}
		//
		char perg3 = 'n';
		String nome3 = "Lily";
		int horas3 = 60;
		double valorHora3 = 20;
		if (perg3 == 's'){
			//despesa adicional
			double dadicional = 0;
			Empregado emp = new EmpregadoTerceirizado(nome3, horas3, valorHora3, dadicional);
			lista.add(emp);
		}
		else {
			Empregado emp = new Empregado(nome3, horas3, valorHora3);
			lista.add(emp);
		}
		
		
		System.out.println();
		System.out.println("Pagamentos:");
		for (Empregado cada : lista){
			System.out.println(cada.getNome() + " - $ " + String.format("%.2f", cada.pagamento()));
		}
		
		System.out.println();
		
	}

}
/*

Pagamentos:
Aladim - $ 1000.00
Mel - $ 1720.00
Lily - $ 1200.00



------------------------------------
pilares da oop
-encapsulamento
-herança
-polimorfismo




*/
