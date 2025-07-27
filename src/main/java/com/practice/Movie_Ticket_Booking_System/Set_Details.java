package com.practice.Movie_Ticket_Booking_System;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import MovieTicketBooking.Utility.MovieTicketUtility;
import movieTicket.Entity.Bookings;
import movieTicket.Entity.Movies;

public class Set_Details {

	public static void main(String[] args) {

		SessionFactory factory = MovieTicketUtility.getSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();

		Bookings b = new Bookings();
		b.setMovieName("M.S.D");
		b.setSeatsBooked(2);
		b.setShowTime("12:00");
		b.setCustomerName("Tonny D");

		Bookings b1 = new Bookings();
		b1.setMovieName("Sitare Zamin Par");
		b1.setSeatsBooked(3);
		b1.setShowTime("12:00");
		b1.setCustomerName("Alice");

		Bookings b2 = new Bookings();
		b2.setMovieName("Mitva");
		b2.setSeatsBooked(4);
		b2.setShowTime("1:00");
		b2.setCustomerName("john");

		Movies m = new Movies();
		m.setMovieName("3 Idiots");
		m.setMovieTime(LocalDateTime.now());
		m.setMovieDate(LocalDateTime.now());

		Movies m1 = new Movies();
		m1.setMovieName("Chintu");
		m1.setMovieTime(LocalDateTime.now());
		m1.setMovieDate(LocalDateTime.now());

		Movies m2 = new Movies();
		m2.setMovieName("Business Man");
		m2.setMovieTime(LocalDateTime.now());
		m2.setMovieDate(LocalDateTime.now());

		List<Movies> mlist = Arrays.asList(m, m1, m2);
		b.setMovies(mlist);
		b1.setMovies(mlist);
		b2.setMovies(mlist);

		session.persist(m);
		session.persist(m1);
		session.persist(m2);

		session.persist(b);
		session.persist(b1);
		session.persist(b2);

		transaction.commit();
		session.close();

		System.out.println("Details set");

	}
}
