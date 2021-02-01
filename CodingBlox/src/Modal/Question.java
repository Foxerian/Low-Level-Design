package Modal;

public class Question {
	DifficultyLevel level;
	int Score;
	int ID;
	
	public Question(DifficultyLevel level, int score, int iD) {
		super();
		this.level = level;
		Score = score;
		ID = iD;
	}
	public DifficultyLevel getLevel() {
		return level;
	}
	public int getScore() {
		return Score;
	}
	public int getID() {
		return ID;
	}
	public void setLevel(DifficultyLevel level) {
		this.level = level;
	}
	public void setScore(int score) {
		Score = score;
	}
	public void setID(int iD) {
		ID = iD;
	}
	
}
