package Restorani.Model;

import static javax.persistence.GenerationType.IDENTITY;

import java.io.Serializable;
import java.util.List;

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
	 */
	private static final long serialVersionUID = -1286622804311512971L;

	@Id                             
	@GeneratedValue(strategy=IDENTITY)  
	@Column(name="order_id", unique=true, nullable=false) 
	private Integer id;
	
	@Column(name = "paid",unique = false, nullable = false)
	private boolean paid;
	
	@Column(name = "food",unique = false, nullable = true)
	private List<Food> food;
	
	@Column(name = "menu",unique = false, nullable = true)
	private List<Beverage> menu;
}
