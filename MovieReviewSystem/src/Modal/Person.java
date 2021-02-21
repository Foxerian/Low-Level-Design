package Modal;

public class Person {
String name;
UserLevel level;
public Person() {
	super();
}
public Person(String name) {
	super();
	this.name = name;
}

public Person(String name, UserLevel level) {
	super();
	this.name = name;
	this.level = level;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}
public UserLevel getUserLevel()
{
	return this.level;
}
public void setUserLevel(UserLevel level)
{
	 this.level =level;
}

}
