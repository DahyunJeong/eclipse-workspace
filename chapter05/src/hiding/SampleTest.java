package hiding;

public class SampleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Sample aClass = new Sample();
		
		aClass.a = 10;
		//aClass.b = 20;
		aClass.c = 30;
		
		aClass.setB(10);
		
		System.out.println("a ������ ��: " + aClass.a);
	//	System.out.println("b ������ ��: " + aClass.b);
		System.out.println("b ������ ��: " + aClass.getB());
		System.out.println("c ������ ��: " + aClass.c);

	}

}
