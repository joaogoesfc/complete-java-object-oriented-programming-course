package application;

import java.time.LocalDate;
import java.util.Scanner;

import model.entities.Reservation;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Room number: ");
		int number = sc.nextInt();
		System.out.print("Check-in date (dd/MM/yyyy): ");
		LocalDate checkIn = LocalDate.parse(sc.next(), Reservation.fmt);
		System.out.print("Check-out date (dd/MM/yyyy): ");
		LocalDate checkOut = LocalDate.parse(sc.next(), Reservation.fmt);
		
		if (checkOut.isBefore(checkIn)) {
			System.out.println("Errorin reservation: Check-out date must beaftercheck-in date");
		} else {
			Reservation reservation = new Reservation(number, checkIn, checkOut);
			System.out.println("Reservation: " + reservation);
			
			System.out.println();
			System.out.println("Enter data to update the reservation:");
			System.out.print("Check-in date (dd/MM/yyyy): ");
			checkIn = LocalDate.parse(sc.next(), Reservation.fmt);
			System.out.print("Check-out date (dd/MM/yyyy): ");
			checkOut = LocalDate.parse(sc.next(), Reservation.fmt);
			
			LocalDate now = LocalDate.now();
			if (checkIn.isBefore(now) || checkOut.isBefore(now)){
				System.out.println("Errorin reservation: Reservation dates for update must be future dates");
			} else if (checkOut.isBefore(checkIn)) {
				System.out.println("Errorin reservation: Check-out date must be after check-in date");
			} else {
				reservation.updateDates(checkIn, checkOut);
				System.out.println("Reservation: " + reservation);
			}
		
		}
		
		
		sc.close();
	}

}
