package javacallingprogramme1;

/*6.	Write a program to enter any radius value of the circle and find out
the area.(Formula of Area A=PI*r*r).
 */

import java.util.Scanner;

public class Programme6 {
    public static void main(String[] args) {
        int r ;
        double PI=3.14 ,Area;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a radius value of the circle:");
        r=scanner.nextInt();
        Area=PI*r*r;
        System.out.println("area of circle:"+Area);



    }
}


