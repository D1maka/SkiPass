package main.com.epam.skipass.factories;

import main.com.epam.skipass.cards.SkiPassCard;
import main.com.epam.skipass.cards.WorkingDayDurationCard;
import main.com.epam.skipass.enums.Duration;

/**
 * Created with IntelliJ IDEA.
 * User: Veres
 * Date: 25.04.14
 * Time: 1:49
 * To change this template use File | Settings | File Templates.
 */
public class WorkingDayDurationCardFactory implements CardFactory {
    private Duration duration;

    public WorkingDayDurationCardFactory(Duration duration) {

        this.duration = duration;
    }

    @Override
    public SkiPassCard getCard() {
        return new WorkingDayDurationCard(this.duration);
    }

    public Duration getDuration() {
        return duration;
    }

    public void setDuration(Duration duration) {
        this.duration = duration;
    }
}
