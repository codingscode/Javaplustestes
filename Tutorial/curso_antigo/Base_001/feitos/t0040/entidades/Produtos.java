package entidades;

public class Produtos {
	private String nome;
	private double preco;
	private int quantidade;

	public Produtos() {
	}

	public Produtos(String nome, double preco, int quantidade){
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
	}

	public Produtos(String nome, double preco){
		this.nome = nome;
		this.preco = preco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public int getQuantidade() {
		return quantidade;
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
		       + ", R$ "
		       + String.format("%.2f", preco)
		       + ", "
		       + quantidade
		       + " unidades, total: R$ "
		       +  String.format("%.2f", valorTotal())  ;
	}
	

}
