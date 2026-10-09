package programa;

import entidades.Conta;
import entidades.ContaEmpresa;
import entidades.ContaPoupanca;

public class Teste1 {

	public static void main(String[] args) {
		Conta c1 = new Conta(1001, "Aladim", 1000.0);
		c1.sacar(200.0);
		System.out.println(c1.getSaldo());
		
		Conta c2 = new ContaPoupanca(1002, "Mel", 1000.0, 0.01);
		c2.sacar(200.0);
		System.out.println(c2.getSaldo());
		
		Conta c3 = new ContaEmpresa(1003, "Lily", 1000.0, 500.0);
		c3.sacar(200.0);
		System.out.println(c3.getSaldo());
		System.out.println();
		

	}

}
/*




------------------------------------
Herança
Upcasting e downcasting
sobreposição ou sobrescrita
classes e métodos final

final: evita que a classe seja herdada



*/
