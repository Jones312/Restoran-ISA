package restoranii.model;

import java.io.Serializable;
import java.util.Set;

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
	@Column(name = "restaurant_id", unique = true, nullable = false)
	private Integer id;

	@Column(name = "name", unique = false, nullable = false)
	private String name;

	@Column(name = "type", unique = false, nullable = false)
	private String type;

	@Column(name = "sizeX", unique = false, nullable = false)
	private Integer sizeX;

	@Column(name = "sizeY", unique = false, nullable = false)
	private Integer sizeY;

	@OneToMany(cascade = { ALL }, fetch = LAZY, mappedBy = "restaurant")
	private Set<Food> food;

	@OneToMany(cascade = { ALL }, fetch = LAZY, mappedBy = "restaurant")
	private Set<Beverage> drink;

	@OneToMany(cascade = { ALL }, fetch = LAZY, mappedBy = "restaurant")
	private Set<RestaurantManager> restaurantManagers;

	@OneToMany(cascade = { ALL }, fetch = LAZY, mappedBy = "restaurant")
	private Set<Post> posts;

	@OneToMany(cascade = { ALL }, fetch = LAZY, mappedBy = "restaurant")
	private Set<RestaurantTable> tables;

	@OneToMany(cascade = { ALL }, fetch = LAZY, mappedBy = "restaurant")
	private Set<RatingRestaurant> grade;

	@OneToMany(cascade = { ALL }, fetch = LAZY, mappedBy = "restaurant")
	private Set<Employee> employes;

	@OneToMany(cascade = { ALL }, fetch = LAZY, mappedBy = "restaurant")
	private Set<Segment> segments;

	public Set<Post> getPosts() {
		return posts;
	}

	public void setPosts(Set<Post> posts) {
		this.posts = posts;
	}

	public Integer getSizeX() {
		return sizeX;
	}

	public void setSizeX(Integer sizeX) {
		this.sizeX = sizeX;
	}

	public Integer getSizeY() {
		return sizeY;
	}

	public void setSizeY(Integer sizeY) {
		this.sizeY = sizeY;
	}

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

	public Set<Food> getFood() {
		return food;
	}

	public void setFood(Set<Food> food) {
		this.food = food;
	}

	public Set<Beverage> getDrink() {
		return drink;
	}

	public void setDrink(Set<Beverage> drink) {
		this.drink = drink;
	}

	public Set<RestaurantManager> getRestaurantManagers() {
		return restaurantManagers;
	}

	public void setRestaurantManagers(Set<RestaurantManager> restaurantManagers) {
		this.restaurantManagers = restaurantManagers;
	}

	public Set<RestaurantTable> getTables() {
		return tables;
	}

	public void setTables(Set<RestaurantTable> tables) {
		this.tables = tables;
	}

	public Set<RatingRestaurant> getGrade() {
		return grade;
	}

	public void setGrade(Set<RatingRestaurant> grade) {
		this.grade = grade;
	}

	public Set<Employee> getEmployes() {
		return employes;
	}

	public void setEmployes(Set<Employee> employes) {
		this.employes = employes;
	}

	public Set<Segment> getSegments() {
		return segments;
	}

	public void setSegments(Set<Segment> segments) {
		this.segments = segments;
	}

	public Restaurant() {
		super();
	}

	public Restaurant(Integer id, String name, String type, Integer sizeX, Integer sizeY, Set<Food> food,
			Set<Beverage> drink, Set<RestaurantManager> restaurantManagers, Set<Post> posts,
			Set<RestaurantTable> tables, Set<RatingRestaurant> grade, Set<Employee> employes, Set<Segment> segments) {
		super();
		this.id = id;
		this.name = name;
		this.type = type;
		this.sizeX = sizeX;
		this.sizeY = sizeY;
		this.food = food;
		this.drink = drink;
		this.restaurantManagers = restaurantManagers;
		this.posts = posts;
		this.tables = tables;
		this.grade = grade;
		this.employes = employes;
		this.segments = segments;
	}

	private static final long serialVersionUID = 1611269029816009659L;
}