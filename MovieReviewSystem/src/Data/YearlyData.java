package Data;
import java.util.*;
import Exception.*;
class Record
{
	int score;
	int review;
	public Record(int score,int review)
	{
		this.score=score;
		this.review=review;
	}
}

public class YearlyData {
private static YearlyData yearly = new YearlyData();
HashMap <Integer,Record> yearHM;
private YearlyData()
{
	yearHM = new HashMap<Integer,Record>();
}
public static YearlyData getYearlyData()
{
	return yearly;
	}
public void add(int year,int score,int review)
{
	
	if(yearHM.containsKey(year))
	{
		Record record= yearHM.get(year);
		record.score+=score;
		record.review+=review;
		yearHM.put(year, record);
	}
	else
	{
		Record temp= new Record(score,review);
		yearHM.put(year, temp);
	}
}


public int getReviewScore(int year)throws CustomException
{
	if(yearHM.containsKey(year))
	{
		Record temp=  yearHM.get(year);
		return temp.score/temp.review;
	}
	else
	{
		throw new CustomException("No movie reviewed in this year");
	}
	
	}


}
