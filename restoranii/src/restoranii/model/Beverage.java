package restoranii.model;
import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import static javax.persistence.GenerationType.IDENTITY;

@Entity 
@Table(name = "Beverage")

public class Beverage implements Serializable{

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "beaverage_id", unique = true, nullable = false)
	private Integer id;
	
	@Column(name = "name", unique = false , nullable = false)
	private String name;
	
	@Column(name = "description", unique = false , nullable = false)
	private String description;
	
	@Column(name = "price", unique = false , nullable = false)
	private String price;
	
	@ManyToOne
	@JoinColumn(name="restaurantId",referencedColumnName="restaurant_id",nullable=false)
	private Restaurant restaurant;
	
	@ManyToMany
	@JoinTable(name="OrderedDrinks",
	 joinColumns= @JoinColumn(name="beaverageId",referencedColumnName="beaverage_id"),
	 inverseJoinColumns= @JoinColumn(name="orderId", referencedColumnName="order_id"))
	private Set<Order> orderList;
	
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public Beverage() {}

	public Beverage(Integer id, String name, String description, String price) {
		this.id = id;
		this.name = name;
		this.description = description;
		this.price = price;
	}

	private static final long serialVersionUID = -8445442230482376969L;

}
