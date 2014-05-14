package main.com.epam.skipass.list;

public class SimplePassHistory implements PassHistory {

    private MyLinkedList<HistoryEntry> entries;

    public SimplePassHistory() {
        entries = new MyLinkedList<HistoryEntry>();
    }

    @Override
    public void addHistoryEntry(HistoryEntry entry) {
        entries.add(entry);
    }
}
