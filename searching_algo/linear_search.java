package searching_algo; // should be written before import or else error
import java.util.*;

/* Array Syntax

-> Method 1:
int arr[];  // declare array or int[] arr;
arr=new int [5]; // initialize array or allocating memory

-> NOTE:  int arr[10]; //syntax error

-> Method 2:
int[] arr = new int[5]; // declare and initialize array in one line

-> Method 3:
int[] arr = {1, 2, 3, 4, 5}; // if elements are known */

public class linear_search {
    public static void main(String[] args) {
        int arr[]={22,34,55,67,11,9};
        System.out.println(arr.length);

        Scanner sc= new Scanner(System.in);
        System.out.print("enter the element to search: ");
        int target=sc.nextInt();

        boolean found=false;
        for(int i=0; i<arr.length;i++){
            if(target==arr[i]){  // opp works too
                System.out.println("Element is found at index: "+i);
                found=true;
                break;
            }
        }

        if (!found){
            System.out.println("Element is not found");
        }
        
    }
}
