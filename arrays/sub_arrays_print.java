package arrays;
import java.util.Arrays;
public class sub_arrays_print {
    public static void main(String args[]){
        int arr[]={133,21,38,4,56,6,7,8};
        int tp =0;
        int sum_arr[]=new int [100];
        int sumIndex =0;

        for (int i=0;i<arr.length;i++){            // start
            for (int j=i;j<arr.length;j++){        // end 
                int sum =0 ;
                for (int k=i;k<=j;k++){            // start to end
                    
                    System.out.print(arr[k]+" ");

                    sum+=arr[k];

                    /* for(int a=k;a<sum_arr.length;a++){
                        sum_arr[a]=arr[k];
                    } */
                    /* tp++;   
                    ! wrong place 
                     */
                }
                tp++;
                sum_arr[sumIndex++] = sum;
                System.out.print("  -"+sum);
                System.out.println();
            }
            System.out.println();
        }

        System.out.println("total pairs: "+tp);
        /* for(int n=0;n<sum_arr.length;n++){
            System.out.print(sum_arr[n] + " ");
        } */

        for(int n=0;n<sumIndex;n++){
            System.out.print(sum_arr[n] + " ");
        }
        Arrays.sort(sum_arr, 0, sumIndex);
        // ! sum_arr[sumIndex] -> 0 because it is out of bounds
        System.out.println("the smallest element is: " + sum_arr[0]);
        System.out.println("the largest element is: " + sum_arr[sumIndex-1]);
    }
}

// *tp = n(n+1)/2