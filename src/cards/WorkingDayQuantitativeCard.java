package cards;

import enums.CardType;
import enums.LiftNumber;

public class WorkingDayQuantitativeCard extends SkiPassCard {

	private int liftsLeft;
	
	public WorkingDayQuantitativeCard(LiftNumber liftNumber) {
		super(CardType.WORKINGDAY);
		liftsLeft = liftNumber.getLiftCount();
	}
}
