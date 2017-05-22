package Restorani.Model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import static javax.persistence.CascadeType.ALL;
import static javax.persistence.FetchType.LAZY;
import static javax.persistence.GenerationType.IDENTITY;

@Entity 
@Table(name = "Supplier")

public class Supplier implements Serializable {

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	private Integer id;
	
	@Column(name = "name", unique = false , nullable = false)
	private String name;
	
	@Column(name = "lastname", unique = false , nullable = false)
	private String lastname;
	
	@Column(name = "email", unique = true, nullable = false)
	private String email;
	
	@Column(name="pasword", unique=false, nullable=false)
	private String password;
	
	@OneToMany(cascade = {ALL}, fetch = LAZY, mappedBy = "Restaurant")
	private List<Offer> offers;
	
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

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Supplier() {
		super();
	}

	public Supplier(Integer id, String name, String lastname, String email, String password) {
		super();
		this.id = id;
		this.name = name;
		this.lastname = lastname;
		this.email = email;
		this.password = password;
	}
	
	private static final long serialVersionUID = 7623665003755098093L;

}
