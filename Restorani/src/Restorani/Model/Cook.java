package Restorani.Model;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("Cook")
public class Cook extends Employees{
	  @Column(name="kind", unique=false, nullable=false)
	  private String kind;
}
