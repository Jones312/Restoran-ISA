package restoranii.model;

import static javax.persistence.GenerationType.IDENTITY;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "FoodRate")
public class RatingFood implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -6870357423510172826L;

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "rating_food_id", unique = true, nullable = false)
	private Integer id;

	@Column(name = "rating", unique = false, nullable = false)
	private int rating;

	@ManyToMany
	@JoinTable(name = "FoodRating", joinColumns = @JoinColumn(name = "ratingFoodId", referencedColumnName = "rating_food_id"), inverseJoinColumns = @JoinColumn(name = "foodId", referencedColumnName = "food_id"))
	private Set<Food> foodList;

	public RatingFood() {
	};

	public RatingFood(Integer id, int rating) {
		super();
		this.id = id;
		this.rating = rating;
	}

	public Integer getId() {
		return id;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public Set<Food> getFoodList() {
		return foodList;
	}

	public void setFoodList(Set<Food> foodList) {
		this.foodList = foodList;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public RatingFood(Integer id, int rating, Set<Food> foodList) {
		super();
		this.id = id;
		this.rating = rating;
		this.foodList = foodList;
	}

}
