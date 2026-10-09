package entidades;

public class Produtos {
	public String nome;
	public double preco;
	public int quantidade;
	
	public double valorTotal() {
		return preco*quantidade;
	}
	
	public void adicionarProdutos(int q) {
		this.quantidade += q;
	}
	
	public void removerProdutos(int q) {
		this.quantidade = - q;
	}
	
	public String toString() {
		return nome;
	}
	

}
