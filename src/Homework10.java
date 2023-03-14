/*
 * @Class: Homework2
 * @author: Anjola Akinbulumo
 * @Course: ITEC 2140-04, Spring 2023
 * @written: March 9, 2023
 * Description: Write a program that creates the following pattern.
 */
public class Homework10 {
    public static void main(String args[]){
        int n = 6;
        for(int i = 0;i<n;i++){
            for(int j = 0;j<n-i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
