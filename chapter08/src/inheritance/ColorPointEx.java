package inheritance;

public class ColorPointEx {

	public static void main(String[] args) {
		
		Point p = new Point();		//Point Ŭ������ �⺻ ������ ȣ��
		
		p.set(1, 2);
		p.x = 1;
		p.y = 2;
		p.showPoint();
		
		ColorPoint cp = new ColorPoint();
		
		cp.set(3, 5);				//ColorPoint�� Point�� ��ӹ޾� ����� �� �ִ� �޼ҵ�
		cp.x = 3;					//Point�� ��������� Protected�� ���������ڸ� �ξ��⿡
		cp.y = 5;					//��Ӱ����� Ŭ������ ����� �� �ִ�.
		cp.setColor("red");
		cp.showColorPoint();

	}

}