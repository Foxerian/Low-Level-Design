package Modal;
public class User extends Person {
	int total_reviews;
	
	public User(String name)
	{
		super(name);
		this.total_reviews=0;
		this.level=UserLevel.USER;
	}
	
	public int getTotalReviews()
	{
		return total_reviews;
	}
	
	public void incrementTotalReviews()
	{
		total_reviews++;
	}
}
