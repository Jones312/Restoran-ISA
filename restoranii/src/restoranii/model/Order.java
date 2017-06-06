package restoranii.model;

import static javax.persistence.GenerationType.IDENTITY;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Order")
public class Order implements Serializable{
	/**
	 * WTF is this :P
	 * Broj za serilizaciju
	 */
	private static final long serialVersionUID = -1286622804311512971L;

	@Id                             
	@GeneratedValue(strategy=IDENTITY)  
	@Column(name="order_id", unique=true, nullable=false) 
	private Integer id;
	
	@Column(name = "paid",unique = false, nullable = false)
	private boolean paid;
	
	@Column(name = "food",unique = false, nullable = true)
	private Set<Food> food;
	
	@Column(name = "menu",unique = false, nullable = true)
	private Set<Beverage> menu;
	

	public Order() {
		super();
	}

	public Integer getId() {
		return id;
	}

	public boolean isPaid() {
		return paid;
	}

	public void setPaid(boolean paid) {
		this.paid = paid;
	}

	public Set<Food> getFood() {
		return food;
	}

	public void setFood(Set<Food> food) {
		this.food = food;
	}

	public Set<Beverage> getMenu() {
		return menu;
	}

	public void setMenu(Set<Beverage> menu) {
		this.menu = menu;
	}
	
	
}
