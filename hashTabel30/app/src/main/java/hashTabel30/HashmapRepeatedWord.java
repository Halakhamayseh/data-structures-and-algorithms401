package hashTabel30;

import java.util.HashSet;
import java.util.Locale;

public class HashmapRepeatedWord {
    public String findFirstRepeatedWord(String words){
        String token[]=words.split(" ");
        HashSet<String>stringHashSet=new HashSet<String>();
        for (int i = 0; i <token.length ; i++) {
            if (stringHashSet.contains(token[i].toUpperCase())){
                return token[i];
            }
            stringHashSet.add(token[i].toUpperCase());
        }return "there is no repetition";
    }
}
