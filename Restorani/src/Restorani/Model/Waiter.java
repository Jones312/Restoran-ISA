package Restorani.Model;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("Waiter")
public class Waiter extends Employees{
	  @Column(name="evaluation", unique=false, nullable=true)
	  private double evaluation;
}
