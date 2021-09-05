package hashTabel30;
//https://www.youtube.com/watch?v=bBKu9gJr_y0//youtubeVideo
public class HashTable<t> {
    Entry [] arryHash;
    int size;


    //implement dynamic size for hash array
    public  HashTable(int size){
        this.size=size;
        arryHash=new Entry[this.size];
        for (int i = 0; i <arryHash.length ; i++) {
            arryHash[i]=new Entry();
        }
    }

//    hash
//    Arguments: key
//    Returns: Index in the collection for that key

    public int getHash(String key){
     int keyAscii=0;
     int resultHashUsingAsciiCode=1;
        for (int i = 0; i <key.length() ; i++) {
           //System.out.println((int)key.charAt(i));
            keyAscii=keyAscii+(int) key.charAt(i);
//           System.out.println(keyAscii);
              // % this.size to be in same array length
        } resultHashUsingAsciiCode=(resultHashUsingAsciiCode*109) % this.size;
       // System.out.println(resultHashUsingAsciiCode);
        return resultHashUsingAsciiCode;
    }
    //get
    //Arguments: key
    //Returns: Value associated with that key in the table


    public String get(String key){
        int index=getHash(key);
        String value=null;
        Entry arrayValue=arryHash[index];
        while (arrayValue!=null){
            if (arrayValue.key==key){
                value= (String) arrayValue.valueEntry;
                break;
            }
            arrayValue=arrayValue.next;
        }return value;


    }
    //add
    //Arguments: key, value
    //Returns: nothing
    //This method should hash the key, and add the key and value pair to the table, handling collisions as needed.


    public void add(String key,String value){
//        if (arryHash[getHash(key)]==null){
//            arryHash[getHash(key)]=new Entry(key,value);
//        }else {
//            Entry newItem=new Entry(key,value);
//            arryHash[getHash(key)].next=newItem;
//        }
        int index=getHash(key);
        Entry arrayValue=arryHash[index];
        Entry newItem=new Entry(key,value);
        newItem.next=arrayValue.next;
        arrayValue.next=newItem;
    }
//contains
//Arguments: key
//Returns: Boolean, indicating if the key exists in the table already.

    public boolean contain(String key) {
//        int index = getHash(key);
//        Entry arrayValue = arryHash[index];
//        while (arrayValue != null) {
//            if (arrayValue.key == key) {
//                return true;
//
//            }
//        }return false;
        return get(key)!=null;
  }

   }

