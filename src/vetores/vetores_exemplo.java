/*
 * Estrutura de dados:
 * - Homogênea (mesmo tipo)
 * - Ordenada (elementos acessados por posições)
 * - Alocada de uma vez só em um bloco contíguo de memória
 * 
 * Vantagens: acesso imediato aos elementos através da posição
 * Desvantagens: tamano fixo, dificuldade para inserir e deletar  
 * 
 */

/*  Fazer um programa para ler um número N e N alturas de N pessoas,
 *   armazenando num vetor e calcular a média das alturas
 */

package vetores;

import java.util.Locale;
import java.util.Scanner;

public class vetores_exemplo {
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Quantas alturas serão calculadas? ");
		int n = sc.nextInt();
		double[] vet = new double[n];
		
		//laço for para popular o vetor
		
		for (int i = 0; i<n; i++) {
			System.out.println("Digite uma altura: ");
			System.out.println("Total de alturas digitadas: " + i + " de " + n);
			vet[i] = sc.nextDouble();
			
		}
			
		double soma = 0;
		
		//laço for para percorrer o vetor e somar os elementos 
		for (int j = 0; j<n; j++) {
			soma += vet[j];
		}
		
		//soma dividido pelo número de elementos 
		double media = soma / n;
		
		System.out.printf("Média = %.2f " , media);
		
		sc.close();
		
		
	}
	
	
	

}
