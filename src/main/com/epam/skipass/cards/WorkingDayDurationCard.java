package main.com.epam.skipass.cards;

import main.com.epam.skipass.enums.CardType;
import main.com.epam.skipass.enums.Duration;

public class WorkingDayDurationCard extends SkiPassCard {

	public WorkingDayDurationCard(Duration duration) {
		super(CardType.WORKINGDAY);
	}
}
