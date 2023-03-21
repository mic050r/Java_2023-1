package in04;

class Student extends Person{
	String grade;
	String department;
	
	public Student(String name) { // name = "이재문"
		// 상위 클래스(Person)의 매개변수 1개를 갖는 생성자 호출
		super(name); 
	}
}
