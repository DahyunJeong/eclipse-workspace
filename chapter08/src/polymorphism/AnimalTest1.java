package polymorphism;

class Animal {
	public void move() {
		System.out.println("������ �����Դϴ�.");
	}
}

class Human extends Animal {
	@Override
	public void move() {
		System.out.println("����� �� �߷� �Ƚ��ϴ�.");
	}
}

class Tiger extends Animal {
	@Override
	public void move() {
		System.out.println("ȣ���̰� �� �߷� �ݴϴ�.");
	}
}

class Eagle extends Animal {
	@Override
	public void move() {
		System.out.println("�������� �ϴ��� ���ϴ�.");
	}
}

public class AnimalTest1 {
	
	public void moveAnimal(Animal animal) {
		animal.move();							//�������ε��� ���� Override �� move�� �����
	}
	
	public static void main(String[] args) {
		
		AnimalTest1 aTest = new AnimalTest1();
		aTest.moveAnimal(new Human());			//��ĳ���� Animal animal = new Human();
		aTest.moveAnimal(new Tiger());			//��ĳ����
		aTest.moveAnimal(new Eagle());			//��ĳ����
	}

}