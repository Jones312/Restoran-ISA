package Restorani.Model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("Waiter")
public class Waiter extends Employees{
	
}
