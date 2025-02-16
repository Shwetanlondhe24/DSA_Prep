package arrays;

public class printing_empty_array {
    public static void main(String args[]){
        int int_arr []=new int[5];
        System.out.print("empty int array contains: ");
        for (int i =0; i<int_arr.length;i++){
            System.out.print(int_arr[i] + " ");

        }

        char ch_arr []=new char[5];
        System.out.print("\nempty char array contains: ");
        for (int i =0; i<ch_arr.length;i++){
            System.out.print(ch_arr[i] + " ");
        }

        float f_arr []=new float[5];
        System.out.print("\nempty float array contains: ");
        for (int i =0; i<f_arr.length;i++){
            System.out.print(f_arr[i] + " ");
        }
    }
}
