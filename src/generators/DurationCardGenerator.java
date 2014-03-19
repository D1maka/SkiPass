package generators;

public class DurationCardGenerator implements Generator {

	private SkiPassCard.CardType cardType;
	private SkiPassCard.LiftsNumber liftsNumber;
	private SkiPassCard.Duration duration;
	
	public DurationCardGenerator(SkiPassCard.CardType cardType, SkiPassCard.Duration duration) {
		this.cardType = cardType;
		this.liftsNumber = SkiPassCard.LiftsNumber.UNLIMITED;
		this.duration = duration;
	}
	
	
	@Override
	public SkiPassCard generateCard() {
		return new SkiPassCard(cardType, liftsNumber, duration);
	}

}
