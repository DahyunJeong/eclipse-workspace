package template;

public class CarTest {

	public static void main(String[] args) {
		
		System.out.println("===���� �����ϴ� �ڵ���===");
		Car aiCar = new AICar();	//Car �������� ��ĳ����
		aiCar.run();
		
		System.out.println("===����� �����ϴ� �ڵ���===");
		Car humanCar = new ManualCar();
		humanCar.run();
		
	}

}
