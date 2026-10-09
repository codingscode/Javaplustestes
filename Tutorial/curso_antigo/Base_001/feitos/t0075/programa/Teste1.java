package programa;

import entidades.Conta;
import entidades.ContaEmpresa;
import entidades.ContaPoupanca;

public class Teste1 {

	public static void main(String[] args) {
		
		Conta c1 = new Conta(1001, "aladim", 1000.0);
		Conta c2 = new ContaPoupanca(1002, "mel", 1000.0, 0.01);
		Conta c3 = new ContaEmpresa(1003, "lily", 1000.0, 500.0);
		
		System.out.println();
		
	}

}
/*
notar o erro


Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
	Cannot instantiate the type Conta

	at programa.Tut001.main(Tut001.java:15)




------------------------------------
classes abstratas
- nao podem ser instanciadas
- garante herança total, somente subclasses nao abstratas podem ser instanciadas , mas nunca uma superclasse abstrata


*/
