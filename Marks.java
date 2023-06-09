/*
Consider the scenario of processing marks of a student John for a course as part of a student management system. 
The assumption is that John takes exams in five different subjects. 
Find the total marks and average marks scored by John. 
*/

import java.util.*;


public class Marks{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        double marks;
        double sum = 0.0;
        System.out.println("----Enter Marks-----");
        for(int i = 0; i<5; i++){
            System.out.print("Enter marks for subject_" + (i+1) + ": ");
            marks = sc.nextDouble();
            sum = sum + marks;
        }

        System.out.println("Total: " + sum);
        System.out.println("Average: " + (sum/5.0));
    }
}