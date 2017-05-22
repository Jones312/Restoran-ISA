package Restorani.Model;


@Entity 
@Table(name = "Reservations")
public class Reservation {
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	private Integer id;
	private Set<Guest> guests;
	@Column(name = "date", unique = false , nullable = false)
	private Date date;
	@Column(name = "duration", unique = false , nullable = false)
	private Integer duration;
	@Column(name = "complete", unique = false , nullable = false)
	private boolean complete;
	private Set<Table> tables;
}
