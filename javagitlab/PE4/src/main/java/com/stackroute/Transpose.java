/*Write a program to transpose the given string.
Input String : a quick brown fox jumps over the lazy dog
Output String: a kciuq nworb xof spmuj revo eht yzal god*/

package com.stackroute;

import java.util.Scanner;

public class Transpose {
    public void reverse(String str)
    {
        String[] words = str.split(" "); //to split str
        String reversedString = "";

        for (int i = 0; i < words.length; i++)
        {
            String word = words[i];
            String reverseWord = "";
            for (int j = word.length()-1; j >= 0; j--) //reversing str
            {
                reverseWord = reverseWord + word.charAt(j);
            }
            reversedString = reversedString + reverseWord + " "; //adding space after each word
        }
        System.out.println(reversedString);
    }
    public static void main(String[] args)
    {
        Scanner str=new Scanner(System.in);
        System.out.println("Enter the string:");
        String inputString=str.nextLine();
        Transpose transposeString = new Transpose();
        transposeString.reverse(inputString);
    }
}