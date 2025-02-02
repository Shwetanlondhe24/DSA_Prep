package patterns;
import java.util.*;

public class sq_pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the size of square pattern ");
        int n = sc.nextInt();
        //String result = logic(n);
        logic(n);
    }

    public static void logic(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                System.out.print("* "); //print a whole row 
            }
            System.out.println(); //takes to new row
        }

    }
}

/* String result = logic(n); // Store the result in the 'result' string
System.out.println(result); // Print the result in main function
}

// This method builds and returns the square pattern as a string
public static String logic(int n) {
String result = ""; // Initialize an empty string to store the pattern
for (int i = 1; i <= n; i++) {
    for (int j = 1; j <= n; j++) {
        result += "* "; // Concatenate the star to the result string
    }
    result += "\n"; // Add a newline after each row
}
return result; // Return the complete pattern
}
} */