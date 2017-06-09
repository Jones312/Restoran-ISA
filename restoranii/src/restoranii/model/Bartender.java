package restoranii.model;

import java.io.Serializable;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("Bartender")
public class Bartender extends Employee implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -8543257005709779863L;

	public Bartender() {
		super();
	}

}
