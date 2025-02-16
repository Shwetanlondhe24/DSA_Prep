package arrays;

// Method 1: Simple Linear Search
public class largest_element_in_array {
    public static void main(String args[]){
        int arr[]={111,22,33,44,6,99,1};
        int largest=arr[0];

        for (int i=0;i<arr.length;i++){
            if(arr[i]>=largest){
                largest =arr[i];
            }
        }

        System.out.println("the largest element is: " + largest);
    }
}

// Or using built in method - both same

/* import java.util.Arrays;

public class LargestElementStream {
    public static void main(String args[]) {
        int arr[] = {111, 22, 33, 44, 6, 99, 1};
        !int max = Arrays.stream(arr).max().getAsInt();
        System.out.println("The largest element is: " + max);
    }
} */

// *time complexity for all cases = O(n)
// *space complexity = O(1)



/* Method 2: Sorting and then printing

import java.util.Arrays;

public class LargestElementSorting {
    public static void main(String args[]) {
        int arr[] = {111, 22, 33, 44, 6, 99, 1};
        !Arrays.sort(arr);
        System.out.println("The largest element is: " + arr[arr.length - 1]);
    }
        ? Why this method is not efficient? -> Screenshot
} */

// *time complexity for all cases = O(nlogn)
// *space complexity = O(1)