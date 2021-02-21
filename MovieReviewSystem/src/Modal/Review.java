package Modal;

public class Review {
Person user;
Movie movie;
int rating;

public Review(Person user, Movie movie, int rating) {
	super();
	this.user = user;
	this.movie = movie;
	this.rating = rating;
}
public Person getUser() {
	return user;
}
public void setUser(Person user) {
	this.user = user;
}
public Movie getMovie() {
	return movie;
}
public void setMovie(Movie movie) {
	this.movie = movie;
}
public int getRating() {
	return rating;
}
public void setRating(int rating) {
	this.rating = rating;
}

}
