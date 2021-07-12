package chapter03;

public class OperatorEx11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 10;
		int i = 2;

		boolean value = (((num = num + 10) < 10) && ((i = i + 2) < 10));
		System.out.println(value);
		System.out.println(num);
		System.out.println(i);

		value = ((num = num + 10) < 10) || ((i = i + 2) < 10);
		System.out.println(value);
		System.out.println(num);
		System.out.println(i);
	}

}
