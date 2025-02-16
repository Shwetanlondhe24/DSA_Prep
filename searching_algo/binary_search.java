package searching_algo;
import java.util.*;

public class binary_search {
    public static void main (String args[]){
        System.out.println("\nThis is a binary search program\n");

        int arr[]= {11,22,56,41,4,2,6,23};
        Arrays.sort(arr);
        System.out.println("The given array is as follows\n");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

        Scanner sc=new Scanner(System.in);
        System.out.print("\nEnter the number you want to search: ");
        int target = sc.nextInt();

        
        int start =0;
        int end = arr.length-1;
      
        boolean found=false;
        while(start<=end){
           
            int middle = (start+end)/2;  // !initialise inside loop
            
            if (arr[middle]==target){
                System.out.println("The element is found at index: "+middle);
                found=true;
                break;
            }

            

            if(arr[middle]>target){
                end = middle-1;
            }

            else{                       // ! used else
                start = middle+1;
            }
            
        } 

        if (found==false){
            System.out.println("The element is not found");
        }
    }
}
 

/* 
*logic - binary means two. 
*We have array. We need to sort it. We define start and end. 
*Then we calculate the middle. 
*If middle < target we search left. Otherwise we search right. */ 


/* package searching_algo;
import java.util.*;

public class binary_search {
    public static void main (String args[]){
        System.out.println("\nThis is a binary search program\n");

        int arr[]= {11,22,56,41,4,2,6,23};
        Arrays.sort(arr);
        System.out.println("The given array is as follows\n");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

        Scanner sc=new Scanner(System.in);
        System.out.print("\nEnter the number you want to search: ");
        int target = sc.nextInt();

        // we initialise like this because we want to point to valid index
        int start =0;
        int end = arr.length-1;
        int middle = (start+end)/2;
        //float middle = (start+end)/2;  same result as above since In Java, when you divide two integers (int values), the result is always an integer. The decimal part is truncated (not rounded).
        //System.out.println("The middle of array is: "+middle);
        
        boolean found=false;
        while(start<=end){
            if (arr[middle]==target){
                System.out.println("The element is found at index: "+middle);
                found=true;
                break;
            }

            middle = (start+end)/2;

            if(arr[middle]>target){
                end = middle-1;
            }

            if(arr[middle]<target){
                start = middle+1;
            }
            
        } 

        if (found==false){
            System.out.println("The element is not found");
        }
    }
} */

/* OPTIMISED STANDARD CODE*/ 