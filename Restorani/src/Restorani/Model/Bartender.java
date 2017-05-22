package Restorani.Model;

//import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("Bartender")
public class Bartender extends Employees{
	
}
