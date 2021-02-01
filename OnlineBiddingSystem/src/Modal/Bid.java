package Modal;

public class Bid {
	Person bidder;
	int bid;
	public Bid(Person bidder, int bid) {
		super();
		this.bidder = bidder;
		this.bid = bid;
	}
	public Person getBidder() {
		return bidder;
	}
	public int getBid() {
		return bid;
	}
	public void setBidder(Bidder bidder) {
		this.bidder = bidder;
	}
	public void setBid(int bid) {
		this.bid = bid;
	}
	
}
