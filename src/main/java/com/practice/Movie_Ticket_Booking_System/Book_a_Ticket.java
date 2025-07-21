package com.practice.Movie_Ticket_Booking_System;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import MovieTicketBooking.Utility.MovieTicketUtility;
import movieTicket.Entity.Bookings;

public class Book_a_Ticket {

	public void bookTicket() {
	SessionFactory factory = MovieTicketUtility.getSessionFactory();
	
	Session session = factory.openSession();
	
	Transaction transaction = session.beginTransaction();
	
	Bookings b = new Bookings();
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Book Your Movie Ticket Here");
	
	System.out.println("Enter Your Ticket Id: ");
	b.setId(sc.nextInt());
	sc.nextLine();
	
	System.out.println("Enter Your Movie Name: ");
	b.setMovieName(sc.nextLine());
	
	System.out.println("Enter Customer Name: ");
	b.setCustomerName(sc.nextLine());
	
	System.out.println("Enter Your Show Time: ");
	b.setShowTime(sc.nextLine());
	
	System.out.println("Enter How many seats you have to book: ");
	b.setSeatsBooked(sc.nextInt());
	

	// 4.save process
	session.persist(b);

	System.out.println("Updated Successfully " + b);
	// 5.pass to database
	transaction.commit();

	
	
}
}