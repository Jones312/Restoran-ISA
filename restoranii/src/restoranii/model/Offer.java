package restoranii.model;

import static javax.persistence.GenerationType.IDENTITY;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Offer")
public class Offer implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -6102368537180555547L;

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "offer_id", unique = true, nullable = false)
	private Integer id;

	@Column(name = "food", unique = false, nullable = true)
	private Set<Food> food;

	@Column(name = "beverages", unique = false, nullable = true)
	private Set<Beverage> beverage;

	@Column(name = "accepted", unique = false, nullable = false)
	private boolean accepted;

	@ManyToOne
	@JoinColumn(name = "supplier", referencedColumnName = "supplier_id", nullable = false)
	private Supplier supplier;

	@ManyToOne
	@JoinColumn(name = "post", referencedColumnName = "post_id", nullable = false)
	private Post post;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Set<Food> getFood() {
		return food;
	}

	public void setFood(Set<Food> food) {
		this.food = food;
	}

	public Set<Beverage> getBeverage() {
		return beverage;
	}

	public void setBeverage(Set<Beverage> beverage) {
		this.beverage = beverage;
	}

	public boolean isAccepted() {
		return accepted;
	}

	public void setAccepted(boolean accepted) {
		this.accepted = accepted;
	}

	public Supplier getSupplier() {
		return supplier;
	}

	public void setSupplier(Supplier supplier) {
		this.supplier = supplier;
	}

	public Post getPost() {
		return post;
	}

	public void setPost(Post post) {
		this.post = post;
	}

	public Offer(Integer id, Set<Food> food, Set<Beverage> beverage, boolean accepted, Supplier supplier, Post post) {
		super();
		this.id = id;
		this.food = food;
		this.beverage = beverage;
		this.accepted = accepted;
		this.supplier = supplier;
		this.post = post;
	}

	public Offer() {
		super();
	}

}
