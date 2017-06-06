package restoranii.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import static javax.persistence.GenerationType.IDENTITY;

@Entity 
@Table(name = "Segments")
public class Segment {
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	private Integer id;
	@Column(name = "name", unique = true , nullable = false)
	private String name;
	
	
	
	public Segment() {
		super();
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
}