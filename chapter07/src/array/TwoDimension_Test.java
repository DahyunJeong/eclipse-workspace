package array;

public class TwoDimension_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		char[][] alpha = new char[13][2];
		
		char alphabet = 'a';
		
		//for(char i = 'a'; )
		for(int i = 0; i < alpha.length; i ++) {
			for(int j = 0; j < alpha[i].length; j++) {
				alpha[i][j] = alphabet++;
				System.out.print(alpha[i][j]);
			}
			System.out.println();
		}
	}

}
