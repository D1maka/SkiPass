package main.com.epam.skipass.enums;

public enum LiftNumber {
	LIFTS_10(10), LIFTS_20(20), LIFTS_50(50), LIFTS_100(100);

	private int liftCount;

	private LiftNumber(int count) {
		liftCount = count;
	}

	public int getLiftCount() {
		return liftCount;
	}
}
