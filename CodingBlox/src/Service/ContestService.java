package Service;
import java.util.*;

import Common.MyUtil;
import Modal.*;
public class ContestService {
	
	HashMap<Integer,Contest> contestHash;
	int total=0;
	private static  ContestService cs = new ContestService();
	private ContestService()
	{
		contestHash = new HashMap<Integer,Contest>();
	}
	
	public static ContestService getContestServiceInstance()
	{
		return cs;
	}
	public void createContest(String name,String level,String username)
	{
		total++;
		DifficultyLevel x=MyUtil.getMyUtilInstance().getDiffculty(level);
		User user= UserService.getUserServiceInstance().getUserByName(username);
				Contest con = new Contest(name,x,user,total);
				contestHash.put(total, con);
				con.attendContest(user);
	}
	public void listContest(String level)
	{
		DifficultyLevel x=null;
		if(level!=null)
		{
			x=MyUtil.getMyUtilInstance().getDiffculty(level);
		}
		System.out.println("All Contest List");
		Iterator itr = contestHash.entrySet().iterator();
		Contest obj;
		while(itr.hasNext())
		{
			Map.Entry mapelement = (Map.Entry)itr.next();
			if(level==null)
			{
				obj=(Contest)mapelement.getValue();
				System.out.println("constest ID "+obj.getID()+" difficulty "+obj.getLevel());
			}
			else
			{
				obj=(Contest)mapelement.getValue();
				if(obj.getLevel()==x)
				{
					System.out.println("contest ID "+obj.getID()+" difficulty "+obj.getLevel());
				}
			}
		}
	}
	public void runContest(int contest_id,String username)
	{
		User user= UserService.getUserServiceInstance().getUserByName(username);
		Contest contest = contestHash.get(contest_id);
		User admin = contest.getCreator();
		if(user.getName().contentEquals(contest.getName()))
		{
			
		}
	}
	
	/*
	 public void attendContest
	 */
}
