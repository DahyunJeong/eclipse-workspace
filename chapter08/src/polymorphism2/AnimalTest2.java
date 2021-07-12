package polymorphism2;

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

public class AnimalTest2 {
	
	public static void main(String[] args) {
		
		AnimalTest2 aTest = new AnimalTest2();
		aTest.moveAnimal1(new Human());			//Human h = new Human();
		aTest.moveAnimal2(new Tiger());			//Tiger t = new Tiger();
		aTest.moveAnimal3(new Eagle());			//Eagle e = new Eagle();
		
		aTest.moveAnimal(new Human());			//��ĳ����~
		aTest.moveAnimal(new Tiger());			
		aTest.moveAnimal(new Eagle());			//~��ĳ����
	}
	
	public void moveAnimal(Animal animal) {		//Animal animal = new Human(); //��ĳ����
			animal.move();						//Animal animal = new Tiger();
	}											//Animal animal = new Eagle();	
	// => 3���� �޼ҵ带 1���� �޼ҵ�� ���� �� ����

	
	public void moveAnimal1(Human h) {		//Human h = new Human();
		h.move();						
	}
	public void moveAnimal2(Tiger t) {		//Tiger t = new Tiger();
		t.move();							
	}
	public void moveAnimal3(Eagle e) {		//Eagle e = new Eagle();
		e.move();							
	}
}
