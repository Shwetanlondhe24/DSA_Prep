package solved_questions;
import java.util.*;

public class incometax {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int income=sc.nextInt();
        //int tax;
        System.out.println(calculator(income));
    }
    public static int calculator(int income){
        if (income<500000)
           return 0;
        else
            return 50;
    }
}
