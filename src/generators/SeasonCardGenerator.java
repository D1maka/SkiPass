package generators;

import SkiPassCard.CardType;
import SkiPassCard.Duration;
import SkiPassCard.LiftsNumber;

public class SeasonCardGenerator implements Generator {

	private SkiPassCard.CardType cardType;
	private SkiPassCard.LiftsNumber liftsNumber;
	private SkiPassCard.Duration duration;
	
	public SeasonCardGenerator() {
		this.cardType = SkiPassCard.CardType.SEASON;
		this.liftsNumber = SkiPassCard.LiftsNumber.UNLIMITED;
		this.duration = SkiPassCard.Duration.UNLIMITED;
	}

	@Override
	public SkiPassCard generateCard() {
		return new SkiPassCard(cardType, liftsNumber, duration);
	}

}
