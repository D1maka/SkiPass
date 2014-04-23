package list;

import cards.SkiPassCard;

public class SimpleTurnstile implements Turnstile {
    @Override
    public CheckResult tryPass(SkiPassCard passCard) {
        return null;
    }
}
