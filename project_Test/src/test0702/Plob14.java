package test0702;

public class Plob14 {

	public static void main(String[] args) {

		int[] array = new int[10];
		int sum = 0;
		
		System.out.print("������ ������: ");
		for(int i = 0; i < array.length; i++) {
			array[i] = (int)(Math.random()*10+1);
			sum += array[i];
			System.out.print(array[i] + " ");
		}
		System.out.println();
		System.out.println("����� " + (double)sum/array.length);
		
	}

}
