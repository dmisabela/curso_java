package enumeracoes;

import java.util.Date;

public class Program {
	
	public static void main(String[] args) {
		
		Order order = new Order(1080, new Date(), OrderStatus.PENDING_PAYMENT);
		
		System.out.println(order);
		
		
		//convertendo string para enum 
		
		OrderStatus os1 = OrderStatus.DELIVERED;
		OrderStatus os2 = OrderStatus.valueOf("DELIVERED"); 
		
		System.out.println(os1 + " "  + os2);
		
	}

}
