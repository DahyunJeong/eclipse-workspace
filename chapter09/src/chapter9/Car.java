package chapter9;

public abstract class Car {
	
	public abstract void startCar();
	public abstract void drive();
	public abstract void stop();
	public abstract void turnOff();
	
	final public void run() {			//���ø� �޼���
		startCar();
		drive();
		stop();
		turnOff();
		washCar();
	}
	
	final public void washCar() {
		System.out.println("������ �մϴ�.");
	}
}
