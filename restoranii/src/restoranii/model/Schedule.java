package restoranii.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import static javax.persistence.GenerationType.IDENTITY;

import java.sql.Date;

@Entity 
@Table(name = "Schedules")
public class Schedule {
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	private Integer id;
	private Employee worker;
	private Segment segment;
	@Column(name = "shift", unique = false , nullable = false)
	private Integer shift;
	@Column(name = "date", unique = false , nullable = false)
	private Date date;
	
	public Schedule() {
		super();
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Employee getWorker() {
		return worker;
	}
	public void setWorker(Employee worker) {
		this.worker = worker;
	}
	public Segment getSegment() {
		return segment;
	}
	public void setSegment(Segment segment) {
		this.segment = segment;
	}
	public Integer getShift() {
		return shift;
	}
	public void setShift(Integer shift) {
		this.shift = shift;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	
}
