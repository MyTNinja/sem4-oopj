/*
Write a Java program to reverse the number entered by the user. 
*/

import java.util.*;


public class NumRev{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number: ");
        int num = sc.nextInt();
        
        int n = num;
        int rem, rev = 0;

        while(num>0){
            rem = num % 10;
            rev = rev*10 + rem;
            num = num / 10;
        }
        System.out.println("Reverse of " + n + " is: " + rev);
    }
}