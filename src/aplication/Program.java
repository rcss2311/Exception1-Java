package aplication;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import model.entities.Reservation;
import model.exception.DomainException;

public class Program {

	public static void main(String[] args)  {
		
	
			Scanner sc = new Scanner(System.in);
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	try {		
			System.out.print("Room number: ");
			int roomNumber = sc.nextInt();
			System.out.print("Check In date (dd/MM/yyyy): ");
			Date checkIn = sdf.parse(sc.next());
			System.out.print("Check out date (dd/MM/yyyy: )");
			Date checkOut = sdf.parse(sc.next());
			
			Reservation reservation = new Reservation(roomNumber, checkIn, checkOut);
			System.out.println(reservation);
			
			
			System.out.println();
			System.out.println("Enter data to update the reservation ");
			System.out.print("Check In date (dd/MM/yyyy): ");
			checkIn = sdf.parse(sc.next());
			System.out.print("Check out date (dd/MM/yyyy: )");
			checkOut = sdf.parse(sc.next());
			
			
			reservation.updateDate(checkIn, checkOut);
			System.out.println("Reservatio: "+reservation);
       }
	catch (ParseException e){
		System.out.println("Invalid Date Format!");
	}
	catch (DomainException e) {
		System.out.println("Error in reservation: "+e.getMessage());
	}
	
	
	sc.close();
	

}}
