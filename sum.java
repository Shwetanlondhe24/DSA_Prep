/* problem - calculate sum using inputs from user 
solution: 
-basic template or boilerplate code
-take input in a and b
-calculate sum of a and b
-print the result */

import java.util.*;

public class sum{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = a+b;
        System.out.println("The sum is "+sum);
        //System.out.print(sum);

        int x = sc.nextInt();
        int y = sc.nextInt();
        int product = x*y;
        System.out.println("The product is"+product);
    }
}

