import java.util.*;
public class areaofCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of the circle");
/*       float r = sc.nextFloat();
        float area = 3.14*r*r; 
        float a = 3.14;
        float r = sc.nextFloat();
        float area = a*r*r;
        System.out.println("The area of the circle is " + area);

        error: incompatible types: possible ***lossy conversion*** from double to float
        float a = 3.14; 
        
        reason- because when we use decimal number in java, java consider it double by default!
        */

        int r = sc.nextInt();
        float area = 3.14f*r*r;
        System.out.println("The area of the circle is " + area);
    }
}
