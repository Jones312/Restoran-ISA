package restoranii.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("Waiter")
public class Waiter extends Employee{
	
}
