package restoranii.model;

import java.io.Serializable;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("Waiter")
public class Waiter extends Employee implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4334270790126923479L;

	public Waiter() {
	};
}
