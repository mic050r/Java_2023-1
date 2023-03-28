package in11;

interface PhoneInterface { // 인터페이스 선언
	final int TIMEOUT = 10000;	// 상수 필드 선언
	void sendCall();			// 추상 메서드(abstract 키워드 생략)
	void receiveCall(); 		// 추상 메소드(abstract 키워드 생략)
	default void printLogo() {	// default 메소드 개발자들의 요청에 의해서 오라클회사에서 기능을 추가
		System.out.println("** Phone **");
	}
}