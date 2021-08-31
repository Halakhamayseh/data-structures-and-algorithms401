package sort;

import java.util.ArrayList;
import java.util.Arrays;

public class MergeSort {

    //Pseudo Code
    //
    //ALGORITHM Mergesort(arr)
    //    DECLARE n <-- arr.length
    //
    //    if n > 1
    //      DECLARE mid <-- n/2
    //      DECLARE left <-- arr[0...mid]
    //      DECLARE right <-- arr[mid...n]
    //      // sort the left side
    //      Mergesort(left)
    //      // sort the right side
    //      Mergesort(right)
    //      // merge the sorted left and right sides together
    //      Merge(left, right, arr)
    //
    //ALGORITHM Merge(left, right, arr)
    //    DECLARE i <-- 0
    //    DECLARE j <-- 0
    //    DECLARE k <-- 0
    //
    //    while i < left.length && j < right.length
    //        if left[i] <= right[j]
    //            arr[k] <-- left[i]
    //            i <-- i + 1
    //        else
    //            arr[k] <-- right[j]
    //            j <-- j + 1
    //
    //        k <-- k + 1
    //
    //    if i = left.length
    //       set remaining entries in arr to remaining values in right
    //    else
    //       set remaining entries in arr to remaining values in left
    public int[] mergeSort(int[]arr){

        int n=arr.length;
//      int[] mergeSorted= new int[n];
        if (n>1){
            int mid=n/2;
            //https://www.codegrepper.com/code-examples/java/split+array+in+java//from this url know how split array by using Arrays.copyOfRange
            int []leftPart= Arrays.copyOfRange(arr,0,mid);
            int []rightPart= Arrays.copyOfRange(arr,mid,arr.length);
            //{1,2,3,4}
            mergeSort(leftPart);
            mergeSort(rightPart);
            merge(leftPart, rightPart, arr);

        }return arr;

    }

    public int[] merge(int[]left,int[]right,int[]arr) {
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                arr[k] = left[i];
                i = i + 1;
                System.out.println(i);
            } else {
                arr[k] = right[j];
                j = j + 1;

            }
            k = k + 1;

        }
        if (i == left.length) {
            System.out.println(i);
            //left part empty
            //       set remaining entries in arr to remaining values in right
            for (int l = j; l < right.length; l++) {

                arr[k] = right[l];
                k++;

            }
//            while (j< right.length){
//                arr[k] = right[j];
//             k++;
//             j++;
//
//            }

        }
           else{
               //right is empty
        //       set remaining entries in arr to remaining values in left
            for (int r = i; r < left.length; r++) {
                arr[k] = left[r];
                k++;

            }
//            while (i< left.length){
//                arr[k] = left[i];
//                k++;
//                i++;
//
//            }
    }return arr;
    }
}
