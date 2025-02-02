package patterns;
import java.util.Scanner;

public class inc_tri_pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the size of pattern ");
        int n = sc.nextInt();
        logic(n);
}

    public static void logic(int n) {
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("* "); 
            }
            System.out.println(); 
        }

}
}