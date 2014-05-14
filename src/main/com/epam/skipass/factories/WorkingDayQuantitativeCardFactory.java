package main.com.epam.skipass.factories;

import main.com.epam.skipass.cards.SkiPassCard;
import main.com.epam.skipass.cards.WorkingDayQuantitativeCard;
import main.com.epam.skipass.enums.LiftNumber;

/**
 * Created with IntelliJ IDEA.
 * User: Veres
 * Date: 25.04.14
 * Time: 1:51
 * To change this template use File | Settings | File Templates.
 */
public class WorkingDayQuantitativeCardFactory implements CardFactory {
    private LiftNumber liftNumber;

    public WorkingDayQuantitativeCardFactory(LiftNumber liftNumber) {
        this.liftNumber = liftNumber;
    }

    @Override
    public SkiPassCard getCard() {
        return new WorkingDayQuantitativeCard(this.liftNumber);
    }

    public LiftNumber getLiftNumber() {
        return liftNumber;
    }

    public void setLiftNumber(LiftNumber liftNumber) {
        this.liftNumber = liftNumber;
    }
}
