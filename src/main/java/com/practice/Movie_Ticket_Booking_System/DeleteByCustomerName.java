package com.practice.Movie_Ticket_Booking_System;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import MovieTicketBooking.Utility.MovieTicketUtility;
import movieTicket.Entity.Bookings;

public class DeleteByCustomerName {

	public void deleteName() {

		SessionFactory factory = MovieTicketUtility.getSessionFactory();

		Session session = factory.openSession();

		Transaction transaction = session.beginTransaction();

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Customer Name: ");
		String name = sc.nextLine();
		
		Bookings b = session.find(Bookings.class, name);
        session.remove(b);
		
		transaction.commit();
		session.close();
	}
}
