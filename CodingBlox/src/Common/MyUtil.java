package Common;
import Modal.DifficultyLevel;
public class MyUtil {
	private static MyUtil myutil = new MyUtil();
	public static MyUtil getMyUtilInstance()
	{
		return myutil;
	}
	public DifficultyLevel getDiffculty(String str)
	{
		if(str.equalsIgnoreCase("LOW"))
		{
			return DifficultyLevel.LOW;
		}
		else if(str.equalsIgnoreCase("MEDIUM"))
		{
			return DifficultyLevel.MEDIUM;
		}
		else
		{
			return DifficultyLevel.HIGH;
		}
	}
}
