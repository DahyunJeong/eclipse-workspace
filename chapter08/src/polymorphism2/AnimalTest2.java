package polymorphism2;

class Animal {
	public void move() {
		System.out.println("동물이 움직입니다.");
	}
}

class Human extends Animal {
	@Override
	public void move() {
		System.out.println("사람이 두 발로 걷습니다.");
	}
}

class Tiger extends Animal {
	@Override
	public void move() {
		System.out.println("호랑이가 네 발로 뜁니다.");
	}
}

class Eagle extends Animal {
	@Override
	public void move() {
		System.out.println("독수리가 하늘을 납니다.");
	}
}

public class AnimalTest2 {
	
	public static void main(String[] args) {
		
		AnimalTest2 aTest = new AnimalTest2();
		aTest.moveAnimal1(new Human());			//Human h = new Human();
		aTest.moveAnimal2(new Tiger());			//Tiger t = new Tiger();
		aTest.moveAnimal3(new Eagle());			//Eagle e = new Eagle();
		
		aTest.moveAnimal(new Human());			//업캐스팅~
		aTest.moveAnimal(new Tiger());			
		aTest.moveAnimal(new Eagle());			//~업캐스팅
	}
	
	public void moveAnimal(Animal animal) {		//Animal animal = new Human(); //업캐스팅
			animal.move();						//Animal animal = new Tiger();
	}											//Animal animal = new Eagle();	
	// => 3개의 메소드를 1개의 메소드로 줄일 수 있음

	
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
