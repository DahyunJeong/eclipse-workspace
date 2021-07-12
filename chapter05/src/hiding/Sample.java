package hiding;

public class Sample {

	public int a;
	private int b;
	int c;			//default 적용, 생략 됨, 같은 패키지 안에서 사용 가능
	int d; //->default는 무조건 생략되어야 하는 건지 => Yes 왜냐하면 이미 default가 써진 걸로 생각하면 됨
	
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	
//	default void ss(int v) { }

}
