package main.com.epam.skipass.factories;

import main.com.epam.skipass.cards.SeasonCard;
import main.com.epam.skipass.cards.SkiPassCard;

/**
 * Created with IntelliJ IDEA.
 * User: Veres
 * Date: 25.04.14
 * Time: 1:47
 * To change this template use File | Settings | File Templates.
 */
public class SeasonCardFactory implements CardFactory {
    @Override
    public SkiPassCard getCard() {
        return new SeasonCard();
    }
}
