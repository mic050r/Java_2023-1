package in12;

public class TV implements Sound {
	private int SndLevel;

	public TV() {
		SndLevel = 0;
	}

	@Override
	public void SoundUp(int level) {
		SndLevel += level;
		System.out.println("TV 불륨 " + level + "증가");
	}

	@Override
	public void SoundDown(int level) {
		SndLevel -= level;
		if (SndLevel < 0) {
			SndLevel = 0;
			System.out.println("TV 불륨 " + level + "감소");
		}
	}
}
