package array;

public class ArrayTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double[] data = new double[5];
		
		data[0] = 10.0;
		data[1] = 20.0;
		data[4] = 30.0;
		
		for(int i = 0; i < data.length; i++) {
		//	data[i] = i*10.0;
			System.out.println(data[i]);
		}
		
		System.out.println();
		
		int[] data2 = {1, 2, 3, 4, 5};
		for(int i = 0; i < data2.length; i++) {
			System.out.println(data2[i]);
		}
		
	}

}
