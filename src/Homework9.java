/*
 * @Class: Homework2
 * @author: Anjola Akinbulumo
 * @Course: ITEC 2140-04, Spring 2023
 * @written: March 9, 2023
 * Description: Write a program that prompts the user for a String value and a character value.
 * The program should then find the last occurrence of the provided character in the provided
 *  String and display the corresponding index.
 * If the character is not found in the String, display -1.

 */
import java.util.Scanner;

public class Homework9
{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter String: ");
        String s = sc.nextLine();

        System.out.print("Enter character: ");
        char ch = sc.next().charAt(0);

        int last=-1;

        for(int i=0; i<s.length(); i++)
        {
            if(s.charAt(i)==ch)
                last = i;
        }


        System.out.println(last);
    }
}