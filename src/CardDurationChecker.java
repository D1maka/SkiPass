import java.util.Calendar;

public class CardDurationChecker implements IChecker {
	IChecker parent;

	public CardDurationChecker(IChecker parentChecker) {
		parent = parentChecker;
	}

	@Override
	public boolean isCardValid(SkiPassCard card) {
		if (parent.isCardValid(card)) {
			
		}
	}
}
