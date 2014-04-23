package list;

/**
 * Created with IntelliJ IDEA.
 * User: Veres
 * Date: 23.04.14
 * Time: 11:03
 * To change this template use File | Settings | File Templates.
 */
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
