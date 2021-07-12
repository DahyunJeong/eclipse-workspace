package singleton;

public class CompanyTest {

	public static void main(String[] args) {

//		Company instance2 = new Company();	//외부클래스에서 접근 불가!
	
		Company myCompany1 = Company.getInstance();		//
		Company myCompany2 = Company.getInstance();
		
		System.out.println(myCompany1 == myCompany2);
		
		int[] array = new int[100];
		double[] array2 = new double[100];
		int[] arr = new int[] {2, 3, 4};
		int[] ar = {1, 2, 3};
		char[] rs = new char[] {'d', 'd', 'd'};
		
		char[] rr = new char[3];
		rr[2] = 'd';
		rr[3] = 'd';
		rr[10] = 'd';
		arr[10] = 10;
		
		ar[5] = 3;
		rs[4] = 'S';
		array[1] = 10;
	}

}
