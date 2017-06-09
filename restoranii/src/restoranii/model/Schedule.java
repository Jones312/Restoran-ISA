package restoranii.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import static javax.persistence.GenerationType.IDENTITY;

import java.io.Serializable;
import java.sql.Date;

@Entity
@Table(name = "Schedules")
public class Schedule implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1707158156577330675L;
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "schedule_id", unique = true, nullable = false)
	private Integer id;
	@ManyToOne
	@JoinColumn(name = "segmentId", referencedColumnName = "segment_id", nullable = false)
	private Segment segment;
	@ManyToOne
	@JoinColumn(name = "employeeId", referencedColumnName = "employee_id", nullable = false)
	private Employee employee;
	@Column(name = "shift", unique = false, nullable = false)
	private Integer shift;
	@Column(name = "date", unique = false, nullable = false)
	private Date date;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
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

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public Schedule() {
		super();
	}

	public Schedule(Integer id, Segment segment, Employee employee, Integer shift, Date date) {
		super();
		this.id = id;
		this.segment = segment;
		this.employee = employee;
		this.shift = shift;
		this.date = date;
	}

}
