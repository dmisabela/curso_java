package entrada_de_dados;

import java.util.Scanner;

public class entrada_de_dados_quebradelinha {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc= new Scanner(System.in);
		
		int x;
		String s1, s2, s3;
		
		System.out.println("Inteiro");
		x = sc.nextInt();
		sc.nextLine(); //quebra de linha pendente
		System.out.println("Linha 1");		
		s1= sc.nextLine();
		System.out.println("Linha 2");
		s2= sc.nextLine();
		System.out.println("Linha 3");
		s3= sc.nextLine();
		
		System.out.println("DADOS DIGITADOS:");
		System.out.println(x);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		sc.close();

	}

}
