package restoranii.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import static javax.persistence.GenerationType.IDENTITY;

import java.io.Serializable;
import java.sql.Date;
import java.util.Set;

@Entity
@Table(name = "Reservations")
public class Reservation implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 4549473077123823548L;
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "reservation_id", unique = true, nullable = false)
	private Integer id;

	@ManyToMany(mappedBy = "reservations")
	private Set<Guest> guests;

	@Column(name = "date", unique = false, nullable = false)
	private Date date;

	@Column(name = "duration", unique = false, nullable = false)
	private Integer duration;

	@Column(name = "complete", unique = false, nullable = false)
	private boolean complete;

	@ManyToMany
	@JoinTable(name = "TableReservation", joinColumns = @JoinColumn(name = "reservationId", referencedColumnName = "reservation_id"), inverseJoinColumns = @JoinColumn(name = "tableId", referencedColumnName = "table_id"))
	private Set<RestaurantTable> tables;

	public Reservation() {
		super();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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

	public Set<RestaurantTable> getTables() {
		return tables;
	}

	public void setTables(Set<RestaurantTable> tables) {
		this.tables = tables;
	}

	public Reservation(Integer id, Set<Guest> guests, Date date, Integer duration, boolean complete,
			Set<RestaurantTable> tables) {
		super();
		this.id = id;
		this.guests = guests;
		this.date = date;
		this.duration = duration;
		this.complete = complete;
		this.tables = tables;
	}

}
