package Modal;
import java.util.*;
public class Contest {
DifficultyLevel level;
String name;
User creator;
List<History> hList;
List<Question> qList;
List<User> attendies;
int ID;
public Contest(String name,DifficultyLevel level, User creator,int ID) {
	super();
	this.name=name;
	this.level = level;
	this.creator = creator;
	this.ID=ID;
	//this.hList = hList;
	this.qList = new ArrayList<Question>();
	this.attendies=new ArrayList<User>();
}

public void addQuestion(Question q,User user)
{
	if(user.ID==creator.ID)
		qList.add(q);
	else
		System.out.println("you don't have privledge");
}

public void attendContest(User user)
{
	attendies.add(user);
}

public DifficultyLevel getLevel() {
	return level;
}

public String getName() {
	return name;
}

public User getCreator() {
	return creator;
}

public List<User> getAttendies() {
	return attendies;
}

public int getID() {
	return ID;
}

public void setLevel(DifficultyLevel level) {
	this.level = level;
}

public void setName(String name) {
	this.name = name;
}

public void setCreator(User creator) {
	this.creator = creator;
}

public void setAttendies(List<User> attendies) {
	this.attendies = attendies;
}

public void setID(int iD) {
	ID = iD;
}


}
