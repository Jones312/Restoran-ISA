package Restorani.Model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.OneToMany;
import static javax.persistence.GenerationType.IDENTITY;
import static javax.persistence.CascadeType.ALL;
import static javax.persistence.FetchType.LAZY;

@Entity 
@Table(name = "Restaurant")


public class Restaurant implements Serializable {

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	private Integer id;
	
	@Column(name = "name", unique = false , nullable = false)
	private String name;
	
	@Column(name = "type", unique = false , nullable = false)
	private String type;
	
	@OneToMany(cascade = {ALL}, fetch = LAZY, mappedBy = "Food")
	private List<Food> food;
	
	@OneToMany(cascade = {ALL}, fetch = LAZY, mappedBy = "Food")
	private List<Beverage> drink;
	
	@OneToMany(cascade = {ALL}, fetch = LAZY, mappedBy = "RestaurantManager")
	private List<RestaurantManager> restaurantManagers;
	
	@OneToMany(cascade = {ALL}, fetch = LAZY, mappedBy = "post")
	private List<Post> posts;
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public List<Food> getFood() {
		return food;
	}

	public void setFood(List<Food> food) {
		this.food = food;
	}

	public List<Beverage> getDrink() {
		return drink;
	}

	public void setDrink(List<Beverage> drink) {
		this.drink = drink;
	}

	public List<RestaurantManager> getRestaurantManagers() {
		return restaurantManagers;
	}

	public void setRestaurantManagers(List<RestaurantManager> restaurantManagers) {
		this.restaurantManagers = restaurantManagers;
	}

	public Restaurant() {}



	public Restaurant(Integer id, String name, String type, List<Food> food, List<Beverage> drink,
			List<RestaurantManager> restaurantManagers) {
		super();
		this.id = id;
		this.name = name;
		this.type = type;
		this.food = food;
		this.drink = drink;
		this.restaurantManagers = restaurantManagers;
	}



	private static final long serialVersionUID = 1611269029816009659L;
}
