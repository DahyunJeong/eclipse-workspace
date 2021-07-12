package chapter04;

public class SwitchEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String medalColor;
		String medal = "Silver";

		switch (medal) {
		case "Gold": case "G": case "g": case "Gol":
			medalColor = "금메달";
			break;
		case "Silver": case "S": case "s":
			medalColor = "은메달";
			break;
		case "Bronze": case "B": case "b":
			medalColor = "동메달";
			break;
		default:
			medalColor = "메달 없음";
			// System.out.println("메달이 없습니다.");
			break;
		}
		System.out.println(medalColor + "입니다.");
		
		//Switch문 ---변환-->if문
		
		if ((medal == "Gold") || (medal == "G") || (medal == "g") || (medal == "Gol"))
			System.out.println("if문 금메달입니다.");
		else if ((medal == "Silver") || (medal == "S") || (medal == "s"))
			System.out.println("if문 은메달입니다.");
		else if ((medal == "Bronze") || (medal == "B") || (medal == "b"))
			System.out.println("if문 동메달입니다.");
		else
			System.out.println("if문 메달이 없습니다.");
		
	
	}

}
