package Service;
import Modal.*;
import java.util.*;

import Data.PersonData;
public class PersonManager {
private static PersonManager personManager=new PersonManager();
private PersonManager()
{
	
}
public static PersonManager getPersonManager()
{
	return personManager;

}
public Boolean addUser(String name)
{
	User newUser = new User(name);
	PersonData.getPersonData().addPerson(newUser);
	return true;
}

public Boolean isCritic(User user)
{
	if(user.getUserLevel()==UserLevel.CRITIC)
	{
		return true;
	}
	else
	{
		return false;
	}
}

public Boolean checkpromotion(User user)
{
	if(user.getTotalReviews()==3)
	{
		user.setUserLevel(UserLevel.CRITIC);
		return true;
	}
	return false;

}

}
