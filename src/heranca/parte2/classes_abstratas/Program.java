package heranca.parte2.classes_abstratas;

import java.util.ArrayList;
import java.util.List;

public class Program {
	
	public static void main(String[] args) {
		
//		Account acc1 = new Account(1001, "Isabela", 1000.0);
		//não vai ser possível instanciar pois acrescentamos "abstract"
		
//		Account acc2 = new SavingsAccount(1002, "Rosana", 1000.0, 0.01);
//		Account acc3 = new BusinessAccount(1003, "Davi", 1000.0, 500.0);
		//variáveis do tipo Account, mas instanciando com tipos diferentes (polimorf.)
		
		List<Account> list = new ArrayList<>();
		// a lista será do tipo genérico e será possível inserir por meio do upcasting
		//objetos do tipo SavingsAccount e outros do tipo BusinessAccount 
		
		list.add(new SavingsAccount(1002, "Rosana", 1000.0, 0.01));
		list.add(new BusinessAccount(1003, "Davi", 1000.0, 500.0));
		
		//soma de todos os saldos
		double soma = 0.0;
		for (Account acc : list) {
			soma += acc.getBalance();
		}
		
		System.out.println("Saldo total: " + soma);
		
		//depositando valor de R$10.00 para cada conta
		for (Account acc : list) {
			acc.Depositar(10.0);
		}
		
		//exibindo contas atualizadas
		for (Account acc : list) {
			System.out.println("Saldo atual da conta " 
					+ acc.getNumber() + ": " + acc.getBalance());
		}		
		
	}

}

//CLASSES ABSTRATAS

//São classes que não podem ser instanciadas, garantindo herança total
//Somente as subclasses não-abstratas podem ser instanciadas, mas nunca a superclasse abstrata
//Notação UML: itálico 

//Por que criar se não pode ser instanciada?
//-- Reuso: para poder setar as definições uma vez só na superclasse
//-- Polimorfismo: a superclasse genérica permite tratar todos os tipos de conta 


