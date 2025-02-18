package strings;

//Method 1
public class check_if_str_palindrome {
    public static void main(String args[]){
        String str = "madam";
        String check_str="";
        for(int i=str.length()-1;i>=0;i--){
            check_str+=str.charAt(i);
        }

        /* 
        !if(check_str==str) 
        *Type: String is an object (reference type).
        *Behavior: When you use == to compare two String objects, it checks for reference equality. 
        *This means it checks whether both references point to the same object in memory, 
        *not whether the contents of the strings are the same.
        */


        if(check_str.equals(str))
        {
            System.out.println("the given string is palindrome string");
        }
        else{
            System.out.println("the given string is not a palindrome string");
        }


        System.out.println(str);
        System.out.println(check_str);
    }
}

/* 
? Method 2

public static boolean isPalindrome(String str) {
    !for (int i = 0; i < str.length() / 2; i++) {
        !if (str.charAt(i) != str.charAt(n - 1 - i)) {
            return false; // not a palindrome
        }
    }
    return true; // it is a palindrome
}

 */