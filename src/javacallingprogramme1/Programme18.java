package javacallingprogramme1;

/*18.	Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers.
        Test Data:
        Input first number: 125 Input second number: 24 Expected Output :
        125 + 24 = 149
        125 - 24 = 101
        125 x 24 = 3000
        125 / 24 = 5
        125 mod 24 = 5 */


import java.util.Scanner;

public class Programme18 {

    public static void main(String[] args) {
        Programme18 obj=new Programme18();
        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter first number");
        int a =scanner.nextInt();
        System.out.println("Please enter second number");
        int b=scanner.nextInt();

        obj.addition(a, b);
        obj.subtraction(a ,b);
        multiplication(a ,b);
        division(a,b);
        Programme18.mod(a,b);


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
    public static void mod(int a,int b){
        int p=a%b;
        System.out.println("mod" + p);
    }
}
