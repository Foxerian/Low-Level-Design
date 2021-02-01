package Modal;

import java.util.Date;


public class Bidder extends Person{
	
	
	public Bidder(Name name, int age, Date dateOfJoin) {
		super(name, age, dateOfJoin);
	}

	public String toString() {
		return "Bidderr: "+this.name;
	}
	
}
