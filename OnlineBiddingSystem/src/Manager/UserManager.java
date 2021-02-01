package Manager;

import java.util.HashMap;

import Modal.Person;

public class UserManager {
	private HashMap<String,Person> userHash;
	private static UserManager usermanager = new UserManager();
	private UserManager()
	{
		this.userHash = new HashMap<String,Person>();
	}
	public static UserManager getUserManagerInstance()
	{
		return usermanager;
	}
	public HashMap<String,Person> getUserHash()
	{
		return userHash;
	}
	public Person getUser(String A)
	{
		return userHash.get(A);
	}
	public void addUser(String str, Person obj)
	{
		userHash.put(str, obj);
	}
	public void deleteUser(String str)
	{
		userHash.remove(str);
	}
}
