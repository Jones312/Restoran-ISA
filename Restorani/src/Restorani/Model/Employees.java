package Restorani.Model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.Table;

import static javax.persistence.DiscriminatorType.STRING;
import static javax.persistence.GenerationType.IDENTITY;
import static javax.persistence.InheritanceType.SINGLE_TABLE;



@Entity
@Table(name = "Employees")
@Inheritance(strategy=SINGLE_TABLE)
@DiscriminatorColumn(name="type", discriminatorType=STRING)
public abstract class Employees{
	
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