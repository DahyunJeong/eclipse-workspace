package chapter04;

public class SwitchEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String medalColor;
		String medal = "띠용";

		switch (medal) {
		case "Gold":
			medalColor = "금메달";
			break;
		case "Silver":
			medalColor = "은메달";
			break;
		case "Bronze":
			medalColor = "동메달";
			break;
		default:
			medalColor = "메달 없음";
			// System.out.println("메달이 없습니다.");
			break;
		}
		System.out.println(medalColor + " 입니다.");
	}

}
