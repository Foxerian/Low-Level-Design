package Modal;

import java.util.Date;

public class Seller extends Person{
	
	public Seller(Name name, int age, Date dateOfJoin) {
		super(name, age, dateOfJoin);
	}
	
	public String toString() {
		return "Seller: "+this.name;
	}
}
