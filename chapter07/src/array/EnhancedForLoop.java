package array;

public class EnhancedForLoop {
	public static void main(String[] args) {
		
		String[] strArray = {"Java", "Android", "C", "JavaScript", "Python"};
		
		for(String str : strArray) {
			System.out.println(str);
		}
		
		int[][] num = {{1, 2, 3}, {4, 5, 6}};
		for(int i : num[1]) {
			System.out.println(i);
		}
	}
}
