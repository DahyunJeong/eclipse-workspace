package abstractex;

public class ComputerTest {

	public static void main(String[] args) {
		
//		Computer c1 = new Computer();		//Computer는 추상 클래스이기 때문에 객체를 생성할 수 없다.
		Computer c2 = new DeskTop();
//		Computer c3 = new NoteBook();		//추상 클래스이기 때문에 객체를 생성할 수 없다.
		Computer c4 = new MyNoteBook();
		
		
	}

}
