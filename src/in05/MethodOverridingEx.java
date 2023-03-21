package in05;

public class MethodOverridingEx {

	static void paint(Shape p) {
		p.draw(); // paint(line);에서 호출되었을 때 draw()메소드는 Line클래스에 있는 메소드
		p.draw2();
	}

	public static void main(String[] args) {
		Line line = new Line();
		// paint(Shape p)메소드를 호출하는데 Shape p = line문장과 같다
//		paint(line);
//		paint(new Shape());
//		paint(new Line());
//		paint(new Rect());
//		paint(new Circle());
	}

}
