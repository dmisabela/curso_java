package composicao_sb;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Program {

	public static void main(String[] args) throws ParseException {

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyy HH:mm:ss");
		
		Comment c1 = new Comment("Boa viagem!!"); 
		Comment c2 = new Comment("Top!");
				
		Post p1 = new Post(
				sdf.parse("19/07/2021 21:01:51"),
				"Viajando para SP",
				"Visitando minha terra", 
				88);
		
		p1.addComment(c1);
		p1.addComment(c2);
		
		System.out.println(p1);
		

	}

}