package chapter03;

public class OperatorEx14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 10;		//1010
		int b = 5;		//0101
		
		int result;
		
		result = ~a;	//0101 ---2ÀÇ º¸¼ö---> 1011
		System.out.println("~a: " + result);
		
		result = a & b;	
		System.out.println("a & b " + result);
		
		result = a | b;	//1111
		System.out.println("a | b " + result);
	
		result = a ^ b;	//1111
		System.out.println("a ^ b " + result);
		System.out.println();
		
		int c = 9, d = 5; //1001 0101
		int re;
		
		re = c & d;		//0001
		System.out.println("a & b " + re);
		
		re = c | d;	//1101
		System.out.println("a | b " + re);
	
		re = c ^ d;	//1100
		System.out.println("a ^ b " + re);
	}

}
