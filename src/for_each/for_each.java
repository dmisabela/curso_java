package for_each;

public class for_each {

	public static void main(String[] args) {


		String [] vect = new String[] {"Isabela", "Rosana", "Davi"};
		//instanciando um vetor com 3 posi��es
		
		//for convencional 
		for (int i=0; i<vect.length; i++) {
			System.out.println(vect[i]);
		}
		
		System.out.println("------------------");
		
		//la�o for each
		//para cada objeto 'i' contido no vetor 'vect', fa�a
		for (String i : vect) {
			System.out.println(i);
		}

	}

}
