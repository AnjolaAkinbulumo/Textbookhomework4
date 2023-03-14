/*
 * @Class: Homework2
 * @author: Anjola Akinbulumo
 * @Course: ITEC 2140-04, Spring 2023
 * @written: March 9, 2023
 * Description: Write a program that prints the first 30 values in the Fibonacci series.
 * A Fibonacci series begins with 0 and 1. The next number is then found by adding the previous two numbers.
 * Write a program that prints the first 30 values in the Fibonacci series. A Fibonacci series begins with 0 and 1.
 * The next number is then found by adding the previous two numbers.
 */
public class Homework4 {

    public static void main(String[] args) {
        int num1 = 0;
        int num2 = 1;

        int n = 30;

        for (int i = 1; i <= n; ++i) {

            System.out.print(num1);
            if (i < n) {
                System.out.print(",");
            }

            int nextNum = num1 + num2;
            num1 = num2;
            num2 = nextNum;
        }
    }

}