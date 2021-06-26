package modificadores_de_acesso;

import java.util.Date;

//private: o membro só pode ser acessado na própria classe

// (nada): o membro só pode ser acessado nas classes do mesmo pacote

// protected: o membro só pode ser acessado no mesmo pacote, bem como em
//subclasses de pacotes diferentes

// public: o membro é acessado por todas classes (ao menos que ele resida em
//um módulo diferente que não exporte o pacote onde ele está)

public class Order {
	
	private Date date;
	private Product product;
	
	
	public Order(Date date, Product product) {
		super();
		this.date = date;
		this.product = product;
		this.product.name = "TV"; //não deu erro pois neste pacote, o "name" da classe product não tem mais modificador de acesso
	}


	public Date getDate() {
		return date;
	}


	public void setDate(Date date) {
		this.date = date;
	}


	public Product getProduct() {
		return product;
	}


	public void setProduct(Product product) {
		this.product = product;
	}
	
	
	
	
	
	
	
}
