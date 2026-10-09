package programa;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import entidades.Conta;
import entidades.ContaEmpresa;
import entidades.ContaPoupanca;

public class Teste1 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		List<Conta> lista = new ArrayList<>();
		
		lista.add(new ContaPoupanca(1001, "aladim", 500.0, 0.01));
		lista.add(new ContaPoupanca(1002, "mel", 300.0, 0.01));
		lista.add(new ContaEmpresa(1003, "lily", 1000.0, 400.0));
		lista.add(new ContaEmpresa(1004, "liu", 500.0, 500.0));

		double soma = 0.0;
		for (Conta cada : lista) {
			soma += cada.getSaldo();
		}
		System.out.printf("saldo total: %.2f%n", soma);

		for (Conta cada : lista){
			cada.depositar(10.0);
		}

		for (Conta cada : lista){
			System.out.printf("saldo atualizado para conta %d: %.2f%n", cada.getNumero(), cada.getSaldo());
		}

		System.out.println();
		
	}

}
/*
saldo total: 2300.00
saldo atualizado para conta 1001: 510.00
saldo atualizado para conta 1002: 310.00
saldo atualizado para conta 1003: 1010.00
saldo atualizado para conta 1004: 510.00




------------------------------------
classes abstratas
- nao podem ser instanciadas
- garante herança total, somente subclasses nao abstratas podem ser instanciadas , mas nunca uma superclasse abstrata


*/
