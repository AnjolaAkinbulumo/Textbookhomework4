/*
 * @Class: Homework2
 * @author: Anjola Akinbulumo
 * @Course: ITEC 2140-04, Spring 2023
 * @written: March 9, 2023
 * Description: Write a program that prompts the user for two String values.
 * The program should then display if string 1 is greater in length than string 2.
 * The program should also display if string 1 appears after string 2 in the lexicographic order or vice versa or if they are the same.
 *  Lastly, the program should display a sentence created by combining both the string values.
 */
import java.util.Scanner;
public class Homework7 {
    public static void method1(String s1, String s2) {
        if(s1.length() > s2.length()) {
            System.out.println(s1 + " has greater length than " + s2);
        } else {
            System.out.println(s1 + " does not have greater length than " + s2);
        }
    }

    public static void method2(String s1, String s2) {
        if (s1.compareTo(s2) < 0) {
            System.out.println(s1 + " comes before " + s2);
        } else if (s1.compareTo(s2) == 0) {
            System.out.println(s1 + " is equal to " + s2);
        } else {
            System.out.println(s1 + " comes after " + s2);
        }
    }

    public static void method3(String s1, String s2) {
        System.out.println(s1 + " " + s2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1, s2;
        System.out.println("Enter the first string: ");
        s1 = sc.nextLine();
        System.out.println("Enter the second string: ");
        s2 = sc.nextLine();
        method1(s1, s2);
        method2(s1, s2);
        method3(s1, s2);
    }
}