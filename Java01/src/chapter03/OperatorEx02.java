package chapter03;

public class OperatorEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int mathScore = 90;
		int engScore = 70;
		
		int totalScore = mathScore + engScore;
		System.out.println("���� �հ�: " + totalScore);
		
		int avgS = (mathScore+engScore)/2;
		System.out.println("���� ���: " + avgS);
		
		int mod = mathScore % engScore;
		String ch1 = "���� �������� ��: ";
		System.out.println(ch1 + mod);
		
		
	}

}
