package estrutura_condicional;

import java.util.Locale;

public class condicional_ternaria {
	
	// ( condicao ) ? valor_se_verdadeiro : valor_se_falso 

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
//		double preco = 34.5;
//		double desconto;
//		
//		if (preco < 20.0) {
//			desconto = preco * 0.1;
//		}
//		else {
//			desconto = preco * 0.05;
//		}
		
		double preco = 37.5;
		double desconto = (preco < 20.0) ? preco * 0.1 : preco * 0.05;		
		// ( condicao ) ? valor_se_verdadeiro : valor_se_falso 
		System.out.println(desconto);
	}

}
