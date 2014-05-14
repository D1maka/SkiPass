package main.com.epam.skipass.cards;


import java.util.Calendar;

import main.com.epam.skipass.enums.CardType;
import main.com.epam.skipass.enums.LiftNumber;

public class WorkingDayQuantitativeCard extends SkiPassCard {

	private int liftsLeft;
	
	public WorkingDayQuantitativeCard(LiftNumber liftNumber) {
		super(CardType.WORKINGDAY);
		liftsLeft = liftNumber.getLiftCount();
	}

    public CardCheckResult check() {
        CardCheckResult result = CardCheckResult.OK;
        if(super.check() != CardCheckResult.OK) {
            result = super.check();
        } else {
            Calendar calendar = Calendar.getInstance();
            int today = calendar.get(Calendar.DAY_OF_WEEK);
            if (today < Calendar.MONDAY || today > Calendar.FRIDAY) {
                result = CardCheckResult.NOT_WORKING_DAY;
            } else if (liftsLeft <= 0) {
                result = CardCheckResult.NO_LIFTS_LEFT;
            }
        }

        return result;
    }
}
