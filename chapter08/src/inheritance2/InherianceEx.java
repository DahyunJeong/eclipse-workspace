package inheritance2;

public class InherianceEx {

	public static void main(String[] args) {

		Student stu = new Student();
		stu.set();
		
		System.out.println("����: "+stu.age + " �̸�: " + stu.name );
		System.out.println(stu.height);
		System.out.println(stu.getWeight());
	}

}
