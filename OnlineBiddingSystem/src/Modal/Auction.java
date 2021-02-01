package Modal;
import java.util.*;

public class Auction {
	String ID;
	Date startDate;
	Date endDate;
	AuctionStatus status;
	int highestLimit;
	int lowestLimit;
	Person seller;
	List <Bid> bidderList;
	HashMap bidderHash;
	public Auction() {
		bidderList=new ArrayList<Bid>();
		bidderHash=new HashMap<String,Integer>();
	}
	public String getID() {
		return ID;
	}
	public Date getStartDate() {
		return startDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public AuctionStatus getStatus() {
		return status;
	}
	public int getHighestLimit() {
		return highestLimit;
	}
	public int getLowestLimit() {
		return lowestLimit;
	}
	public Person getSeller() {
		return seller;
	}
	public void setID(String iD) {
		ID = iD;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	public void setStatus(AuctionStatus status) {
		this.status = status;
	}
	public void setHighestLimit(int highestLimit) {
		this.highestLimit = highestLimit;
	}
	public void setLowestLimit(int lowestLimit) {
		this.lowestLimit = lowestLimit;
	}
	public void setSeller(Person seller) {
		this.seller = seller;
	}
	
	public String toString()
	{
		return "ID: "+this.ID+" Seller: "+this.seller;
	}
	public void addBid(Person bidder,int bid)
	{
		//int index = bidderList.size();
		bidderList.add(new Bid(bidder,bid));
		//bidderHash.put(bidder.name.firstName, index);
	}
	public void deleteBid(Person bidder)
	{
		//int index=(Integer)bidderHash.get(bidder.name.firstName);
		Iterator itr = bidderList.iterator();
		while(itr.hasNext())
		{
			Bid bid = (Bid)itr.next();
			if(bid.bidder.name.firstName.equals(bidder.name.firstName))
			{
				itr.remove();
				break;
			}
		}
		//bidderList.remove(index);
		//bidderHash.remove(bidder.name.firstName);
	}
	public void endAuction()
	{
		Collections.sort(bidderList, new Comparator<Bid>() {
			public int compare(Bid A,Bid B) {
			return B.bid-A.bid;
			}
		});
		Iterator<Bid> itr = bidderList.iterator();
		/*while(itr.hasNext())
		{
			Bid curr=null;
			curr= itr.next();
			System.out.println("current is "+curr.bidder.name.firstName+" bid "+curr.bid);
		}*/
		
		Bid prev=null;
		Bid curr=null;
		while(itr.hasNext())
		{
			if(prev==null)
			{
				prev=itr.next();
				continue;
			}
			else {
			curr=itr.next();
			if(curr.bid==prev.bid)
			{
				while(curr.bid==prev.bid)
				{
					if(itr.hasNext())
					{
						curr=itr.next();
					}
					else
					{
						curr=null;
						break;
					}
				}
				prev=curr;
			}
			else
			{
				break;
			}
			}
		}
		System.out.println("winner is "+prev.bidder.name.firstName+" winning bid "+prev.bid);
	}
}
