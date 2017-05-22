package Restorani.Model;


@Entity 
@Table(name = "Guests")
public class Guest {
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	private Integer id;
	@Column(name = "email", unique = true , nullable = false)
	private String email;
	@Column(name = "password", unique = false , nullable = false)
	private String password;
	@Column(name = "name", unique = false , nullable = false)
	private String name;
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
	@Column(name = "surname", unique = false , nullable = false)
	private String surname;
	@Column(name = "activated", unique = false , nullable = false)
	private boolean activated;
	
	private Set<Guest> friends;
	private Set<Reservation> reservations;
	@Column(name = "address", unique = false , nullable = false)
	private String address;
}
