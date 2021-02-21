package Common;

import Modal.Genres;

public class Utility {
	private static Utility util = new Utility();
	private Utility()
	{
		
	}
	public static Utility getUtility()
	{
		return util;
	}
	public Genres getGenre(String genre)
	{
		Genres gen=null;
		switch(genre)
		{
		case "ACTION" : gen=Genres.ACTION;
						break;
		case "COMEDY" : gen=Genres.COMEDY;
						break;
		case "DRAMA" :  gen=Genres.DRAMA;
						break;
		case "ROMANCE" : gen=Genres.ROMANCE;
						break;
		case "THRILLER" : gen=Genres.THRILLER;
						break;
		default : //throw exception;
		}
		return gen;
	}
}
