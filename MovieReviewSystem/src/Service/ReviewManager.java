package Service;
import Modal.*;

import java.util.*;

import Common.*;
import Data.MovieData;
import Data.PersonData;
import Data.ReviewData;
import Data.YearlyData;
import Exception.*;

public class ReviewManager {
	
	private static ReviewManager reviewManager = new ReviewManager();
	private ReviewManager()
	{
		
	}
	
	public static ReviewManager getReviewManager()
	{
		return reviewManager;
	}
	
	public Boolean addReview(String userName,String movieName,int rating) throws CustomException
	{
		Boolean isCritic=false;
		//check already reviewed
		if(ReviewData.getReviewData().isReviewed(userName, movieName))
		{
			throw new CustomException("Exception Multiple Reviews not allowed User: "+userName+" movie: "+movieName);
		}
		if(rating>10 || rating<0)
		{
			throw new CustomException("Exception Rating should be in 0-10 range");
		}
		//Fetch user info
		User user =PersonData.getPersonData().getPerson(userName);
		//fetch movie info
		Movie movie = MovieData.getMovieData().getMovie(movieName);
		//check if user is critic
		int year = Calendar.getInstance().get(Calendar.YEAR);
		//check movie is release or not, we assuming current year are not released
		if(movie.getYear()==year)
		{
			throw new CustomException("Exception movie yet to be released movie: "+movie.getName());
		}
		
		if(PersonManager.getPersonManager().isCritic(user))
		{
			isCritic=true;
			rating =rating*2;
			int tempCriticScore = movie.getCritics_score();
			movie.setCritics_score(tempCriticScore);
		}
		//add to yearly service
		YearlyData.getYearlyData().add(movie.getYear(), rating, 1);
		//update movie and user local parameters
		int tempTotalReviewScore = movie.getTotalReviewScore();
		movie.setTotalReviewScore(tempTotalReviewScore+rating);
		movie.setTotalReviews(movie.getTotalReviews()+1);
		user.incrementTotalReviews();
		//check if user can be critic after review
		if(!isCritic)
		{
		if(PersonManager.getPersonManager().checkpromotion(user))
		{
			System.out.println("User "+userName+" Got promoted to Critic");
		}
		}
		//add movie in respective genre list
		MovieData.getMovieData().addInMovieGengreList(movie);
		//add review in review list
		Review review = new Review(user,movie,rating);
		ReviewData.getReviewData().addReview(review);
		
		return true;
	}
	
	public void getTopCriticScoreMovie(String genre,int n) throws CustomException
	{
		List <Movie> movieList = MovieData.getMovieData().getTopMoviesByGenre(Utility.getUtility().getGenre(genre), n);
		Iterator<Movie> itr=movieList.iterator();
		while(itr.hasNext())
		{
			Movie temp = itr.next();
			System.out.println("Movie: "+temp.getName());
		}
	}
	public void getYearReviewScore(int year) throws CustomException
	{
		System.out.println(YearlyData.getYearlyData().getReviewScore(year));
	}

}
