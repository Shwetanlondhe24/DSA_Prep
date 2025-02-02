package  patterns;
import java.util.*;

public class rec_pattern{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the width and length of rec_pattern: ");
        int w = sc.nextInt(); //row
        int l = sc.nextInt(); //column

        logic(w,l);
    }
    public static void logic(int w,int l) {
        for(int i=1;i<=w;i++){                 //row
            for(int j=1;j<=l;j++){             //column
                System.out.print("* "); 
            }
            System.out.println(); 
        }

    }
}