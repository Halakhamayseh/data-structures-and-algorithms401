package hashTabel30;

public class Entry <t>{
    t key;
    t valueEntry;
    Entry next;

    public Entry(t key, t valueEntry) {
        this.key = key;
        this.valueEntry = valueEntry;
        next=null;

    }
//
//    public Entry() {
//        next=null;
//    }
//    public int getKey() {
//        return key;
//    }


    public Entry() {
    }
}
