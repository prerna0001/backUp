/*Write a program with the implementation of Regular Expression to find the presence of the name*/

package com.stackroute;

import java.util.Scanner;

public class PresenseOfString
{
    String s;
    Scanner scanner=new Scanner(System.in);

    public void searchString()
    {
        System.out.println("Enter a string");
        s=scanner.nextLine();

        System.out.println("Enter string you want to search");
        String s1=scanner.nextLine();

        if(s.contains(s1)) //checking if its present in string
        {
            System.out.println("String is present");
        }
        else
            System.out.println("String is not present");
    }

    public static void main(String[] args) {


        PresenseOfString p = new PresenseOfString();
        p.searchString();

    }
}