package hiding;

public class Sample {

	public int a;
	private int b;
	int c;			//default ����, ���� ��, ���� ��Ű�� �ȿ��� ��� ����
	int d; //->default�� ������ �����Ǿ�� �ϴ� ���� => Yes �ֳ��ϸ� �̹� default�� ���� �ɷ� �����ϸ� ��
	
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	
//	default void ss(int v) { }

}
