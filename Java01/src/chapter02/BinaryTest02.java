package chapter02;

public class BinaryTest02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1 = 0B00000000000000000000000000000101;
		int num2 = 0B11111111111111111111111111111011;
		
		System.out.println("num1(" + num1 + ") + num2(" +num2+ ") = " + (num1+num2));
		
		int num3 = 0B00000000000000000000000001000110;
		int num4 = 0B11111111111111111111111110111010;
		
		System.out.println("num3(" + num3 + ") + num4(" +num4+ ") = " + (num3+num4));

	}

}
