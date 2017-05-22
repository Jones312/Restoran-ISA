package Restorani.Model;


@Entity 
@Table(name = "Schedules")
public class Schedule {
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	private Integer id;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Employees getWorker() {
		return worker;
	}
	public void setWorker(Employees worker) {
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
	private Employees worker;
	private Segment segment;
	@Column(name = "shift", unique = false , nullable = false)
	private Integer shift;
	@Column(name = "date", unique = false , nullable = false)
	private Date date;
}
