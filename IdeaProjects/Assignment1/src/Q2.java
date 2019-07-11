package Assignment1;

import java.util.Scanner;
/*Write a program which accepts an integer number as input from the user and perform the
following conditional checks:
a. Print Tom if number is odd and exists between 20 to 30
b. Print Jerry, if number is even and exists between 20 and 30*/

public class Q2
{
    public static void main(String[] args) {
        int num;
        Scanner input= new Scanner(System.in);
        System.out.println("enter any number");
        num=input.nextInt();
        if (num%2 !=0 && num>20 && num<30)
        {
            System.out.println("Tom");
        }
        else if (num%2 ==0 && num>20 && num<30)
        {
            System.out.println("Jerry");
        }
    }
}
