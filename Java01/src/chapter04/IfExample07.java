package chapter04;

public class IfExample07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int score = 70;
		char grade;
		
		grade = (score >= 90) ? 'A' : 'B' ;
		
		System.out.println("당신의 점수는 " + score + "점, 학점은 " + grade + "입니다.");
	}

}
