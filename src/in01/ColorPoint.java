package in01;

public class ColorPoint extends Point{
	private String color; //점의 색

	public void setColor(String color) {
		this.color = color; //멤버변수에 color값을 저장
	}
	
	public void showColorPoint() { // 컬러 점의 좌표 출력
		System.out.print(color);
		showPoint(); //Point 클래스의 showPoint 호출
	}
	
}
