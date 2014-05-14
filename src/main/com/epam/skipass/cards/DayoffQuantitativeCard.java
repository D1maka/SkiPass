package main.com.epam.skipass.cards;


import java.util.Calendar;

import main.com.epam.skipass.enums.CardType;
import main.com.epam.skipass.enums.LiftNumber;

public class DayoffQuantitativeCard extends SkiPassCard {

    private int liftsLeft;

	public DayoffQuantitativeCard(LiftNumber liftNumber) {
		super(CardType.DAYOFF);
        liftsLeft = liftNumber.getLiftCount();
	}

    @Override
    public CardCheckResult check() {
        CardCheckResult result = CardCheckResult.OK;
        if(super.check() != CardCheckResult.OK) {
            result = super.check();
        } else {
            Calendar calendar = Calendar.getInstance();
            int today = calendar.get(Calendar.DAY_OF_WEEK);
            if (today != Calendar.SATURDAY || today != Calendar.SUNDAY) {
                result = CardCheckResult.NOT_DAYOFF;
            } else if (liftsLeft <= 0) {
                result = CardCheckResult.NO_LIFTS_LEFT;
            }
        }

        return result;
    }
}
