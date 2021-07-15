package date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class date {

	public static void main(String[] args) throws ParseException {

		SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yy"); 
		SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yy HH:mm:ss");
		SimpleDateFormat sdf3 = new SimpleDateFormat("dd/MM/yy HH:mm:ss");
		sdf3.setTimeZone(TimeZone.getTimeZone("GMT"));
		
		Date y1 = sdf1.parse("14/07/2021");
		Date y2 = sdf2.parse("14/07/2021 21:03:30");
		Date x1 = new Date(); //hora atual
		Date x2 = new Date(System.currentTimeMillis());
		Date x3 = new Date(0L);
		
		System.out.println(y1);
		System.out.println(y2);
		System.out.println(x1);
		System.out.println(x2);
		System.out.println(x3);
		
		System.out.println("---------------------");
		
		System.out.println("Horário do Brasil");	
		System.out.println(sdf1.format(y1)); //14/07/21
		System.out.println(sdf2.format(y2)); //14/07/21 21:03:30
		System.out.println(sdf2.format(x1)); //SYSDATE //14/07/21 21:13:04
		System.out.println(sdf2.format(x2)); //SYSDATE //14/07/21 21:13:04
		System.out.println(sdf2.format(x3)); //31/12/69 21:00:00
		
		System.out.println("---------------------");
		
		System.out.println("Horário GMT formato UTC");		
		System.out.println(sdf3.format(y1)); //14/07/21 03:00:00
		System.out.println(sdf3.format(y2)); //15/07/21 00:03:30
		System.out.println(sdf3.format(x1)); //15/07/21 00:13:04
		System.out.println(sdf3.format(x2)); //15/07/21 00:13:04
		System.out.println(sdf3.format(x3)); //01/01/70 00:00:00
		
	}

}
