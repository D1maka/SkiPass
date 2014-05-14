package main.com.epam.skipass.list;

import main.com.epam.skipass.cards.SkiPassCard;

public class SimpleTurnstile implements Turnstile {
    @Override
    public CheckResult tryPass(SkiPassCard passCard) {
        return null;
    }
}
