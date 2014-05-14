package main.com.epam.skipass.list;


import java.util.Date;

import main.com.epam.skipass.cards.SkiPassCard;

public class HistoryEntry {
    private Date entryDate;
    private SkiPassCard skiPassCard;
    private CheckResult checkResult;

    public SkiPassCard getSkiPassCard() {
        return skiPassCard;
    }

    public void setSkiPassCard(SkiPassCard skiPassCard) {
        this.skiPassCard = skiPassCard;
    }

    public CheckResult getCheckResult() {
        return checkResult;
    }

    public void setCheckResult(CheckResult checkResult) {
        this.checkResult = checkResult;
    }

    public Date getEntryDate() {

        return entryDate;
    }

    public void setEntryDate(Date entryDate) {
        this.entryDate = entryDate;
    }
}
