/*
 * @Class: Homework2
 * @author: Anjola Akinbulumo
 * @Course: ITEC 2140-04, Spring 2023
 * @written: March 9, 2023
 * Description: Write a program that accepts an integer
 * from the user and displays the sum of the digits of the provided integer.
 */
import java.util.Scanner;

public class Homework6

{

    public static int SumOfDigits(int val) {

        int sum = 0;

        while (val != 0) {

            sum = sum + val % 10;

            val = val / 10;

        }

        return sum;

    }

    public static void main(String args[])

    {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter a number: ");

        int n = in.nextInt();

        System.out.println("\nThe Sum of the digits is: " + SumOfDigits(n));

    }

}

