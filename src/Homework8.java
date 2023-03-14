/*
 * @Class: Homework2
 * @author: Anjola Akinbulumo
 * @Course: ITEC 2140-04, Spring 2023
 * @written: March 9, 2023
 * Description: Write a program that accepts a String value from the user and displays the reverse of that value.
 */
import java.util.Scanner;
public class Homework8
{
    public static void main (String args[])
    {
        String initial, rev = "";
        Scanner in = new Scanner (System.in);
        System.out.println ("Enter the string to write backwards: " + "");
        initial = in.nextLine ();
        int length = initial.length ();
        for (int i = length - 1; i >= 0; i--)
            rev = rev + initial.charAt (i);
        System.out.println ("Reversed string: " + rev);
        System.out.println(initial.equals(rev));
}
}