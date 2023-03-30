package in12;

public interface Sound { // 인터페이스는 태생 자체가 추상메소드만 작성
	// 인터페이스에서 abstract 생갹가능
	public void SoundUp(int level); // 추성 메소드

	public void SoundDown(int level);
	// 오류발생, default나 static을 추가하거나 body 삭제하기
	/*
	 * public void SoundStop() { System.out.println("중단"); }
	 */
}
