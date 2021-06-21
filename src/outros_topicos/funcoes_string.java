package outros_topicos;

public class funcoes_string {
	
	public static void main (String[] args) {
		
		String original = "abcde FGHIJK lmnop QRSTUV wxyz aaaA bc    ";
				
			String s01 = original.toLowerCase(); //letras minusculas
			String s02 = original.toUpperCase(); //letras maiúsculas
			String s03 = original.trim(); //tira o espaço em branco do final
			String s04 = original.substring(2); //somente caracter da posição 2 em diante
			String s05 = original.substring(2, 9); //dos caracteres de posição 2 a 9
			String s06 = original.replace('a', 'x'); //troca todos do primeiro pelo segundo
			String s07 = original.replace("abc", "xy"); //troca trechos 
			
			int i = original.indexOf("bc"); //vai achar a primeira posição do 'bc' (1)
			int j = original.lastIndexOf("bc"); //acha a ultima posição q mostra 'bc'
			
			System.out.println("Original: " + original + "(fim)");
			System.out.println("toLowerCase" + s01 + "(fim)"); 
			System.out.println("toUpperCase" + s02 + "(fim)"); 
			System.out.println("trim: " + s03 + "(fim)");  
			System.out.println("substring: " + s04 + "(fim)");  
			System.out.println("substring: " + s05 + "(fim)");  
			System.out.println("replace: " + s06 + "(fim)");  
			System.out.println("replace: " + s07 + "(fim)");  
			System.out.println("indexOf: " + i);  
			System.out.println("lastIndexOf: " + j); 
			
			System.out.println("----------------------------------");
			
			String s = "potato apple lemon orange"; //recebe um separador e gera um vetor com
			//as partes do string de acordo com o separador informado 
			
			String[] vect = s.split(" ");
			String word1 = vect[0];
			String word2 = vect[1];
			String word3 = vect[2];
			
			System.out.println(word1); //potato
			System.out.println(vect[3]); //orange
		
		}

}
