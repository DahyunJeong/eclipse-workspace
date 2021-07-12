package chapter04;

public class Test_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println('a' > 'b');		//false
		System.out.println(3 >= 2);			//T
		System.out.println(-1 < 0);			//true
		System.out.println(3.45 <= 2);		//F
		System.out.println(3 == 2);			//F
		System.out.println(3 != 2);			//T
		System.out.println(!(3 != 2));		//F
		
		System.out.println((3>2) && (3>4));	//F
		System.out.println((3 != 2) || (-1 > 0));	//T
		System.out.println((3 != 2) ^ (-1 > 0));	//T
	}

}
