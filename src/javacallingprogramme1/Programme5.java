package javacallingprogramme1;

/*
5.	Write a program for a calculator with addition, subtraction, multiplication and division
 methods all with parameters and use string concatenation methods.(Note: Two static and Two instance methods.)
 */


import java.util.Scanner;

public class Programme5 {
    public static void main(String[] args) {
        Programme5 obj=new Programme5();
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter first number");
        int a =scanner.nextInt();
        System.out.println("Please enter second number");
        int b=scanner.nextInt();

        obj.addition(a, b);
        obj.subtraction(a ,b);
        multiplication(a ,b);
        division(a,b);

    }
    public void addition(int a,int b){
        System.out.println("Addition of two numbers is:" +(a+b));

    }
    public void subtraction(int a,int b){
        int x=a-b;
        System.out.println("subtraction:"+x);
    }

    public static void multiplication(int a, int b) {
        int i=a * b;
        System.out.println("multiplication:"+i);
    }

    public  static void division(int a,int b){
        int z= a/b;
        System.out.println("division:"+z);
    }
}
