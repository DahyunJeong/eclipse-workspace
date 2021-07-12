package reference;

public class Subject {
	String name;		//과목 
	int scorePoint;			//점수
	
/*	public String getName() {
		return name;
	}
	public void setName(String subjectName) {
		this.name = subjectName;
	}
	public int getScorePoint() {
		return scorePoint;
	}
	public void setScorePoint(int scorePoint) {
		this.scorePoint = scorePoint;
	}
*/
	public void setKorean(String n, int score) {
		name = n;
		scorePoint = score;
	}
	
	public void setMath(String n, int score) {
		name = n;
		scorePoint = score;
	}
	
	public String getName () {
		return name;
	}
	public int getScorePoint() {
		return scorePoint;
	}
	
}
