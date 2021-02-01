package src;
import java.util.*;

import Service.OnlineBiddingSystem;
public class Main {
	public static void main(String args[])
	{
		OnlineBiddingSystem obs = new OnlineBiddingSystem("Antique Privat Limited","Mahadevpura",new Date());
		obs.addUser("vivek", "kumar", "sharma",28,new Date(), true);
		obs.addUser("mudit", "kumar", "sharma",28,new Date(), false);
		obs.addUser("micky", "kumar", "sha",30,new Date(), false);
		obs.addUser("mud", "kum", "sha",30,new Date(), false);
		obs.addUser("Jim", "Kerry", "sha",30,new Date(), false);
		
		obs.createAuction("DecemberRush",100,50,"vivek");
		obs.makeBid("DecemberRush", "mud", 90);
		obs.makeBid("DecemberRush", "Jim", 90);
		obs.makeBid("DecemberRush", "mudit", 70);
		obs.makeBid("DecemberRush", "micky", 30);
		obs.deleteBid("DecemberRush", "micky");
		obs.closeAuction("DecemberRush");
	}
}
