package in03;

public class ColorPoint extends Point {
	private String color; // 점의 색

	public ColorPoint(int x, int y, String color) { // x=5, y=6,color="blue"
		// Point 클래스에 호출
		super(x, y);// x = 5, y=6
		// super(); ---super메소드는 1개만 존재
		this.color = color; // 멤버변수에 color="blue" 저장
		// super(x, y);---이 메소드는 반드시 첫번째 라인에 위치
	}

	public void showColorPoint() { // 컬러 점의 좌표 출력
		System.out.print(color);
		showPoint(); // Point 클래스의 showPoint 호출
	}

}
