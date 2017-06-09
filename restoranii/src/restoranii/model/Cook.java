package restoranii.model;

import java.io.Serializable;
import java.sql.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("Cook")
public class Cook extends Employee implements Serializable {
	/**
	* 
	*/
	private static final long serialVersionUID = 3056579981299237424L;
	@Column(name = "kind", unique = false, nullable = false)
	private String kind;

	public String getKind() {
		return kind;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}

	public Cook(Integer id, String name, String lastname, Date date_of_birth, String size, float shoe_size,
			String email, String password, boolean firstLogin, Set<RatingServices> ratings, Restaurant restaurant,
			Set<Schedule> schedule, Set<Order> orderList, String kind) {
		super(id, name, lastname, date_of_birth, size, shoe_size, email, password, firstLogin, ratings, restaurant,
				schedule, orderList);
		this.kind = kind;
	}

	public Cook() {
		super();
	}

}
