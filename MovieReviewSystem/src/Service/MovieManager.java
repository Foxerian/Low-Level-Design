package Service;
import Exception.*;
import Modal.*;
import Common.*;
import Data.MovieData;

public class MovieManager {
	private static MovieManager movieManager= new MovieManager();
	private MovieManager()
	{
		
	}
	public static MovieManager getMovieManager()
	{
		return movieManager;
	}
	
	public Boolean addMovie(String name,int year,String genre)
	{
		Genres gen = Utility.getUtility().getGenre(genre);
		Movie movie = new Movie(name,year,gen);
		MovieData.getMovieData().addMovie(movie);
		return true;
	}
	public int averageReviewScore(String movieName) throws CustomException
	{
		Movie movie=MovieData.getMovieData().getMovie(movieName);
		return movie.getTotalReviewScore()/movie.getTotalReviews();
	}

}
