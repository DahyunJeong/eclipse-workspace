package inheritance;

public class ColorPoint extends Point {
	private String color;		//���� �� 
	
	public void setColor(String color) {
		this.color = color;
/*		x = 3;						//��ӵ� ����� �θ� Ŭ������ protected ������ ����� �� �ִ�.
		y = 5;
		set(1, 2);					// public class�� ��� ����
	*/	
	}
	
	public void showColorPoint() {
		System.out.print(color + ": ");
		showPoint();				//��ӹ��� �޼ҵ� ȣ��
	}
	
}