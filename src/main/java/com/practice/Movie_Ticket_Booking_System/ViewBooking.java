package com.practice.Movie_Ticket_Booking_System;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import MovieTicketBooking.Utility.MovieTicketUtility;
import movieTicket.Entity.Bookings;

public class ViewBooking {

	public void viewBooking() {

		SessionFactory factory = MovieTicketUtility.getSessionFactory();

		Session session = factory.openSession();

		Transaction transaction = session.beginTransaction();

		List<Bookings> userList = session.createQuery("select m from Bookings m", 
				Bookings.class).getResultList();
		userList.stream().forEach(a -> System.out.println(a.toString()));

		transaction.commit();
		session.close();
	}

}
