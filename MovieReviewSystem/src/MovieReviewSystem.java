import Service.*;
import java.util.*;
import Exception.*;
import Data.*;
public class MovieReviewSystem {
	MovieManager movieManager;
	PersonManager personManager;
	ReviewManager reviewManager;
	public MovieReviewSystem()
	{
		movieManager=MovieManager.getMovieManager();
		personManager=PersonManager.getPersonManager();
		reviewManager=ReviewManager.getReviewManager();
	}
	public void addUser(String name)
	{
		System.out.println("User "+name+ " registeration successful: "+personManager.addUser(name));
	}
	public void addMovie(String movie,int year, String genre)
	{
		System.out.println("Movie "+ movie+" Successully added :"+movieManager.addMovie(movie, year, genre));
	}
	
	public void addReview(String user,String movie,int rating)
	{
		try
		{
		reviewManager.addReview(user, movie, rating);
		}
		catch(Exception e)
		{
			System.out.println("Exception Caught "+e);
		}
	}
	public void getTopCriticMovies(int n,String genre)
	{
		try {
		reviewManager.getTopCriticScoreMovie(genre, n);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	public void getYearAverage(int n)
	{
		try {
		reviewManager.getYearReviewScore(n);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	public void getAvgScore(String name)
	{
		try {
		System.out.println("Movie "+name+" average score "+movieManager.averageReviewScore(name));
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	
	public static void main(String args[]) {
		
		MovieReviewSystem MRS = new MovieReviewSystem();
		MRS.addUser("SRK");
		MRS.addUser("SALMAN");
		MRS.addUser("DEEPIKA");
		MRS.addMovie("DON", 2006, "ACTION");
		MRS.addMovie("TIGER", 2008, "DRAMA");
		MRS.addMovie("LUNCHBOX", 2021, "DRAMA");
		MRS.addMovie("GURU", 2006, "DRAMA");
		MRS.addMovie("PADMAVAAT", 2006, "COMEDY");
		MRS.addMovie("METRO", 2006, "ROMANCE");
		MRS.addMovie("KESRI", 2008, "ROMANCE");
		MRS.addReview("SRK", "DON", 2);
		MRS.addReview("SRK", "PADMAVAAT", 8);
		MRS.addReview("SALMAN", "DON", 5);
		MRS.addReview("SALMAN", "KESRI", 8);
		MRS.addReview("DEEPIKA", "DON", 9);
		MRS.addReview("DEEPIKA", "GURU", 6);
		MRS.addReview("SRK", "DON", 10); // should give exception
		MRS.addReview("DEEPIKA", "LUNCHBOX", 5);//exception yet to release
		MRS.addReview("SRK", "TIGER", 5); //promoted to critic
		MRS.addReview("SRK", "METRO", 7);
		MRS.getTopCriticMovies(2,"DRAMA");
		MRS.getTopCriticMovies(1,"ROMANCE");
		MRS.getYearAverage(2008);
		MRS.getAvgScore("DON");
		MRS.getAvgScore("PADMAVAAT");
		MRS.getAvgScore("METRO"); //since SRK is critic so his review gets double weightage
	}

}
