package restoranii.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import static javax.persistence.GenerationType.IDENTITY;

import java.sql.Date;
import java.util.Set;

@Entity 
@Table(name = "Reservations")
public class Reservation {
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	private Integer id;
	private Set<Guest> guests;
	@Column(name = "date", unique = false , nullable = false)
	private Date date;
	@Column(name = "duration", unique = false , nullable = false)
	private Integer duration;
	@Column(name = "complete", unique = false , nullable = false)
	private boolean complete;
	private Set<Table> tables;
	
	
	
	public Reservation() {
		super();
	}
	
	public Integer getId() {
		return id;
	}
	public Set<Guest> getGuests() {
		return guests;
	}
	public void setGuests(Set<Guest> guests) {
		this.guests = guests;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Integer getDuration() {
		return duration;
	}
	public void setDuration(Integer duration) {
		this.duration = duration;
	}
	public boolean isComplete() {
		return complete;
	}
	public void setComplete(boolean complete) {
		this.complete = complete;
	}
	public Set<Table> getTables() {
		return tables;
	}
	public void setTables(Set<Table> tables) {
		this.tables = tables;
	}
	
	
}
