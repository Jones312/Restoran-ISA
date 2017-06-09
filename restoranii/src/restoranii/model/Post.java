package restoranii.model;

import static javax.persistence.CascadeType.ALL;
import static javax.persistence.FetchType.LAZY;
import static javax.persistence.GenerationType.IDENTITY;

import java.io.Serializable;
import java.sql.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Post")
public class Post implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5408368359089784762L;

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "post_id", unique = true, nullable = false)
	private Integer id;

	@OneToMany(cascade = { ALL }, fetch = LAZY, mappedBy = "post")
	private Set<Offer> offers;

	@Column(name = "expiration_date", unique = false, nullable = false)
	private Date expiration_date;

	@ManyToOne
	@JoinColumn(name = "restaurant", referencedColumnName = "restaurant_id", nullable = false)
	private Restaurant restaurant;

	@ManyToMany(mappedBy = "posts")
	private Set<Supplier> suppliers;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Set<Offer> getOffers() {
		return offers;
	}

	public void setOffers(Set<Offer> offers) {
		this.offers = offers;
	}

	public Date getExpiration_date() {
		return expiration_date;
	}

	public void setExpiration_date(Date expiration_date) {
		this.expiration_date = expiration_date;
	}

	public Restaurant getRestaurant() {
		return restaurant;
	}

	public void setRestaurant(Restaurant restaurant) {
		this.restaurant = restaurant;
	}

	public Set<Supplier> getSuppliers() {
		return suppliers;
	}

	public void setSuppliers(Set<Supplier> suppliers) {
		this.suppliers = suppliers;
	}

	public Post() {
		super();
	}

	public Post(Integer id, Set<Offer> offers, Date expiration_date, Restaurant restaurant, Set<Supplier> suppliers) {
		super();
		this.id = id;
		this.offers = offers;
		this.expiration_date = expiration_date;
		this.restaurant = restaurant;
		this.suppliers = suppliers;
	}

}
