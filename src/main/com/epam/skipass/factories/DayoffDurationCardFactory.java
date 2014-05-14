package main.com.epam.skipass.factories;

import main.com.epam.skipass.cards.DayoffDurationCard;
import main.com.epam.skipass.cards.SkiPassCard;
import main.com.epam.skipass.enums.Duration;

/**
 * Created with IntelliJ IDEA.
 * User: Veres
 * Date: 25.04.14
 * Time: 1:52
 * To change this template use File | Settings | File Templates.
 */
public class DayoffDurationCardFactory implements CardFactory {
    private Duration duration;

    public DayoffDurationCardFactory(Duration duration) {
        this.duration = duration;
    }

    @Override
    public SkiPassCard getCard() {
        Duration parameterDuration = getDuration();
        return new DayoffDurationCard(parameterDuration);
    }

    public Duration getDuration() {
        return duration;
    }

    public void setDuration(Duration duration) {
        this.duration = duration;
    }
}
