package chapter03;

public class OperatorEx04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int gameS = 150;
		System.out.println("gameS: " + gameS);
		
		int lastS1 = ++gameS;
		System.out.println("lastS1: " + lastS1);
		
		System.out.println("gameS: " + gameS);
		
		int lastS2 = gameS--;
		System.out.println("lastS2: " + lastS2);
		System.out.println("gameS: " + gameS);
	}

}
