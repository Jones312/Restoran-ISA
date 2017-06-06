package restoranii.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("Bartender")
public class Bartender extends Employee{
	
}
