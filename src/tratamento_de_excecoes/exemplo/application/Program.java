package tratamento_de_excecoes.exemplo.application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import tratamento_de_excecoes.exemplo.model.entities.Reservation;

public class Program {

	public static void main(String[] args) throws ParseException {
		//se não tratar a exceção, adiciona throws ParseException 
		//e neste caso propaga a exceção, ainda tendo que tratá-la
		//ou também adicionar o throws em outros métodos que chamem o main		
		
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("Número do quarto: ");
		int number = sc.nextInt();
		
		System.out.println("Data de check-in (dd/MM/yyyy)");
		Date checkIn = sdf.parse(sc.next());
		
		System.out.println("Data de check-out (dd/MM/yyyy)");
		Date checkOut = sdf.parse(sc.next());
	
		if (!checkOut.after(checkIn)) {
			System.out.println("Erro na reserva: data de check-out"
					+ " deve ser posterior a data de check-in");
		}
		
		else {
			Reservation reservation = new Reservation(number, checkIn, checkOut);
			System.out.println("Reservation: " + reservation);
			
			System.out.println("------------------------------------");
			
			System.out.println("Digite os dados atualizados da reserva: ");			
			System.out.println("Data de check-in (dd/MM/yyyy)");
			checkIn = sdf.parse(sc.next());			
			System.out.println("Data de check-out (dd/MM/yyyy)");
			checkOut = sdf.parse(sc.next());
			
			String error = reservation.updateDates(checkIn, checkOut);
			
			if (error != null) {
				System.out.println("Erro na reserva: " + error);
			}
			
			else {
				System.out.println("Reservation: " + reservation);
			}		
		}				
		
		sc.close();
		
	}

}
