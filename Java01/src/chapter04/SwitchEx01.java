package chapter04;

public class SwitchEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String medalColor;
		String medal = "���";

		switch (medal) {
		case "Gold":
			medalColor = "�ݸ޴�";
			break;
		case "Silver":
			medalColor = "���޴�";
			break;
		case "Bronze":
			medalColor = "���޴�";
			break;
		default:
			medalColor = "�޴� ����";
			// System.out.println("�޴��� �����ϴ�.");
			break;
		}
		System.out.println(medalColor + " �Դϴ�.");
	}

}
