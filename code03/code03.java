/**
 * code03
 */

import java.util.*;
public class code03 {
    public static void main(String[] args) {
        int[] Array = new int[] { 1, 2, 3 };
        System.out.println(BinarySearch(Array, 2));
    }
public static int BinarySearch(int [] sortedArray,int number) {
    Set<Integer> keyArray = new HashSet<Integer>();
    int numindex = 0;
    for (int i = 0; i < sortedArray.length; i++) {
        keyArray.add(sortedArray[i]);
        int minVaule = Collections.min(keyArray);
        int maxVaule = Collections.max(keyArray);
        for (number= minVaule; number < maxVaule; number++) {
            if (keyArray.contains(number)) {
                numindex = sortedArray[number - 1];
                System.out.println(numindex);
            }
        }
    }
    return -1;
}
}
