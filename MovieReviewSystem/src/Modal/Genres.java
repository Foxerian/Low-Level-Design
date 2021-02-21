package Modal;

public enum Genres {
ACTION(0),DRAMA(1),COMEDY(2),ROMANCE(3),THRILLER(4),MAXGENRES(5);
private int value;
private Genres(int value) {
	this.value=value;
}
public int getValue()
{
return value;	
}
}
