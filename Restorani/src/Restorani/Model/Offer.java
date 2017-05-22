package Restorani.Model;

import static javax.persistence.GenerationType.IDENTITY;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Offer")
public class Offer {
	@Id
	@GeneratedValue(strategy=IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	private Integer id;
	
	@Column(name = "food", unique = false, nullable = true)
	private List<Food> food;
	
	@Column(name = "beverages", unique = false, nullable = true)
	private List<Beverage> beverage;
	
	@Column(name = "accepted", unique = false, nullable = false)
	private boolean accepted;
	
	@ManyToOne
	@JoinColumn(name = "supplier", referencedColumnName = "id", nullable = false)
	private Supplier supplier;
	
	@ManyToOne
	@JoinColumn(name = "post", referencedColumnName = "id", nullable = false)
	private Post post;

	public Offer() {}
	
	public Offer(Integer id, List<Food> food, List<Beverage> beverage, boolean accepted, Supplier supplier, Post post) {
		super();
		this.id = id;
		this.food = food;
		this.beverage = beverage;
		this.accepted = accepted;
		this.supplier = supplier;
		this.post = post;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public List<Food> getFood() {
		return food;
	}

	public void setFood(List<Food> food) {
		this.food = food;
	}

	public List<Beverage> getBeverage() {
		return beverage;
	}

	public void setBeverage(List<Beverage> beverage) {
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
}
