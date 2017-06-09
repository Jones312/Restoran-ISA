package restoranii.model;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Table(name = "Food")

public class Food implements Serializable {

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "food_id", unique = true, nullable = false)
	private Integer id;

	@Column(name = "name", unique = false, nullable = false)
	private String name;

	@Column(name = "description", unique = false, nullable = false)
	private String description;

	@Column(name = "price", unique = false, nullable = false)
	private String price;

	@ManyToMany(mappedBy = "foodList")
	private Set<RatingFood> ratings;

	@ManyToOne
	@JoinColumn(name = "restaurantId", referencedColumnName = "restaurant_id", nullable = false)
	Restaurant restaurant;

	@ManyToMany
	@JoinTable(name = "OrderedFood", joinColumns = @JoinColumn(name = "foodId", referencedColumnName = "food_id"), inverseJoinColumns = @JoinColumn(name = "orderId", referencedColumnName = "order_id"))
	private Set<Order> orderList;

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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public Set<RatingFood> getRatings() {
		return ratings;
	}

	public void setRatings(Set<RatingFood> ratings) {
		this.ratings = ratings;
	}

	public Restaurant getRestaurant() {
		return restaurant;
	}

	public void setRestaurant(Restaurant restaurant) {
		this.restaurant = restaurant;
	}

	public Set<Order> getOrderList() {
		return orderList;
	}

	public void setOrderList(Set<Order> orderList) {
		this.orderList = orderList;
	}

	public Food() {
		super();
	}

	public Food(Integer id, String name, String description, String price, Set<RatingFood> ratings,
			Restaurant restaurant, Set<Order> orderList) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.price = price;
		this.ratings = ratings;
		this.restaurant = restaurant;
		this.orderList = orderList;
	}

	private static final long serialVersionUID = -666354135243536838L;

}
