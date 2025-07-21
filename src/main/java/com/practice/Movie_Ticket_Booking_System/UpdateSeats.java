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
		System.out.println("Enter Available Seats: ");
		int seats = sc.nextInt();
		
		Bookings b = session.find(Bookings.class, seats);
		System.out.println(b.toString());
		
		transaction.commit();

		session.close();
	}
}
