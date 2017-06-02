package Restorani.Model;

import static javax.persistence.CascadeType.ALL;
import static javax.persistence.FetchType.LAZY;
import static javax.persistence.GenerationType.IDENTITY;

import java.sql.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Post")
public class Post {

	@Id
	@GeneratedValue(strategy=IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	private Integer id;
	
	@OneToMany(cascade = {ALL}, fetch = LAZY, mappedBy = "offer")
	private Set<Offer> offers;
	
	@Column(name = "expiration_date", unique = false, nullable = false)
	private Date expiration_date;
	
	@ManyToOne
	@JoinColumn(name = "restaurant", referencedColumnName = "id", nullable = false)
	private Restaurant restaurant;

	public Post() {}
	
	public Post(Integer id, Set<Offer> offers, Date expiration_date, Restaurant restaurant) {
		super();
		this.id = id;
		this.offers = offers;
		this.expiration_date = expiration_date;
		this.restaurant = restaurant;
	}

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
	
}
