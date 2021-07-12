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
		
		int q = objj * 2; //não precisa forçar a conversão 
		
		System.out.println(objj);
		
		/* exemplo de utilização do wapper
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
		 *  //opcional no banco de dados, assim, não terá problema caso o 
		 *  //valor seja nulo, por isso é declarado como tipo primitivo e não como classe 
		 * 
		 */
		

	}

}
