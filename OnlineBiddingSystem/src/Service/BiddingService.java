package Service;

import Manager.UserManager;
import Modal.Auction;
import Modal.Person;

public class BiddingService {
	private static BiddingService biddingService = new BiddingService();
	private UserManager usermanager;
	private AuctionService auctionService;
	private BiddingService()
	{
		usermanager= UserManager.getUserManagerInstance();
		auctionService=AuctionService.getAuctionServiceInstance();
	}
	
	public static BiddingService getBiddingServiceInstance()
	{
		return biddingService;
	}
	public void makeBid(String auctionID,String userID,int bid)
	{
		Person user = usermanager.getUser(userID);
		Auction auction = auctionService.getAuction(auctionID);
		auction.addBid(user, bid);
	}
	public void deleteBid(String auctionID,String userID)
	{
		Person user = usermanager.getUser(userID);
		Auction auction = auctionService.getAuction(auctionID);
		auction.deleteBid(user);
	}
}
