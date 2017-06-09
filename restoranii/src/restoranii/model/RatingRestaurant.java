package restoranii.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import static javax.persistence.GenerationType.IDENTITY;

import java.io.Serializable;

@Entity
@Table(name = "RatingRestaurant")
public class RatingRestaurant implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -8898224881158783214L;
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "rating_restaurant_id", unique = true, nullable = false)
	private Integer id;
	@Column(name = "value", unique = false, nullable = false)
	private Integer value;
	@ManyToOne
	@JoinColumn(name = "restaurant", referencedColumnName = "restaurant_id", nullable = false)
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

	public void setId(Integer id) {
		this.id = id;
	}

	public RatingRestaurant() {
		super();
	}

	public RatingRestaurant(Integer id, Integer value, Restaurant restaurant) {
		super();
		this.id = id;
		this.value = value;
		this.restaurant = restaurant;
	}

}
