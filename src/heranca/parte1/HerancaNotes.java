package heranca.parte1;

public class HerancaNotes {
	
	/*
	 * -------------------------------------- HERANÇA --------------------------------------
	 * 
	 * - Permite que uma classe herde todos os dados e comportamentos de outra
	 * - Vantagens: Reuso e polimorfismo
	 * - Sintaxe: class A extends B 
	 * 
	 * ---> É uma relação "é-um" (uma conta empresarial é uma conta)
	 * ---> Generalização (classe Account é a classe geral) e especialização
	 * ---> Superclasse (classe base) / subclasse (classe derivada)
	 * ---> Herança / extensão
	 * ---> É uma associação entre classes e não entre objetos 
	 * (pois um objeto do tipo BusinessAccount vai ser um objeto só 
	 * com atributos e métodos da superclasse, e não dois objetos)
	 * 
	 * -- Program1 --
	 * 
	 * ---> Upcasting: casting da subclasse para superclasse
	 * ---> Downcasting: casting da superclasse para subclasse -> instanceof / equals (parâmetros genéricos)
	 * 
	 * -- Program2 --
	 * 
	 * ---> Sobreposição ou sobrescrita: implementação de um método de uma superclasse na subclasse
	 * - recomendado utilizar @Override em um método sobrescrito 
	 * - facilita a leitura e compreensão do código
	 * - avisamos ao compilador (boa prática)
	 * (exemplo em SavingsAccount)
	 * 
	 * ---> Super: é possível chamar a implementação da superclasse usando a palavra Super
	 * (exemplo em BusinessAccount)
	 * 
	 * ------------------------------------------------------------------------------------
	 * 
	 * ---> Classes e métodos final
	 * - Evita que uma classe seja herdada
	 * - Evita que um método seja sobreposto
	 * - É recomendado acrescentar o final em sobreposições de métodos para não ocorrer
	 * sobreposições múltiplas, que ocasiona inconsistências 
	 * (exemplo em SavingsAccount e SavingsAccountPlus)
	 * 
	 * -- Program 3 --
	 * 
	 * ---> Polimorfismo
	 * - Permite que variáveis de um mesmo tipo genérico possam apontar para objetos
	 * de tipos específicos diferentes, tendo comportamentos diferentes em cada tipo. 
	 * 
	 */	

}
