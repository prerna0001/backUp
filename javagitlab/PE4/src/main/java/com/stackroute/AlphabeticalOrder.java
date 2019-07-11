/*Write a program that sets up a String variable containing a paragraph of text of your choice.
a. Extract the words from the text and sort them into alphabetical order.
b. Display the sorted list.*/

package com.stackroute;

import java.util.Arrays;
import java.util.Scanner;

public class AlphabeticalOrder {
    String s1,s2,s3;
    char arr[];
    Scanner input=new Scanner(System.in);

    public void alphaOrder()
    {
        System.out.println("Enter a string paragraph ");
        s1= input.nextLine();
        s2= s1.replaceAll("\\s+",""); //replacing all spaces with null

        arr = s2.toCharArray(); //converting s2 to char array
        Arrays.sort(arr);

        s3= new String(arr); //converting char array to string
        System.out.println(arr);
    }

    public static void main(String[] args) {
        AlphabeticalOrder a=new AlphabeticalOrder();
        a.alphaOrder();
    }
}
