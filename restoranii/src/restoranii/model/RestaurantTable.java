package restoranii.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import static javax.persistence.CascadeType.ALL;
import static javax.persistence.FetchType.LAZY;
import static javax.persistence.GenerationType.IDENTITY;

import java.io.Serializable;
import java.util.Set;

@Entity 
@Table(name = "Tables")
public class RestaurantTable implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -5545202787179636748L;
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "table_id", unique = true, nullable = false)
	private Integer id;
	
	@ManyToOne
	@JoinColumn(name="segmentId", referencedColumnName="segment_id", nullable=false)
	private Segment segment;
	
	@ManyToOne
	@JoinColumn(name="restaurantId", referencedColumnName="restaurant_id", nullable=false)
	private Restaurant restaurant;
	
	@Column(name = "chairs", unique = false , nullable = false)
	private Integer chairs;
	
	@Column(name = "posX", unique = false , nullable = false)
	private Integer posX;
	
	@Column(name = "posY", unique = false , nullable = false)
	private Integer posY;
	
	@ManyToMany(mappedBy="tables")
	private Set<Reservation> reservations;
	
	@OneToMany(mappedBy="table",cascade = {ALL}, fetch = LAZY)
	private Set<Order> orders;
	
	
	
	public RestaurantTable() {
		super();
	}
	public Integer getId() {
		return id;
	}
	public Segment getSegment() {
		return segment;
	}
	public void setSegment(Segment segment) {
		this.segment = segment;
	}
	public Restaurant getRestaurant() {
		return restaurant;
	}
	public void setRestaurant(Restaurant restaurant) {
		this.restaurant = restaurant;
	}
	public Integer getChairs() {
		return chairs;
	}
	public void setChairs(Integer chairs) {
		this.chairs = chairs;
	}
	public Integer getPosX() {
		return posX;
	}
	public void setPosX(Integer posX) {
		this.posX = posX;
	}
	public Integer getPosY() {
		return posY;
	}
	public void setPosY(Integer posY) {
		this.posY = posY;
	}
}

