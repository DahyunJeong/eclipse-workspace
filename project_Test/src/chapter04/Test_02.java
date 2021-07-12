package chapter04;
import java.util.Scanner;

public class Test_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("이름, 도시, 나이, 체중, 독신여부를 빈칸으로 분리하여 입력하세요.");
		
		String name = sc.next();
		System.out.print("이름은 " + name + ", ");
		
		String city = sc.next();
		System.out.print("도시는 " + city + ", ");
		
		int age = sc.nextInt();
		System.out.print("나이는 " + age + "살 , ");
		
		double weight = sc.nextDouble();
		System.out.print("체중은 " + weight + ", ");
		
		boolean single = sc.nextBoolean();
		System.out.println("독신 여부는 " + single + "입니다.");
		
		sc.close();
	}

}
