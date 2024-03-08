package model.entities;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

import model.exception.DomainException;

public class Reservation {

	private Integer roomNumber;
	private LocalDate checkIn;
	private LocalDate checkOut;
	
	public static DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	
	public Reservation(Integer roomNumber, LocalDate checkIn, LocalDate checkout)throws DomainException {
		updateDates(checkIn, checkout);
		this.roomNumber = roomNumber;
	}

	public Integer getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(Integer roomNumber) {
		this.roomNumber = roomNumber;
	}

	public LocalDate getCheckIn() {
		return checkIn;
	}

	public LocalDate getCheckout() {
		return checkOut;
	}
	
	public int duration() {
		Period period = Period.between(checkIn, checkOut);
		return period.getDays();
	}
	
	public void updateDates (LocalDate checkIn, LocalDate checkOut)throws DomainException{
		
		LocalDate now = LocalDate.now();
		if (checkIn.isBefore(now) || checkOut.isBefore(now)){
			throw new DomainException("Reservation dates must be future dates");
		}
		if (checkOut.isBefore(checkIn)) {
			throw new DomainException("Check-out date must be after check-in date");
		}
		this.checkIn = checkIn;
		this.checkOut = checkOut;
	}
 	
	@Override
	public String toString() {
		return "Room "
				+ roomNumber
				+ ", check-in: "
				+ fmt.format(checkIn)
				+ ", check-out: "
				+ fmt.format(checkOut)
				+", " + duration() + " nights";
	}
}
