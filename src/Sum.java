/*
 * @Class: Sum
 * @author: Anjola Akinbulumo
 * @Course: ITEC 2140-04, Spring 2023
 * @written: Febuary 26, 2023
 * Description: Write a program that accepts an integer from the user and displays
 * the sum of the digits of the provided integer.
 */
import java.util.Scanner;


public class Sum {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int n = in.nextInt();


        int s = 0;
        for (s = 0; n > 0; n = n / 10) {

            s = s + n % 10;
        }
        System.out.println("Sum  is " + s);


    }
}

