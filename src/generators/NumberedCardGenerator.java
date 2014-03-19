package generators;

import SkiPassCard.CardType;
import SkiPassCard.Duration;
import SkiPassCard.LiftsNumber;

public class NumberedCardGenerator implements Generator {
	private SkiPassCard.CardType cardType;
	private SkiPassCard.LiftsNumber liftsNumber;
	private SkiPassCard.Duration duration;
	
	public NumberedCardGenerator(CardType cardType, LiftsNumber liftsNumber) {
		this.cardType = cardType;
		this.liftsNumber = liftsNumber;
		this.duration = SkiPassCard.Duration.UNLIMITED;
	}

	@Override
	public SkiPassCard generateCard() {
		return new SkiPassCard(cardType, liftsNumber, duration);
	}	
}
