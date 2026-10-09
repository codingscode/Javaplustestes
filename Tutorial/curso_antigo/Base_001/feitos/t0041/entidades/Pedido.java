package entidades;

import java.util.Date;

public class Pedido {
	private Date data;
	private Produtos produto;
	
	public Pedido(Date data, Produtos produto) {
		super();
		this.data = data;
		this.produto = produto;
		this.produto.nome = "TV";
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public Produtos getProduto() {
		return produto;
	}

	public void setProduto(Produtos produto) {
		this.produto = produto;
	}
	
	
	
	
}
