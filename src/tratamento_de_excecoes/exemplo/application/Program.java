package tratamento_de_excecoes.exemplo.application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import tratamento_de_excecoes.exemplo.model.entities.Reservation;
import tratamento_de_excecoes.model.exceptions.DomainException;

public class Program {

	public static void main(String[] args) {
		//se n�o tratar a exce��o, adiciona throws ParseException 
		//e neste caso propaga a exce��o, ainda tendo que trat�-la
		//ou tamb�m adicionar o throws em outros m�todos que chamem o main		
		
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		try { 
			
			System.out.println("N�mero do quarto: ");
			int number = sc.nextInt();
			
			System.out.println("Data de check-in (dd/MM/yyyy)");
			Date checkIn = sdf.parse(sc.next());
			
			System.out.println("Data de check-out (dd/MM/yyyy)");
			Date checkOut = sdf.parse(sc.next());				
			
			Reservation reservation = new Reservation(number, checkIn, checkOut);
			System.out.println("Reservation: " + reservation);
			
			System.out.println("------------------------------------");
			
			System.out.println("Digite os dados atualizados da reserva: ");			
			System.out.println("Data de check-in (dd/MM/yyyy)");
			checkIn = sdf.parse(sc.next());			
			System.out.println("Data de check-out (dd/MM/yyyy)");
			checkOut = sdf.parse(sc.next());
			
			reservation.updateDates(checkIn, checkOut);
			System.out.println("Reservation: " + reservation);		
			
		}
		
		catch (ParseException e) {
			System.out.println("Formato de data inv�lida.");
		}
		
		catch (DomainException e) {
			System.out.println("Erro na reserva: " + e.getMessage());
		}			
		
		catch (Exception e) {
			System.out.println("Erro inesperado");
			//qualquer erro que ocorrer al�m dos que foram tratados 
		}
		
		sc.close();
		
	}

}
