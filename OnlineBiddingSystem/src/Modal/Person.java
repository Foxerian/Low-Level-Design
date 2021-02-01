package Modal;
import java.util.*;

public class Person {
	Name name;
	int age;
	Date dateOfJoin;
	
	public Person(Name name, int age, Date dateOfJoin) {
		this.name = name;
		this.age = age;
		this.dateOfJoin = dateOfJoin;
	}
	public Name getName() {
		return name;
	}
	public void setName(Name name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Date getDateOfJoin() {
		return dateOfJoin;
	}
	public void setDateOfJoin(Date dateOfJoin) {
		this.dateOfJoin = dateOfJoin;
	}
}
