package restoranii.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.JoinColumn;
import javax.persistence.Table;
import static javax.persistence.GenerationType.IDENTITY;

import java.io.Serializable;
import java.util.Set;

@Entity
@Table(name = "Guests")
public class Guest implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1170576326191940629L;
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "guest_id", unique = true, nullable = false)
	private Integer id;
	@Column(name = "email", unique = true, nullable = false)
	private String email;
	@Column(name = "password", unique = false, nullable = false)
	private String password;
	@Column(name = "name", unique = false, nullable = false)
	private String name;
	@Column(name = "surname", unique = false, nullable = false)
	private String surname;
	@Column(name = "activated", unique = false, nullable = false)
	private boolean activated;
	@Column(name = "address", unique = false, nullable = false)
	private String address;

	@ManyToMany
	@JoinTable(name = "Friends", joinColumns = @JoinColumn(name = "friendId", referencedColumnName = "guest_id"), inverseJoinColumns = @JoinColumn(name = "personId", referencedColumnName = "guest_id"))
	private Set<Guest> friendOf;

	@ManyToMany(mappedBy = "friendOf")
	private Set<Guest> friends;

	@ManyToMany
	@JoinTable(name = "GuestReservation", joinColumns = @JoinColumn(name = "personId", referencedColumnName = "guest_id"), inverseJoinColumns = @JoinColumn(name = "reservationId", referencedColumnName = "reservation_id"))
	private Set<Reservation> reservations;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public boolean isActivated() {
		return activated;
	}

	public void setActivated(boolean activated) {
		this.activated = activated;
	}

	public Set<Guest> getFriends() {
		return friends;
	}

	public void setFriends(Set<Guest> friends) {
		this.friends = friends;
	}

	public Set<Reservation> getReservations() {
		return reservations;
	}

	public void setReservations(Set<Reservation> reservations) {
		this.reservations = reservations;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Set<Guest> getFriendOf() {
		return friendOf;
	}

	public void setFriendOf(Set<Guest> friendOf) {
		this.friendOf = friendOf;
	}

	public Guest(Integer id, String email, String password, String name, String surname, boolean activated,
			String address, Set<Guest> friendOf, Set<Guest> friends, Set<Reservation> reservations) {
		super();
		this.id = id;
		this.email = email;
		this.password = password;
		this.name = name;
		this.surname = surname;
		this.activated = activated;
		this.address = address;
		this.friendOf = friendOf;
		this.friends = friends;
		this.reservations = reservations;
	}

	public Guest() {
		super();
	}

}
