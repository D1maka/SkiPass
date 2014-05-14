package main.com.epam.skipass.list;

import main.com.epam.skipass.cards.SkiPassCard;

public interface Turnstile {
    public CheckResult tryPass(SkiPassCard passCard);
}
