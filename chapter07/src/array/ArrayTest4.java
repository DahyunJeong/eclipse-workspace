package array;

public class ArrayTest4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double[] data = new double[5];

		int size = 0;
		
		data[0] = 10.0; size++;
		data[1] = 20.0; size++;
		data[2] = 30.0; size++;

		double total = 1;

		for (int i = 0; i < size; i++) {
			System.out.println(data[i]);
			total *= data[i];
		}
		System.out.println("total: " + total); // 배열의 저장된 값을 곱하는 경우, 배열이 정의되지 않은 경우가 있어 문제 발생

	}

}
