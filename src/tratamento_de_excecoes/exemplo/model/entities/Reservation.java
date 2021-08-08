package tratamento_de_excecoes.exemplo.model.entities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import tratamento_de_excecoes.model.exceptions.DomainException;

public class Reservation {
	
	private Integer roomNumber;
	private Date checkIn;
	private Date checkOut;
	
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	//coloco como estático para que não seja instanciado um novo sdf a cada
	//objeto da classe Reservation, pois precisaremos de apenas um 
	
	public Reservation(Integer roomNumber, Date checkIn, Date checkout) throws DomainException {	
		
		Date now = new Date(); 		

		this.roomNumber = roomNumber;
		this.checkIn = checkIn;
		this.checkOut = checkout;
		
		if (!checkOut.after(checkIn)) { 
			throw new DomainException("Data de check-out deve ser posterior a data de check-in");				
		}
		
		if (checkIn.before(now) || checkOut.before(now)) {					
			throw new DomainException("As datas devem ser futuras.");			
		}
		
	}

	public Integer getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(Integer roomNumber) {
		this.roomNumber = roomNumber;
	}

	public Date getCheckIn() {
		return checkIn;
	}

	public Date getCheckout() {
		return checkOut;
	}
	
	//apaga set checkin e set checkout pois 
	//isso será feito pelo updateDates()
	
	
	public long duration() {
	//diferença entre duas datas
		
		long diff = checkOut.getTime() - checkIn.getTime(); 
		//diferença das datas em milissegundos
		
		return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
		//converte novamente para data 	
		
	}
	
	public void updateDates(Date checkIn, Date checkOut) throws DomainException {
										//agora este método pode lançar uma exceção
										//mas o tratamento é feito no main 
		
		Date now = new Date(); 
		
		if (checkIn.before(now) || checkOut.before(now)) {
			
			throw new DomainException("As datas devem ser futuras.");
			
			//throw new IllegalArgumentException("As datas devem ser futuras.");
			//a exceção é usada quando os argumentos passados ao método são inválidos
		}
		
		if (!checkOut.after(checkIn)) { 
			throw new DomainException("Data de check-out deve ser posterior a data de check-in");				
		}
		
		this.checkIn = checkIn;
		this.checkOut = checkOut;
	}
	
	@Override
	public String toString() {
		return "Room " + roomNumber 
				+ ", checkIn: " + sdf.format(checkIn)
				+ ", checkOut: " + sdf.format(checkOut)
				+ ", " + duration() + " nights";
	}
	

}
