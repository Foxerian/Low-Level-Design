package Modal;

import java.util.Date;
import Service.AuctionService;
import Manager.UserManager;

public class Admin extends Person {
	boolean adminflag;
	AuctionService auctionService;
	UserManager userManager;
	private static Admin admin = new Admin(new Name("root","root","root"),30, new Date(),true);
	private Admin(Name name, int age, Date dateOfJoin, boolean adminflag) {
		super(name, age, dateOfJoin);
		this.adminflag = adminflag;
		auctionService = AuctionService.getAuctionServiceInstance();
		userManager=UserManager.getUserManagerInstance();
	}
	public static Admin getAdminInstance()
	{
		return admin;
	}
	public void createAuction(String ID,int Hl,int ll,String seller)
	{
		Person user=userManager.getUserHash().get(seller);
		auctionService.createAuction(ID, new Date(), new Date(new Date().getTime()+3600000), AuctionStatus.ACTIVE, Hl, ll, user);
	}
	
	public void endAucton(String ID)
	{
		auctionService.closeAuction(ID);
		System.out.println("Auction results are announced");
	}
}
