package javacallingprogramme1;

/*7.	Write a program to insert any temperature value in degree
Fahrenheit and convert to degree Celsius ((F − 32) × 5/9 = 0°C).
 */

import java.util.Scanner;

public class Programme7 {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a temperature value in fahrenheit:");
        double f=scanner.nextDouble();
        double c=(((f-32)*5)/9);
        System.out.println(c +"Degree celsius:" );


    }
}