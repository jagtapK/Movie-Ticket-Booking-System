package movieTicket.Entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "booking")
public class Bookings {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String movieName;
	
	private String customerName;
	private String showTime;
	
	private int seatsBooked;

	@ManyToMany
	private List<Movies> movies;
	
	public List<Movies> getMovies() {
		return movies;
	}

	public void setMovies(List<Movies> movies) {
		this.movies = movies;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getShowTime() {
		return showTime;
	}

	public void setShowTime(String showTime) {
		this.showTime = showTime;
	}

	public int getSeatsBooked() {
		return seatsBooked;
	}

	public void setSeatsBooked(int seatsBooked) {
		this.seatsBooked = seatsBooked;
	}

	@Override
	public String toString() {
		return "Bookings [id=" + id + ", movieName=" + movieName + ", customerName=" + customerName + ", showTime="
				+ showTime + ", seatsBooked=" + seatsBooked + "]";
	}
	
	
	
}
