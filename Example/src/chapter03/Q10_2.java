package chapter03;

public class Q10_2 {

	public static void main(String[] args) {
		int[][] num = new int[4][4];

	//	for(int i = 0; i < num.length; i++) {
	//		for(int j = 0; j < num[i].length; j++) {
	//			num[i][j] = 0;
	//		}
	//	}
		for (int i = 0; i < 10;) {
			int x = (int) (Math.random() * 4);
			int y = (int) (Math.random() * 4);
			if(num[x][y] == 0) { 
			num[x][y] = (int) (Math.random() * 10 + 1);
			i++;
			}
		}
		for(int i = 0; i < num.length; i++) {
			for(int j = 0; j < num[i].length; j++) {
				System.out.print(num[i][j] + "\t");
			}
			System.out.println();
		}
		
		//배열은 초기화 안 해도 0인가..!
		int[][] a = new int[4][4];
		for(int i = 0; i < a.length; i++) {
			for(int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j] + "\t");
				
			}
			System.out.println();
		}
	}

}
