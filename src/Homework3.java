/*
 * @Class: Homework2
 * @author: Anjola Akinbulumo
 * @Course: ITEC 2140-04, Spring 2023
 * @written:  March 9, 2023
 * Description: Write a program that prompts the user for student
 * grades and displays the highest and lowest grades in the class.
 * The user should enter a character to stop providing values.
 */
import java.util.Scanner;

public class Homework3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double min = 1000, max = -1;
        double grade;

        System.out.println("Enter as many student grades as you like. Enter a character to stop.");

        while (true) {
            try {
                grade = sc.nextDouble();
            } catch (Exception e) {

                break;
            }

            if (grade < min)
                min = grade;

            if (grade > max)
                max = grade;
        }

        System.out.println("The highest grade is: " + max);
        System.out.println("The lowest grade is: " + min);

    }
}