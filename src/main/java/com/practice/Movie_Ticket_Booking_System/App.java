package com.practice.Movie_Ticket_Booking_System;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Movie Ticket Booking System! ");

		System.out.println("Choose an option:" + "\n1.Book a Ticket " + "\n2.Delete By Customer Name "
				+ "\n3.Update Available Seats " + "\n4.View Booking" + "\n5. Set Details" + "\n6. Exit");

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Choice");

		int choice = sc.nextInt();
		sc.nextLine();

		switch (choice) {

		case 1:
			Book_a_Ticket b1 = new Book_a_Ticket();
			b1.bookTicket();
			break;

		case 2:
			DeleteByCustomerName d1 = new DeleteByCustomerName();
			d1.deleteName();
			break;

		case 3:
			UpdateSeats u1 = new UpdateSeats();
			u1.NoOfSeats();
			break;

		case 4:
			ViewBooking v1 = new ViewBooking();
			v1.viewBooking();
			break;

		case 5:
			Set_Details d = new Set_Details();
			d.Details();
			break;

		case 6:
			System.out.println("Exiting program. Goodbye!");
			System.exit(0); // Terminates the program immediately
			break;
		}
	}
}
