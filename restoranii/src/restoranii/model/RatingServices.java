package restoranii.model;

import static javax.persistence.GenerationType.IDENTITY;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity 
@Table(name = "Rating")

public class RatingServices implements Serializable{

	private static final long serialVersionUID = -1941148947880504801L;

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	private Integer id;
	
	@Column(name = "rating", unique = false , nullable = false)
	private int rating;

	public RatingServices() {};
	
	public RatingServices(Integer id, int rating) {
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
}
