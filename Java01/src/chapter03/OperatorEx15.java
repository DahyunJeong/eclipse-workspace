package chapter03;

public class OperatorEx15 {
	public static void main(String[] args) {

		int num = 0B00000101;

		System.out.println(num << 2); 	// 0001 0100 -- 5*2^2-> 20
		System.out.println(num << 3);	// 0010 1000 -- 5*2^3-> 40
		System.out.println(num << 4);	// 0101 0000 -- 5*2^4-> 80
		System.out.println(num >> 2);	// 0000 0001 -- 5/2^2-> 1
		System.out.println(num >>> 2); 	// 0000 0001

		System.out.println(num);

		num = num << 2;
		System.out.println(num);
		
	}
}
