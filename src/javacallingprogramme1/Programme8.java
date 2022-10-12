package javacallingprogramme1;

/*8.	Write a program to calculate the area of a triangle. */

import java.util.Scanner;

public class Programme8 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the height of a triangle:");
        int t =scanner.nextInt();
        System.out.println("Enter the base of a triangle");
        int b=scanner.nextInt();
        float a = ((t*b)/2);
        System.out.println(a+"Area of a triangle :" );
    }
}