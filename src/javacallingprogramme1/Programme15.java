package javacallingprogramme1;

/*15.	Write a Java program to swap two variables.
 *  x=a
 *   a=b
 *  b=x  */

import java.util.Scanner;

public class Programme15 {
    public static void main(String[] args) {
        Scanner sw = new Scanner(System.in);
        System.out.println("Enter first number a:");
        int a = sw.nextInt();
        System.out.println("Enter second number b:");
        int b = sw.nextInt();
        int x;
        x = a;
        a = b;
        b = x;
        System.out.println("Swapped values are:" + " a:" + a + "b:" + b);


    }
}