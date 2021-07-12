package template;

public class CarTest {

	public static void main(String[] args) {
		
		System.out.println("===자율 주행하는 자동차===");
		Car aiCar = new AICar();	//Car 형식으로 업캐스팅
		aiCar.run();
		
		System.out.println("===사람이 운전하는 자동차===");
		Car humanCar = new ManualCar();
		humanCar.run();
		
	}

}
