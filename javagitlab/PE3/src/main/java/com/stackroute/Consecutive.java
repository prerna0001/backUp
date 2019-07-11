/*Write a program to find out if a series of 7 digits are consecutive numbers. To make this easier,
assume the digits are a string and use split()
Input: 98,96,95,94,93
Output: 98,96,95,94,93 non consecutive numbers
Input: 54,53,52,51,50,49,48
Output : 54,53,52,51,50,49,48 are consecutive numbers
Input: 1,2,3,4,5,6,6
Output: 1,2,3,4,5,6,6 non consecutive numbers*/

package com.stackroute;

import java.util.Scanner;

public class Consecutive {
    int num[];
    Scanner input=new Scanner(System.in);

    public void isConsecutive()
    {
        num=new int[8];

        for (int i=1;i<=7;i++){

            System.out.println("enter number "+(i)+": ");
            num[i]=input.nextInt();
        }

        System.out.println("array entered by you is: ");
        for (int i=1;i<=7;i++){

            System.out.print(num[i]); ///to print the array
            System.out.print(" ");

        }

        for(int i=1;i<=7;i++)
        {
            if((num[i]-num[i-1])==1) //checking number with previous num
            {
                System.out.println("\n "+i+" is consecutive with respect to "+(i+1));
            }
        }
    }

    public static void main(String[] args) {
        Consecutive c=new Consecutive(); //object of class Consecutive
        c.isConsecutive();
    }
}
