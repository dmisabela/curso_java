/*
 * Estrutura de dados:
 * - Homog�nea (mesmo tipo)
 * - Ordenada (elementos acessados por posi��es)
 * - Alocada de uma vez s� em um bloco cont�guo de mem�ria
 * 
 * Vantagens: acesso imediato aos elementos atrav�s da posi��o
 * Desvantagens: tamano fixo, dificuldade para inserir e deletar  
 * 
 */

/*  Fazer um programa para ler um n�mero N e N alturas de N pessoas,
 *   armazenando num vetor e calcular a m�dia das alturas
 */

package vetores;

import java.util.Locale;
import java.util.Scanner;

public class vetores_exemplo {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Quantas alturas ser�o calculadas? ");
		int n = sc.nextInt();
		double[] vet = new double[n];
		
		//la�o for para popular o vetor
		
		for (int i = 0; i<n; i++) {
			System.out.println("Digite uma altura: ");
			System.out.println("Total de alturas digitadas: " + i + " de " + n);
			vet[i] = sc.nextDouble();
			
		}
			
		double soma = 0;
		
		//la�o for para percorrer o vetor e somar os elementos 
		for (int j = 0; j<n; j++) {
			soma += vet[j];
		}
		
		//soma dividido pelo n�mero de elementos 
		double media = soma / n;
		
		System.out.printf("M�dia = %.2f " , media);
		
		sc.close();
		
		
	}
	
	
	

}
