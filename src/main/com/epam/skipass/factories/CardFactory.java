package main.com.epam.skipass.factories;

import main.com.epam.skipass.cards.SkiPassCard;

/**
 * Created with IntelliJ IDEA.
 * User: Veres
 * Date: 25.04.14
 * Time: 1:46
 * To change this template use File | Settings | File Templates.
 */
public interface CardFactory {
    public SkiPassCard getCard();
}
