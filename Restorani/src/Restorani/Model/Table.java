package Restorani.Model;


@Entity 
@Table(name = "Tables")
public class Table {
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
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	private Integer id;
	private Segment segment;
	private Restaurant restaurant;
	@Column(name = "chairs", unique = false , nullable = false)
	private Integer chairs;
	@Column(name = "posX", unique = false , nullable = false)
	private Integer posX;
	@Column(name = "posY", unique = false , nullable = false)
	private Integer posY;
	

}
