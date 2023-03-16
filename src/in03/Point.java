package in03;

//p21
public class Point {
	private int x, y; // 한 점을 구성하는 x, y 좌표

	// 기본생성자
	public Point() {
		this.x = 0;
		this.y = 0;
	}

	// 정수형 매개변수 1개를 가지고 있는 생성자
	public Point(int x, int y) { // 멤버변수 x=5, y=6
		// 메소드 싱행이 종료되면 x,y 변수는 사라짐다.
		this.x = x;
		this.y = y;
	}

	public void showPoint() { // 점의 좌표 출력
		System.out.println("(" + x + ", " + y + ")");
	}

}