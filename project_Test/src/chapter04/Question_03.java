package chapter04;

public class Question_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i = 1; i <10; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.println(i + " x " + j + " = " + (i * j));
			}
			System.out.println();
		}
	}
}