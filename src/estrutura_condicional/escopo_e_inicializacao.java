package estrutura_condicional;

public class escopo_e_inicializacao {

	public static void main(String[] args) {
		
		double price = 400.00;
		//double price; ---> n�o inicializou, d� erro 
		
		double discount = 0; //tem que iniciar aqui
		
		if (price < 200.00) {
			discount = price * 0.1; //se declarar somente aqui, d� erro (escopo)
		}
		
		System.out.println(discount);
		
	}

}
