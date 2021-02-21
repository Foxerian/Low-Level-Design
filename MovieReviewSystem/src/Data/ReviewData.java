package Data;
import Modal.*;
import java.util.*;
public class ReviewData {
	private static ReviewData reviewData = new ReviewData();
	ArrayList<Review> reviewList;
	private ReviewData()
	{
		reviewList=new ArrayList<Review>();
	}
	public static ReviewData getReviewData()
	{
		return reviewData;
	}
	public void addReview(Review review)
	{
		reviewList.add(review);
	}
	public Review getReview(String user,String movie,int rating)
	{
		Iterator<Review> itr = reviewList.iterator();
		while(itr.hasNext())
		{
			Review temp= itr.next();
			if(temp.getUser().getName().equals(user)&&temp.getMovie().getName().equals(movie)&&temp.getRating()==rating)
			{
				return temp;
			}
		}
		return null;
	}
	public boolean isReviewed(String user,String movie)
	{
		Iterator<Review> itr = reviewList.iterator();
		while(itr.hasNext())
		{
			Review temp= itr.next();
			if(temp.getUser().getName().equals(user)&&temp.getMovie().getName().equals(movie))
			{
				return true;
			}
		}
		return false;
	}

}
