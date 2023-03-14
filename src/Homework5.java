/*
 * @Class: Homework2
 * @author: Anjola Akinbulumo
 * @Course: ITEC 2140-04, Spring 2023
 * @written: March 9, 2023
 * Description: Write a program that prompts the user for an integer value.
 * The program should then calculate and print the factorial of the user provided value.
 */
import java.util.Scanner;

public class Homework5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
//reading input from user
        int n=sc.nextInt();
        int fact=1,i=1;
// looping from 1 to n
// adding product to Homework5
        while(i<=n){
            fact=fact*i;
            i++;
        }

        System.out.println("Factorial of "+n+" : "+fact);
    }
}
