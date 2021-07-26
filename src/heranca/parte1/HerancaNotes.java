package heranca.parte1;

public class HerancaNotes {
	
	/*
	 * -------------------------------------- HERAN�A --------------------------------------
	 * 
	 * - Permite que uma classe herde todos os dados e comportamentos de outra
	 * - Vantagens: Reuso e polimorfismo
	 * - Sintaxe: class A extends B 
	 * 
	 * ---> � uma rela��o "�-um" (uma conta empresarial � uma conta)
	 * ---> Generaliza��o (classe Account � a classe geral) e especializa��o
	 * ---> Superclasse (classe base) / subclasse (classe derivada)
	 * ---> Heran�a / extens�o
	 * ---> � uma associa��o entre classes e n�o entre objetos 
	 * (pois um objeto do tipo BusinessAccount vai ser um objeto s� 
	 * com atributos e m�todos da superclasse, e n�o dois objetos)
	 * 
	 * -- Program1 --
	 * 
	 * ---> Upcasting: casting da subclasse para superclasse
	 * ---> Downcasting: casting da superclasse para subclasse -> instanceof / equals (par�metros gen�ricos)
	 * 
	 * -- Program2 --
	 * 
	 * ---> Sobreposi��o ou sobrescrita: implementa��o de um m�todo de uma superclasse na subclasse
	 * - recomendado utilizar @Override em um m�todo sobrescrito 
	 * - facilita a leitura e compreens�o do c�digo
	 * - avisamos ao compilador (boa pr�tica)
	 * (exemplo em SavingsAccount)
	 * 
	 * ---> Super: � poss�vel chamar a implementa��o da superclasse usando a palavra Super
	 * (exemplo em BusinessAccount)
	 * 
	 * ------------------------------------------------------------------------------------
	 * 
	 * ---> Classes e m�todos final
	 * - Evita que uma classe seja herdada
	 * - Evita que um m�todo seja sobreposto
	 * - � recomendado acrescentar o final em sobreposi��es de m�todos para n�o ocorrer
	 * sobreposi��es m�ltiplas, que ocasiona inconsist�ncias 
	 * (exemplo em SavingsAccount e SavingsAccountPlus)
	 * 
	 * -- Program 3 --
	 * 
	 * ---> Polimorfismo
	 * - Permite que vari�veis de um mesmo tipo gen�rico possam apontar para objetos
	 * de tipos espec�ficos diferentes, tendo comportamentos diferentes em cada tipo. 
	 * 
	 */	

}
