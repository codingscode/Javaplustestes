package entidades;

public class Produtos {
	public String nome;
	public double preco;
	public int quantidade;
	
	public Produtos(String nome, double preco, int quantidade){
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
	}

	public double valorTotal() {
		return preco*quantidade;
	}
	
	public void adicionarProdutos(int q) {
		this.quantidade += q;
	}
	
	public void removerProdutos(int q) {
		this.quantidade -= q;
	}
	
	public String toString() {
		return nome
		       + ", R$"
		       + String.format("%.2f", preco)
		       + ", "
		       + quantidade
		       + " unidades, total: R$ "
		       +  String.format("%.2f", valorTotal())  ;
	}
	

}
