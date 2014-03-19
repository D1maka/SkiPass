public class CardLiftsLeftDecorator implements IChecker {
	private IChecker parent;

	public CardLiftsLeftDecorator(IChecker parentChecker) {
		parent = parentChecker;
	}

	@Override
	public boolean isCardValid(SkiPassCard card) {
		if (parent.isCardValid(card)) {
			if (card.getLiftsLeft() == 0) {
				return false;
			} else {
				return true;
			}
		} else {
			return false;
		}
	}
}
