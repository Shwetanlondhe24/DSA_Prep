/* package arrays;

* only for printing!!
public class reverse_array {
    public static void main(String args[]){
        int arr[]={1,2,3,4,5,6};
        System.out.print("reverse of given array is: ");
        for (int i=arr.length-1;i>=0;i--){
            System.out.print(arr[i]+" ");
        }
    }
} */


package arrays;

// * when you want to modify!!
public class reverse_array {
    public static void main(String args[]){
        int arr[]={1,2,3,4,5,6};
        int first = 0;
        int last = arr.length-1;
        int temp;

        //runs n/2 times
        while (first<last){
             temp = arr[first];
             arr[first]=arr[last];
             arr[last]=temp;

             first++;
             last--;
        }

        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}



/* 
?Which One is More Efficient? 
both has same time and space complexity
! If only printing is needed: 
The first approach is sufficient and avoids unnecessary swaps.
! If actual reversal is needed: 
The second approach is better because it reverses the array in-place without using additional storage.
! Thus, in terms of general utility and real-world applications, 
the second approach is more efficient when reversal is needed. 
*/
