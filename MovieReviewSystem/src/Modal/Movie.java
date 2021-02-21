package Modal;

public class Movie {
String name;
int year;
Genres genre;
int totalReviewScore;
int totalReviews;
int critics_score;
public Movie(String name, int year, Genres genre) {
	super();
	this.name = name;
	this.year = year;
	this.genre = genre;
	this.totalReviewScore=0;
	this.totalReviews=0;
	this.critics_score=0;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getYear() {
	return year;
}
public void setYear(int year) {
	this.year = year;
}
public Genres getGenre() {
	return genre;
}
public void setGenre(Genres genre) {
	this.genre = genre;
}
public int getTotalReviewScore() {
	return totalReviewScore;
}
public void setTotalReviewScore(int totalReviewScore) {
	this.totalReviewScore = totalReviewScore;
}
public int getTotalReviews() {
	return totalReviews;
}
public void setTotalReviews(int totalReviews) {
	this.totalReviews = totalReviews;
}
public int getCritics_score() {
	return critics_score;
}
public void setCritics_score(int critics_score) {
	this.critics_score = critics_score;
}



}
