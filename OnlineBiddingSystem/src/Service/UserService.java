package Service;

import java.util.Date;

import Manager.UserManager;
import Modal.Bidder;
import Modal.Name;
import Modal.Seller;

public class UserService {
	private static UserService userservice = new UserService();
	private UserManager usermanager;
	private UserService()
	{
		usermanager = UserManager.getUserManagerInstance();
	}
	public static UserService getUserServiceInstance()
	{
		return userservice;
	}
	public void addUser(String A,String B,String C,int age,Date date,boolean sellerFlag)
	{
	if(sellerFlag)
	{
		Seller seller = new Seller(new Name(A,B,C),age,date);
		usermanager.addUser(A,seller);
	}
	else{
		Bidder bidder = new Bidder(new Name(A,B,C),age,date);
		usermanager.addUser(A,bidder);
	}

	}
	public void removeUser(String A)
	{
		usermanager.deleteUser(A);
	}
}
