package Data;
import Exception.*;
import Modal.*;
import java.util.*;
public class MovieData {
	private static MovieData movieData = new MovieData();
	HashMap <String,Movie> movieMap;
	ArrayList <ArrayList<Movie>> genreMovieList;
	int x = Genres.MAXGENRES.getValue();
	private MovieData()
	{
		movieMap= new HashMap<String,Movie>();
		genreMovieList = new ArrayList< ArrayList<Movie>>(Genres.MAXGENRES.getValue());
		for(int i=0;i<Genres.MAXGENRES.getValue();i++)
		{
			genreMovieList.add(new ArrayList<Movie>());
		}
	}
	public static MovieData getMovieData()
	{
		return movieData;
	}
	public Movie getMovie(String movieName) throws CustomException
	{
		if(movieMap.containsKey(movieName))
		{
		return movieMap.get(movieName);
		}
		else
		{
			throw new CustomException("Invalid movie name");
		}
	}
	
	public void addMovie(Movie movie)
	{
		movieMap.put(movie.getName(), movie);
		addInMovieGengreList(movie);
	}
	
	public void addInMovieGengreList(Movie movie)
	{
		genreMovieList.get(movie.getGenre().getValue()).add(movie);
	}
	
	public List<Movie> getTopMoviesByGenre(Genres genre,int n) throws CustomException
	{
		int index=genre.getValue();
		//check n
		if(n>genreMovieList.get(index).size())
		{
			throw new CustomException("Given input is bigger than list of movies present in Genre");
		}
		
		Collections.sort(genreMovieList.get(index), new Comparator<Movie>() {
		    public int compare(Movie one, Movie other) {
		        return other.getCritics_score()-one.getCritics_score();
		    }
		});
		List<Movie> result = genreMovieList.get(index).subList(0,n);
		return result;
	}
	
	public int getAverageScore(String movie)
	{
		Movie m = movieMap.get(movie);
		int score = m.getTotalReviewScore();
		int total = m.getTotalReviews();
		return score/total;
	}

}
