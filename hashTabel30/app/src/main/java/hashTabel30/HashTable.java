package hashTabel30;

public class HashTable {
    Entry [] arryHash;
    int size;
    //implement dynamic size for hash array
    public void hashTableArray(int size){
        this.size=size;
        arryHash=new Entry[size];

    }
}
