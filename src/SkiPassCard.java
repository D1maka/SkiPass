public class SkiPassCard {

	public enum CardType {
		DAYOFF, WORKINGDAY, SEASON
	}

	public enum LiftNumber {
		UNLIMITED(-1), LIFTS_10(10), LIFTS_20(20), LIFTS_50(50), LIFTS_100(100);

		private int liftCount;

		private LiftNumber(int count) {
			liftCount = count;
		}

		public int getLiftCount() {
			return liftCount;
		}
	}

	public enum Duration {
		UNLIMITED, HALFDAY, DAY_1, DAY_2, DAY_5;
	}
	
	public static long nextId = 1;

	private long id;
	private CardType type;
	private int liftsLeft;
	private Duration duration;
	private boolean blocked;

	public SkiPassCard(CardType type, LiftNumber liftsLeft, Duration duration) {
		id = nextId++;
		this.type = type;
		this.liftsLeft = liftsLeft.getLiftCount();
		this.duration = duration;
		this.blocked = false;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public CardType getType() {
		return type;
	}

	public void setType(CardType type) {
		this.type = type;
	}

	public int getLiftsLeft() {
		return liftsLeft;
	}

	public void setLiftsLeft(int liftsLeft) {
		this.liftsLeft = liftsLeft;
	}

	public Duration getDuration() {
		return duration;
	}

	public void setDuration(Duration duration) {
		this.duration = duration;
	}

	public boolean isBlocked() {
		return blocked;
	}

	public void setBlocked(boolean blocked) {
		this.blocked = blocked;
	}

}
