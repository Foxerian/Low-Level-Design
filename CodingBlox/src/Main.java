import Service.*;
public class Main {
	public static void main(String args[])
	{
		UserService us = UserService.getUserServiceInstance();
		QuestionService qs= QuestionService.getQuestionServiceInstance();
		ContestService cs= ContestService.getContestServiceInstance();
		System.out.println("dummy");
		us.createUser("Ross");
		us.createUser("Joey");
		us.createUser("Chandler");
		us.createUser("Monica");
		
		qs.createQuestion("low",10);
		qs.createQuestion("medium",20);
		qs.createQuestion("high",30);
		qs.listQuestion("low");
		qs.listQuestion("medium");
		qs.listQuestion("high");
		qs.listQuestion(null);
		
		
		cs.createContest("DecemberRush","low", "ross");
		cs.createContest("NewYearRush","medium", "monica");
		cs.createContest("NoRush","high", "Joey");
		
		cs.listContest("low");
		cs.listContest("high");
		cs.listContest("medium");
		
	}
}
