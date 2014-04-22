import java.util.Calendar;

import cards.SkiPassCard;

public class CardDurationChecker implements IChecker {
	IChecker parent;

	public CardDurationChecker(IChecker parentChecker) {
		parent = parentChecker;
	}

	@Override
	public boolean isCardValid(SkiPassCard card) {
		if (parent.isCardValid(card)) {
			return false;
		}
		return false;
	}
}
