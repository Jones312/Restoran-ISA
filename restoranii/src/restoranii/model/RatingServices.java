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
@Table(name = "Rating")
public class RatingServices implements Serializable {

	private static final long serialVersionUID = -1941148947880504801L;

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "rating_service_id", unique = true, nullable = false)
	private Integer id;

	@Column(name = "rating", unique = false, nullable = false)
	private int rating;

	@ManyToMany
	@JoinTable(name = "ServiceRating", joinColumns = @JoinColumn(name = "ratingServiceId", referencedColumnName = "rating_service_id"), inverseJoinColumns = @JoinColumn(name = "employeeId", referencedColumnName = "employee_id"))
	private Set<Employee> employes;

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

	public Set<Employee> getEmployes() {
		return employes;
	}

	public void setEmployes(Set<Employee> employes) {
		this.employes = employes;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public RatingServices(Integer id, int rating, Set<Employee> employes) {
		super();
		this.id = id;
		this.rating = rating;
		this.employes = employes;
	}

	public RatingServices() {
		super();
	}

}
