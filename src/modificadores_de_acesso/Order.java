package modificadores_de_acesso;

import java.util.Date;

//private: o membro s� pode ser acessado na pr�pria classe

// (nada): o membro s� pode ser acessado nas classes do mesmo pacote

// protected: o membro s� pode ser acessado no mesmo pacote, bem como em
//subclasses de pacotes diferentes

// public: o membro � acessado por todas classes (ao menos que ele resida em
//um m�dulo diferente que n�o exporte o pacote onde ele est�)

public class Order {
	
	private Date date;
	private Product product;
	
	
	public Order(Date date, Product product) {
		super();
		this.date = date;
		this.product = product;
		this.product.name = "TV"; //n�o deu erro pois neste pacote, o "name" da classe product n�o tem mais modificador de acesso
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
