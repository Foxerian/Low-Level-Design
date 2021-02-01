package Modal;

import java.util.ArrayList;
import java.util.List;

public class User implements Person {
String name;
int ID;

List <Question> qList;
public User(String name, int iD) {
	super();
	this.name = name;
	ID = iD;
	qList=new ArrayList<Question>();
}
public String getName() {
	return name;
}
public int getID() {
	return ID;
}
public void setName(String name) {
	this.name = name;
}
public void setID(int iD) {
	ID = iD;
}

}
