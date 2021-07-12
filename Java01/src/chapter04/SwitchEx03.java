package chapter04;


public class SwitchEx03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int month = 2;
		int day = 0;
		
		switch (month) {
		case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			day = 31;
			break;
		case 4: case 6: case 9: case 11:
			day  = 30;
			break;
		case 2:
			day = 28;
			break;
		}
		if (day == 0) {
			System.out.println(month + "달은 존재하지 않습니다.");
		}
		else
			System.out.println(month+"달은 " + day + "일까지 있습니다.");
	}

}
