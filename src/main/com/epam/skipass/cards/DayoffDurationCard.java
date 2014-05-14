package main.com.epam.skipass.cards;


import java.util.Calendar;
import java.util.Date;

import main.com.epam.skipass.enums.CardType;
import main.com.epam.skipass.enums.Duration;

public class DayoffDurationCard extends SkiPassCard {

    private Date expirationDate;
    private Duration duration;

	public DayoffDurationCard(Duration duration) {
		super(CardType.DAYOFF);
        this.duration = duration;
	}

    public CardCheckResult check() {
        CardCheckResult result = CardCheckResult.OK;
        if(super.check() != CardCheckResult.OK) {
            result = super.check();
        } else {
            Calendar calendar = Calendar.getInstance();
            int today = calendar.get(Calendar.DAY_OF_WEEK);
            if (today != Calendar.SATURDAY || today != Calendar.SUNDAY) {
                result = CardCheckResult.NOT_DAYOFF;
            } else if (calendar.getTime().after(expirationDate)) {
                result = CardCheckResult.EXPIRED;
            }
        }

        return result;
    }
}
