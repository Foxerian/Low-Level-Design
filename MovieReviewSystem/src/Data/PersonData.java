package Data;
import Exception.*;
import Modal.*;
import java.util.*;
public class PersonData {
private static PersonData personData = new PersonData();
HashMap <String,User> personHM;
private PersonData()
{
	personHM = new HashMap<String,User>();
}

public static PersonData getPersonData()
{
return personData;	
}

public void addPerson(User user)
{
	//System.out.println(user.getName());
	personHM.put(user.getName(), user);
}

public User getPerson(String name) throws CustomException
{
	if(personHM.containsKey(name))
	{
	return personHM.get(name);
	}
	else
	{
		throw new CustomException("Non registered User "+name);
	}
}

}
