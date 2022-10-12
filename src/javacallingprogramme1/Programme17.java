package javacallingprogramme1;

/*
17.	Write a Java program to convert a decimal number to binary number.
	 	Input Data:
	 	 	    Input a Decimal Number : 5
	 	Expected Output
  	 	Binary number is: 101 8 */



public class Programme17 {
    public static void main(String[] args) {
        int decimal = 5;
        //cover it to binary and represnting to string

        String bin = Integer .toBinaryString(decimal);
        System.out.println(bin);
    }
}
