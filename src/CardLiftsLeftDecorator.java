import cards.SkiPassCard;

public class CardLiftsLeftDecorator implements IChecker {
	private IChecker parent;

	public CardLiftsLeftDecorator(IChecker parentChecker) {
		parent = parentChecker;
	}

	@Override
	public boolean isCardValid(SkiPassCard card) {
		
			return false;
	
	}
}
