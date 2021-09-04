package code28Sort;

public class QuickSort {


    //ALGORITHM QuickSort(arr, left, right)
//    if left < right
//        // Partition the array by setting the position of the pivot value
//        DEFINE position <-- Partition(arr, left, right)
//        // Sort the left
//        QuickSort(arr, left, position - 1)
//        // Sort the right
//        QuickSort(arr, position + 1, right)


    public int[] quickSortFunction(int[]arr,int left,int right){
        if (left<right){
            int position= partitionFunction(arr,left,right);
            quickSortFunction(arr,left,position-1);
            quickSortFunction(arr,position+1,right);
        }return arr;

    }


    //ALGORITHM Partition(arr, left, right)
//    // set a pivot value as a point of reference
//    DEFINE pivot <-- arr[right]
//    // create a variable to track the largest index of numbers lower than the defined pivot
//    DEFINE low <-- left - 1
//    for i <- left to right do
//        if arr[i] <= pivot
//            low++
//            Swap(arr, i, low)
//
//     // place the value of the pivot location in the middle.
//     // all numbers smaller than the pivot are on the left, larger on the right.
//     Swap(arr, right, low + 1)
//    // return the pivot index point
//     return low + 1

    public int partitionFunction(int[]arr,int left,int right){
     int pivot=arr[right];
     int low=left-1;
        for (int i = left; i <right ; i++) {
            if (arr[i]<=pivot){
                low++;
                swapFunction(arr,i,low);
            }
        }
        swapFunction(arr,right,low+1);
        return low+1;

    }

    //ALGORITHM Swap(arr, i, low)
//    DEFINE temp;
//    temp <-- arr[i]
//    arr[i] <-- arr[low]
//    arr[low] <-- temp

    public void swapFunction(int[]arr,int i,int low){
        int temp=arr[i];
        arr[i]=arr[low];
        arr[low]=temp;

    }
}
