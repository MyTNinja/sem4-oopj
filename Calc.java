/*
Write a Java program to perform basic calculator operations. 
*/

import java.util.*;


public class Calc{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        double num;
        double total = 0.0;
        char op;
        
        System.out.println("-----Calculator-----");
        System.out.println("\nCan perform: \n+ Addition \n- Subtraction \n* Multiplication \n/ Division");
        System.out.println("Enter 'c' to clear, '=' to view total (exit).");

        System.out.print("\n---Start--- \n" + total + " ");
        do{
            op = sc.next().charAt(0);
            switch(op){
                case '+':
                    num = sc.nextDouble();
                    total += num;
                    System.out.print(total + " ");
                    break;

                case '-':
                    num = sc.nextDouble();
                    total -= num;
                    System.out.print(total + " ");
                    break;

                case '*':
                    num = sc.nextDouble();
                    total *= num;
                    System.out.print(total + " ");
                    break;

                case '/':
                    num = sc.nextDouble();
                    if(num==0){
                        System.out.println("Error: division by 0");
                        System.out.print(total + " ");
                        break;
                    }
                    total /= num;
                    System.out.print(total + " ");
                    break;

                case 'c':
                    total = 0.0;
                    System.out.print(total + " ");
                    break;

                case '=':
                    System.out.print("\n---End--- \n" + total + " ");
                    break;

                default:
                    System.out.println("Unexpected value: " + op);
                    break;
            }
        }while(op!='=');
    }
}