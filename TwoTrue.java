/*
Write a Java program to check if two of three Boolean variables are true. 
*/

import java.util.*;


public class TwoTrue{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter 3 truth values (true or false): ");
        boolean t1, t2, t3;
        t1 = sc.nextBoolean();
        t2 = sc.nextBoolean();
        t3 = sc.nextBoolean();
        
        boolean two = t1?t2||t3:t2&&t3;
        
        if(two) System.out.println("Two values are true");
        else System.out.println("One or all values are true");
    }
}