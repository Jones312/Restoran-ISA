package restoranii.model;

import java.sql.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import static javax.persistence.CascadeType.ALL;
import static javax.persistence.DiscriminatorType.STRING;
import static javax.persistence.FetchType.LAZY;
import static javax.persistence.GenerationType.IDENTITY;
import static javax.persistence.InheritanceType.SINGLE_TABLE;



@Entity
@Table(name = "Employees")
@Inheritance(strategy=SINGLE_TABLE)
@DiscriminatorColumn(name="type", discriminatorType=STRING)
public abstract class Employee{
	
	@Id                             
	@GeneratedValue(strategy=IDENTITY)  
	@Column(name="employee_id", unique=true, nullable=false) 
	private Integer id;
	
	@Column(name = "name",unique = false, nullable = false)
	private String name;
	@Column(name = "lasename",unique = false, nullable = false)
	private String lastname;
	@Column(name = "date_of_birth",unique = false, nullable = false)
	private Date date_of_birth;
	@Column(name = "size",unique = false, nullable = false)
	private String size;
	@Column(name = "shoe_size",unique = false, nullable = false)
	private float shoe_size;
	@Column(name = "email",unique = true, nullable = false)
	private String email;
	@Column(name = "password",unique = false, nullable = false)
	private String password;
	@Column(name = "firstLogin",unique = false, nullable = false)
	private boolean firstLogin;
	
	@ManyToMany(mappedBy="employes")
	private Set<RatingServices> ratings;
	
	@ManyToOne
	@JoinColumn(name="restaurantId", referencedColumnName="restaurant_id",nullable = false)
	private Restaurant restaurant;
	
	@OneToMany(mappedBy="employe",cascade = {ALL}, fetch = LAZY)
	private Set<Schedule> schedule;
	
	@ManyToMany
	@JoinTable(name="OrderListing",
	 joinColumns= @JoinColumn(name="employeeId",referencedColumnName="employee_id"),
	 inverseJoinColumns= @JoinColumn(name="orderId", referencedColumnName="order_id"))
	private Set<Order> orderList;
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Date getDate_of_birth() {
		return date_of_birth;
	}
	public void setDate_of_birth(Date date_of_birth) {
		this.date_of_birth = date_of_birth;
	}
	
	public Set<RatingServices> getRatings() {
		return ratings;
	}
	public void setRatings(Set<RatingServices> ratings) {
		this.ratings = ratings;
	}
	public boolean isFirstLogin() {
		return firstLogin;
	}
	public void setFirstLogin(boolean firstLogin) {
		this.firstLogin = firstLogin;
	}
	public Integer getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public Date getDateOfBirth() {
		return date_of_birth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		this.date_of_birth = dateOfBirth;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public float getShoe_size() {
		return shoe_size;
	}
	public void setShoe_size(float shoe_size) {
		this.shoe_size = shoe_size;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
}