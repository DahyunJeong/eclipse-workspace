package array;

public class TwoDimansion2 {

	public static void main(String[] args) {
		
		int[][] arr = new int[2][3];
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				arr[i][j] = (i+j+1)*10;
				System.out.println(arr[i][j]);
			}
			System.out.println();
		}
		System.out.println(arr.length);
		System.out.println(arr[0].length);
		
	}
	
}
