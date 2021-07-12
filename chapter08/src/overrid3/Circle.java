package overrid3;

class Shape {
	protected String name;
	public void paint() {
		draw();
	}
	public void draw() {
		System.out.println("super: " + name);
	}
}

public class Circle extends Shape {
	protected String name;
	
		@Override
	public void draw() {
		name = "Circle";
		super.name = "Shape";
		super.draw();				//부모 draw 먼저 출력
		System.out.println("child: " + name);
	}
	
	public static void main(String[] args) {
		Shape b = new Circle();		//업캐스팅
		b.paint();
	}

}
