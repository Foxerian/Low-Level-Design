package Service;
import java.util.*;
import Modal.Question;
import Modal.*;
import Common.*;
public class QuestionService {
	int totalQuestions;
	HashMap<Integer,Question> questionHash;
	private static QuestionService qs = new QuestionService();
	private QuestionService()
	{
		questionHash=new HashMap<Integer,Question>();
		totalQuestions=0;
	}
	public static QuestionService getQuestionServiceInstance()
	{
		return qs;
	}
	
	
	public void createQuestion( String str,int score)
	{
		DifficultyLevel x=MyUtil.getMyUtilInstance().getDiffculty(str);
		totalQuestions++;
		Question qs = new Question(x,score,totalQuestions);
		questionHash.put(totalQuestions,qs);
	}
	public void listQuestion(String str)
	{
		DifficultyLevel x=null;
		if(str!=null)
		{
			x=MyUtil.getMyUtilInstance().getDiffculty(str);
		}
		System.out.println("All Questions List");
		Iterator itr = questionHash.entrySet().iterator();
		Question obj;
		while(itr.hasNext())
		{
			Map.Entry mapelement = (Map.Entry)itr.next();
			if(str==null)
			{
				obj=(Question)mapelement.getValue();
				System.out.println("question ID "+obj.getID()+" difficulty "+obj.getLevel());
			}
			else
			{
				obj=(Question)mapelement.getValue();
				if(obj.getLevel()==x)
				{
					System.out.println("question ID "+obj.getID()+" difficulty "+obj.getLevel());
				}
			}
		}
		
		
	}
	public void showall()
	{
		
	}

}
