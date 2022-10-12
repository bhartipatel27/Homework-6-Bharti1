package javacallingprogramme1;

/*13.	Write a Java program that takes three numbers as input to calculate and print the average of the numbers.
 */

import java.util.Scanner;

public class Programme13 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the three numbers :");
        int a =scanner.nextInt();
        int b= scanner.nextInt();
        int c= scanner.nextInt();
        float d=((a+b+c)/3);
        System.out.println("Average value is :"+d);


    }
}
