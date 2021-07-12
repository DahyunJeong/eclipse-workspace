package chapter04;

public class IfExample06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int score = 90;
		char grade;
		
		if (score >= 90) {
			grade = 'A';
		}
		else {
			grade = 'B';
		}
		System.out.println("당신의 점수는 " + score + "점, 학점은 " + grade + "입니다.");
	}

}
