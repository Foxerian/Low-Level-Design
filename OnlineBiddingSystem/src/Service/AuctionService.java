package Service;

import java.util.*;

import Modal.Auction;
import Modal.AuctionStatus;
import Modal.Person;

public class AuctionService {
	private Auction auction;
	private HashMap auctionMap;
	private static AuctionService auctionService = new AuctionService();
	private AuctionService() {
	auctionMap = new HashMap<String,Auction>();
	}
	public static AuctionService getAuctionServiceInstance()
	{
		return auctionService;
	}
	public void createAuction(String ID, Date startDate, Date endDate, AuctionStatus status, int highestLimit, int lowestLimit,
			Person seller)
	{
		auction=new Auction();
		auction.setID(ID);
		auction.setStartDate(startDate);
		auction.setEndDate(endDate);
		auction.setStatus(AuctionStatus.ACTIVE);
		auction.setHighestLimit(highestLimit);
		auction.setLowestLimit(lowestLimit);
		auction.setSeller(seller);
		auctionMap.put(ID,auction);
	}
	public Auction getAuction(String str)
	{
		return (Auction)auctionMap.get(str);
	}
	public void updateAuction(String str)
	{
		auctionMap.get(str);
	}
	public void deleteAuction(String str)
	{
		auction=(Auction)auctionMap.get(str);
		System.out.println("will delete this auction: "+auction);
		auctionMap.remove(str);
	}
	public void closeAuction(String str)
	{
		auction=(Auction)auctionMap.get(str);
		auction.endAuction();

	}
	public void cancelAuction(String ID)
	{
		
	}

}
