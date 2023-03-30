package in12;

public class SoundExam {

	public static void main(String[] args) {
		// Sound tv = new Sound(); // 인터페이스는 객체 생성 불가
		Sound tv = new TV(); // 업캐스팅
		// tv는 Sound인터페이스를 가리키는 객체 변수 이지만 TV클래스를 할당
		Sound radio = new Radio();
		// radio는 Sound인터페이스를 가리키는 객체 변수 이지만 radio클래스를 할당
		tv.SoundUp(5);
		// tv객체변수는 TV클래스에 있는 재정의된 SOundUp() 메소드를 호출
		tv.SoundDown(10);
		radio.SoundUp(5);
		// radio 객체변수는 Radio클래스에 있는 재정의된 SOundUp() 메소드를 호출
		radio.SoundDown(10);
	}

}
