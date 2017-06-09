package restoranii.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import static javax.persistence.CascadeType.ALL;
import static javax.persistence.FetchType.LAZY;
import static javax.persistence.GenerationType.IDENTITY;

import java.io.Serializable;
import java.util.Set;

@Entity
@Table(name = "Segments")
public class Segment implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -7440623011536666308L;
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	private Integer id;
	@Column(name = "name", unique = true, nullable = false)
	private String name;
	@OneToMany(cascade = { ALL }, fetch = LAZY, mappedBy = "segment")
	private Set<RestaurantTable> tables;
	@OneToMany(cascade = { ALL }, fetch = LAZY, mappedBy = "segment")
	private Set<Schedule> schedules;
	@ManyToOne
	@JoinColumn(name = "restaurantId", referencedColumnName = "restaurant_id", nullable = false)
	Restaurant restaurant;

	public Integer getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<RestaurantTable> getTables() {
		return tables;
	}

	public void setTables(Set<RestaurantTable> tables) {
		this.tables = tables;
	}

	public Set<Schedule> getSchedules() {
		return schedules;
	}

	public void setSchedules(Set<Schedule> schedules) {
		this.schedules = schedules;
	}

	public Restaurant getRestaurant() {
		return restaurant;
	}

	public void setRestaurant(Restaurant restaurant) {
		this.restaurant = restaurant;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Segment() {
		super();
	}

	public Segment(Integer id, String name, Set<RestaurantTable> tables, Set<Schedule> schedules,
			Restaurant restaurant) {
		super();
		this.id = id;
		this.name = name;
		this.tables = tables;
		this.schedules = schedules;
		this.restaurant = restaurant;
	}

}