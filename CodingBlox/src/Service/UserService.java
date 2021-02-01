package Service;
import Modal.*;
import java.util.*;
public class UserService {
	private static UserService userservice = new UserService();
	HashMap<String,User> userHash;
	
	int total=0;
	private UserService()
	{
		userHash= new HashMap<String,User>();
	}
	
	public static UserService getUserServiceInstance()
	{
		return userservice;
	}
	
	public void createUser(String name)
	{
		total++;
		User user= new User(name,total);
		userHash.put(name, user);
	}
	
	public User getUserByName(String name)
	{
		return userHash.get(name);
	}
	
	/*public List getUserQuestions(String name)
	{
		User user=(User)userHash.get(name);
		return user.ge;
	}*/
}
