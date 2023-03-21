package in04;

public class UpcastingEx {
	public static void main(String args[]) {
		// Person p = new Student(); ---Upcasting이 된다
		Person p;
		Student s = new Student("이재문");
		p = s;
//		p는 Person 클래스를 가리키는 객체 변수 이고,
//		s는 하위클래스(Student)를 가리키는 객체로
//		p는 s 객체를 할당받음
		System.out.println(p.name);
		p.grade = "A";
		p.department = "Com";
	}
}
