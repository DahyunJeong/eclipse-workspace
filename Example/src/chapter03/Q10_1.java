package chapter03;

public class Q10_1 {

	public static void main(String[] args) {
		int num[][] = new int[4][4];

		for (int i = 0; i < 10; i++) {
			int random = (int) (Math.random() * 10 + 1);
			int x = (int) (Math.random() * 4);
			int y = (int) (Math.random() * 4);

			if (num[x][y] == 0) {
				num[x][y] = random;
			} else
				i--;
		}
		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < num[i].length; j++) {
				System.out.print(num[i][j] + "\t");
				if (j == 3)
					System.out.println();
			}
		}
	}

}
