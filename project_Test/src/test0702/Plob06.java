package test0702;

public class Plob06 {

	public static void main(String[] args) {
		int max = 0;
		int[] array = { 4, 5, 1, 2, 3 };

		for (int i = 0; i < array.length; i++) {
			if (max < array[i]) {
				max = array[i];
			}
			else
				continue;
		}
		System.out.println("max: " + max);
	}

}

/*//Plob10
public class Person {
	String name;
	int age;
	char gender;
}
*/