package chapter04;

public class SwitchEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String medalColor;
		String medal = "Silver";

		switch (medal) {
		case "Gold": case "G": case "g": case "Gol":
			medalColor = "�ݸ޴�";
			break;
		case "Silver": case "S": case "s":
			medalColor = "���޴�";
			break;
		case "Bronze": case "B": case "b":
			medalColor = "���޴�";
			break;
		default:
			medalColor = "�޴� ����";
			// System.out.println("�޴��� �����ϴ�.");
			break;
		}
		System.out.println(medalColor + "�Դϴ�.");
		
		//Switch�� ---��ȯ-->if��
		
		if ((medal == "Gold") || (medal == "G") || (medal == "g") || (medal == "Gol"))
			System.out.println("if�� �ݸ޴��Դϴ�.");
		else if ((medal == "Silver") || (medal == "S") || (medal == "s"))
			System.out.println("if�� ���޴��Դϴ�.");
		else if ((medal == "Bronze") || (medal == "B") || (medal == "b"))
			System.out.println("if�� ���޴��Դϴ�.");
		else
			System.out.println("if�� �޴��� �����ϴ�.");
		
	
	}

}
