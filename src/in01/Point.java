package in01;

public class Point {
	private int x, y; // 한 점을 구성하는 x, y 좌표
	
	public void set(int x, int y) { // x,y는 스택영역에 저장되면
		// 메소드 싱행이 종료되면 x,y 변수는 사라짐다.
		this.x = x;
		this.y = y;
	}
	
	public void showPoint() { //점의 좌표 출력
		System.out.println("(" + x + ", " + y + ")");
	}
	
}
