/*
* @Class: PrimeNumber
* @author: Anjola Akinbulumo
* @Course: ITEC 2140-04, Spring 2023
* @written: Febuary 26, 2023
* Description: Write a program that prompts the user for
an integer and displays if the provided integer is a prime
* number or not. A prime number is a number that is divisible
* only by 1 and itself. First few prime numbers are 2,3,5,7,11,13 and so on. Sample run is shown below
*/
import java.util.Scanner;
public class PrimeNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = in.nextInt();
        boolean isPrime = num > 1;


        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                isPrime = false;
            }
        }
        if (isPrime) {
            System.out.println(num + " is a prime number!");
        }
        else {
            System.out.println(num + " is not a prime number!");
        }


    }
}
