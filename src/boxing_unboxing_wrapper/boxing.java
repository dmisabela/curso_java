package boxing_unboxing_wrapper;

public class boxing {

	public static void main(String[] args) {


		int x = 20; 
		
		Object obj = x; //boxing 
		
		System.out.println(obj);
		
		int y = (int) obj; //unboxing 
		
		System.out.println(y);
		
		//wrapper
		
		int z = 30;
		
		Integer objj = z; //wrapper equivalente ao int 
		
		//tem objetivo de tratar os tipos primivos como classe sem precisar converter e castings
		
		int q = objj * 2; //n�o precisa for�ar a convers�o 
		
		System.out.println(objj);
		
		/* exemplo de utiliza��o do wapper
		 * 
		 * public class Product {
		 * 
		 * public String name;
		 * public Double price;
		 * public Integer quantity; 
		 * 
		 * }
		 * 
		 *  //neste caso foi declarado como integer pois o campo pode ser 
		 *  //opcional no banco de dados, assim, n�o ter� problema caso o 
		 *  //valor seja nulo, por isso � declarado como tipo primitivo e n�o como classe 
		 * 
		 */
		

	}

}
