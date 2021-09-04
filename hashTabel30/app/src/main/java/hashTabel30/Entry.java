package hashTabel30;

public class Entry {
    int key;
    String valueEntry;
    Entry next;

    public Entry(int key, String valueEntry) {
        this.key = key;
        this.valueEntry = valueEntry;
        next=null;
    }

    public Entry() {
        next=null;
    }

}
