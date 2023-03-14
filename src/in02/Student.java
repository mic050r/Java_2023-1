package in02;

public class Student extends Person {
	public void set() {
		age = 30;
		name = "임지현";
		height = 180;
		// weight = 70; weight가 private으로 설정되었기 때문에 접근 불가
		setWeight(99);
	}
}
