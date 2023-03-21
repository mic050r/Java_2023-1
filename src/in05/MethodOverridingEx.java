package in05;

public class MethodOverridingEx {

	public static void main(String[] args) {
		Line line = new Line();
		Shape p = line; // p는 shape클래스를 가리키는 객체변수인데 line객체를 할당 받아서 업케스팅
		p.a = 234;
		p.b = 345.78;
		p.shpedraw();
		// p는 Shape 클래스의 모든 멤버에 접근할 수 있는데,
		// 오버라이딩(재정의)된 메소드는 하위클래스의 메소드를 호출함.
		p.draw();
	}

}
