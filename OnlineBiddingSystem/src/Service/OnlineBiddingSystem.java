package Service;
import java.util.*;

import Manager.UserManager;
import Modal.Auction;
import Modal.AuctionStatus;
import Modal.Bidder;
import Modal.Name;
import Modal.Person;
import Modal.Seller;
import Modal.Admin;
public class OnlineBiddingSystem {
String name;
String address;
Date launchDate;
AuctionService auctionService;
BiddingService biddingService;
UserService userService;
UserManager usermanager;
Admin admin;
public OnlineBiddingSystem(String name, String Address, Date launchDate) {
	super();
	this.name = name;
	this.address = Address;
	this.launchDate = launchDate;
	auctionService= AuctionService.getAuctionServiceInstance();
	biddingService=BiddingService.getBiddingServiceInstance();
	userService=UserService.getUserServiceInstance();
	usermanager = UserManager.getUserManagerInstance();
	admin = Admin.getAdminInstance();
}

public void addUser(String A,String B,String C,int age,Date date,boolean sellerFlag)
{
	userService.addUser(A, B, C, age, date, sellerFlag);
}

public void removeUser(String User) {
	userService.removeUser(User);
}
public void createAuction(String ID,int Hl,int ll,String seller)
{
	admin.createAuction(ID,Hl,ll,seller);
}
public void closeAuction(String auctionId)
{
	admin.endAucton(auctionId);
}

public void makeBid(String auctionID,String userID,int bid)
{
	biddingService.makeBid(auctionID,userID,bid);
}

public void deleteBid(String auctionID,String userID)
{
	biddingService.deleteBid(auctionID, userID);
}

}

