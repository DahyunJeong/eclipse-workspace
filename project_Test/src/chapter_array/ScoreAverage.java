package chapter_array;

public class ScoreAverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double[][] score = { { 3.3, 3.4 }, { 3.5, 3.6 }, { 3.7, 4.0 }, { 4.1, 4.2 } };
		double sum = 0;
		int number = 0;
		
		for(int i = 0; i < score.length; i++) {
			for(int j = 0; j < score[i].length; j++) {
				sum += score[i][j];
				number++;
			}
		}

		System.out.println("4³â ÆòÁ¡: " + (sum/number));

	}

}
