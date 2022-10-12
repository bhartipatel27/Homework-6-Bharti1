package javacallingprogramme1;

/*14.	Write a Java program to print the area and perimeter of a rectangle.
	 	Test Data:
	 	 	Width = 5.5 Height = 8.5
    Expected Output:
	 	Area is 5.6 * 8.5 = 47.60
	 	Perimeter is 2 * (5.6 + 8.5) = 28.20 */


import java.util.Scanner;

public class Programme14 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter width and height:");
        double a=s.nextDouble();
        double b=s.nextDouble();
        double d=(a*b);
        System.out.println(" width  and heigh is:"+d);
        double p=2*(a+b);
        System.out.println("perimeter is:"+p);

    }
}
