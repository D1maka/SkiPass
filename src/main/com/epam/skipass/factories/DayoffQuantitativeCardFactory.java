package main.com.epam.skipass.factories;

import main.com.epam.skipass.cards.DayoffQuantitativeCard;
import main.com.epam.skipass.cards.SkiPassCard;
import main.com.epam.skipass.enums.LiftNumber;

/**
 * Created with IntelliJ IDEA.
 * User: Veres
 * Date: 25.04.14
 * Time: 1:53
 * To change this template use File | Settings | File Templates.
 */
public class DayoffQuantitativeCardFactory implements CardFactory {
    private LiftNumber liftNumber;

    public DayoffQuantitativeCardFactory(LiftNumber liftNumber) {
        this.liftNumber = liftNumber;
    }

    @Override
    public SkiPassCard getCard() {
        LiftNumber lifts = getLiftNumber();
        return new DayoffQuantitativeCard(lifts);
    }

    public LiftNumber getLiftNumber() {
        return liftNumber;
    }

    public void setLiftNumber(LiftNumber liftNumber) {
        this.liftNumber = liftNumber;
    }
}
