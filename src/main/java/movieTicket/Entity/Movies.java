package movieTicket.Entity;

import java.time.LocalDateTime;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class Movies {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String MovieName;

	private LocalDateTime MovieTime;
	private LocalDateTime MovieDate;

	@ManyToMany(mappedBy = "movies")
	private List<Bookings> booking;

	public List<Bookings> getBooking() {
		return booking;
	}

	public void setBooking(List<Bookings> booking) {
		this.booking = booking;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMovieName() {
		return MovieName;
	}

	public void setMovieName(String movieName) {
		MovieName = movieName;
	}

	public LocalDateTime getMovieTime() {
		return MovieTime;
	}

	public void setMovieTime(LocalDateTime movieTime) {
		MovieTime = movieTime;
	}

	public LocalDateTime getMovieDate() {
		return MovieDate;
	}

	public void setMovieDate(LocalDateTime movieDate) {
		MovieDate = movieDate;
	}

	@Override
	public String toString() {
		return "Movies [id=" + id + ", MovieName=" + MovieName + ", MovieTime=" + MovieTime + ", MovieDate=" + MovieDate
				+ ", booking=" + booking + "]";
	}

}
