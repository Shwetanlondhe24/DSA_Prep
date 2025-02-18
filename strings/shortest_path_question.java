package strings;
//import java.util.*;

public class shortest_path_question {
    public static void main(String args[]){
        String str ="WNEENESENNN";
        int x=0;
        int y=0;
        char ch;
        for(int i=0;i<str.length();i++){
            ch = str.charAt(i);
            if(ch=='E'){
                x++;
            }
            else if(ch=='W'){
                x--;
            }
            else if(ch=='N'){
                y++;
            }
            else{
                y--;
            }
        }

        /* 
        !int z = x^2+y^2;
        !int a = 2^2;
        ? Why above does not work?

        *In Java, the ^ operator is not used for exponentiation; 
        *instead, it is a bitwise XOR operator. 
        *Therefore, using ^0.5 to calculate the square root will not work as intended.
         */

        /*
        int a = 3^5;
        System.err.println(a); 
        ! ans = 6
        */

        double z = Math.pow(x,2) + Math.pow(y,2);
        double ans = Math.sqrt(z);
        System.out.println("The shortest path is: " + ans);

    }
}
