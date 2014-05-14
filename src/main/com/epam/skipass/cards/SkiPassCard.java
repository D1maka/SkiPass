package main.com.epam.skipass.cards;

import main.com.epam.skipass.enums.CardType;

public abstract class SkiPassCard {
	public static long nextId = 1;

	private long id;
	private CardType type;
	private boolean blocked;

	public SkiPassCard(CardType type) {
		id = nextId++;
		this.type = type;
		this.blocked = false;
	}

	public long getId() {
		return id;
	}

	public CardType getType() {
		return type;
	}

	public void setType(CardType type) {
		this.type = type;
	}

	public boolean isBlocked() {
		return blocked;
	}

	public void setBlocked(boolean blocked) {
		this.blocked = blocked;
	}

    protected CardCheckResult check() {
        if (isBlocked()) {
            return CardCheckResult.BLOCKED;
        } else {
            return CardCheckResult.OK;
        }
    }
}
