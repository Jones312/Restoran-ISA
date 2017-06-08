package restoranii.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import static javax.persistence.GenerationType.IDENTITY;

@Entity 
@Table(name = "RatingRestaurant")
public class RatingRestaurant {
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "rating_restaurant_id", unique = true, nullable = false)
	private Integer id;
	@Column(name = "value", unique = false , nullable = false)
	private Integer value;
	@ManyToOne
	@JoinColumn(name="restaurant", referencedColumnName = "restaurant_id", nullable = false)
	private Restaurant restaurant;
	
	
	public Integer getId() {
		return id;
	}
	public Integer getValue() {
		return value;
	}
	public void setValue(Integer value) {
		this.value = value;
	}
	public Restaurant getRestaurant() {
		return restaurant;
	}
	public void setRestaurant(Restaurant restaurant) {
		this.restaurant = restaurant;
	}
	
}
