package overrid;

class Shape {
	public Shape next;
	public Shape () {
		next = null;
	}
	public void draw() {
		System.out.println("Shape");
	}
}

class Line extends Shape {
	public void draw() {				//메소드 재정의(메소드 오버라이딩) - 다형성
		System.out.println("Line");
	}
}

class Rect extends Shape {
	public void draw() {
		System.out.println("Rect");
	}
}

class Circle extends Shape {
	public void draw() {
		System.out.println("Circle");
	}
}

public class OverridingEx {
	static void paint(Shape p) {	//업캐스팅
		p.draw();
	}
	public static void main(String[] args) {
		Line line = new Line();
		paint(line);
		paint(new Shape());
		paint(new Line());
		paint(new Rect());
		paint(new Circle());
	}

}
