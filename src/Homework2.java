/*
 * @Class: Homework2
 * @author: Anjola Akinbulumo
 * @Course: ITEC 2140-04, Spring 2023
 * @written: Febuary 26, 2023
 * Description: Write a program that prompts the user for student grades,
 * calculates and displays the average grade in the class.
 * The user should enter a character to stop providing values


 */
import java.util.Scanner;


public class Homework2
{
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        double sum=0;
        int count=0;
        int marks=1;
        System.out.println("Enter the grades: ");
        while(sc.hasNextInt()){
            marks=sc.nextInt();
            sum+=marks;
            count++;
        }


        double avg=(double)((double)sum/(double)count);
        System.out.println("Average student grade is "+avg);
    }
}

