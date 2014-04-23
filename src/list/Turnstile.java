package list;

import cards.SkiPassCard;

public interface Turnstile {
    public CheckResult tryPass(SkiPassCard passCard);
}
