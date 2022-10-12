package javacallingprogramme1;

/*10.	Write a Java program that takes a number as input and prints its multiplication table up to 10.
Test Data: Input a number: 8 Expected Output :
	 	8 x 1 = 8
	 	8 x 2 = 16
 	8 x 3 = 24  	...
	 	8 x 10 = 80 */


import java.util.Scanner;

public class Programme10 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter any number :");
        int t =scanner.nextInt();
        int a=t*1;
        System.out.println(t+ "*1="+a);
        int b=t*2;
        System.out.println(t+ "*2="+b);
        int c=t*3;
        System.out.println(t+ "*3="+c);
        int d=t*4;
        System.out.println(t+ "*4="+d);
        int e=t*5;
        System.out.println(t+ "*5="+e);
        int f=t*6;
        System.out.println(t+ "*6="+f);
        int g=t*7;
        System.out.println(t+ "*7="+g);
        int h=t*8;
        System.out.println(t+ "*8="+h);
        int i=t*9;
        System.out.println(t+ "*9="+i);
        int j=t*10;
        System.out.println(t+ "*10="+j);



    }
}
