package upcasting;

public class UpcastingEx {

	public static void main(String[] args) {

	//	Person p = new Student("????");	//??ĳ????
		
		Person p;						//
		Student s = new Student("????");
		p = s;							//??ĳ????
		System.out.println(p.name);
		
//		p.grade = "A";					//?????? ????
//		p.department = "HR";			//?????? ????
		p.name = "ȫ?浿";
		p.id = "ID";
		
		s.grade = "A";
		s.department = "HR";
		
		System.out.println("p: " + p.name);
		System.out.println("s: " + s.name);
		
		s.name = "Ȧ??";

		System.out.println("p: " + p.name);
		System.out.println("s: " + s.name);
	}

}
