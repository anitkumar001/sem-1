// Write a java program to exchange the values of two variables of integer type X and Y using
// third temporary variable Z


public class Q7 {

    public static void main(String[] args) {

        int x = 3;
        int y = 5;
        int z;

        System.out.println("Before swapping Value of x :" +x);
        System.out.println("Before swapping Value of y: "+y);

        z=x;
        x=y;
        y=z;

        ;
        System.out.println("After swapping Value of x :" +x);
        System.out.println("After swapping Value of y: "+y);

    }

}