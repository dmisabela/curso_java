package tratamento_de_excecoes;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Finally {
	
	
	public static void main(String[] args) {
		
		//File file = new File("C:\\temp\\in.txt"); //não existe - dá erro
		
		File file = new File("C:\\temp\\java.txt"); //criado o arquivo
		
		Scanner sc = null;
		
		try {
			sc = new Scanner(file);
			while (sc.hasNextLine()) {
				System.out.println(sc.nextLine());
				//percorre as linhas do arquivo
			}
		}		
		catch (FileNotFoundException e) {
		
			System.out.println("Erro ao abrir arquivo " + e.getMessage());
			//erro: (O sistema não pode encontrar o arquivo especificado)
		}		
		finally {
		
			if (sc != null) {
				sc.close(); //fecha o scanner para não deixar o arq. aberto
			}
			
			System.out.println("Finally block executed");
			
		}
	}

}
