package restoranii.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Table(name = "RestaurantManager")

public class RestaurantManager implements Serializable {

	@Id
	@GeneratedValue(strategy=IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	private Integer id;
	
	@Column(name = "name", unique = false , nullable = false)
	private String name;
	
	@Column(name = "lastname", unique = false , nullable = false)
	private String lastname;
	
	@Column(name = "email", unique = true, nullable = false)
	private String email;
	
	@Column(name="pasword", unique=false, nullable = false)
	private String password;
	
	@ManyToOne
	@JoinColumn(name = "restaurant", referencedColumnName = "restaurant_id", nullable = false)
	private Restaurant restaurant;

	public Integer getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
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

	public Restaurant getRestaurant() {
		return restaurant;
	}

	public void setRestaurant(Restaurant restaurant) {
		this.restaurant = restaurant;
	}

	public RestaurantManager(){}

	public RestaurantManager(Integer id, String name, String lastname, String email, String password,
			Restaurant restaurant) {
		super();
		this.id = id;
		this.name = name;
		this.lastname = lastname;
		this.email = email;
		this.password = password;
		this.restaurant = restaurant;
	}
	
	private static final long serialVersionUID = -2306126240267945807L;
}
