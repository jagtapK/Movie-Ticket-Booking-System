package com.practice.Movie_Ticket_Booking_System;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import MovieTicketBooking.Utility.MovieTicketUtility;
import movieTicket.Entity.Bookings;

public class UpdateSeats {

	public void NoOfSeats() {
		
		SessionFactory factory = MovieTicketUtility.getSessionFactory();

		Session session = factory.openSession();

		Transaction transaction = session.beginTransaction();

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Id: ");
		int id = sc.nextInt();
		sc.nextLine();
		
		Bookings b = session.find(Bookings.class, id);
		
		System.out.println("Enter Available Seats");
		int seats = sc.nextInt();
		b.setSeatsBooked(seats);
		
		transaction.commit();

		session.close();
		
		System.out.println("Update Available Seats");
	}
}
