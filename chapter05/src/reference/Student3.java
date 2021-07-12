package reference;

public class Student3 {
	int studentID;
	String studentName;
	
	Subject korean;			//참조 자료형 (Subject 클래스) 국어 과목 / 점수
	Subject math;			//참조 자료형 (Subject 클래스) 수학 과목 / 점수

	public Student3() {
		korean = new Subject();
		math = new Subject();
	}
	
	public void setKorea (String name, int score) {
		//studentName = name;	
		korean.name = name;
		korean.scorePoint = score;
	}
	
	public void setMath (String name, int score) {
		math.name = name;
		math.scorePoint = score;
	}
}
