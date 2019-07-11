/*Write a program to find out the multiple occurrences of the given word in a string using Matcher
methods.
Input : She sells seashells by the seashore
Given word: se
Output :
Found at: 4 - 6*/

package com.stackroute;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MultipleOccurrences
{
    String string,substring;
    Scanner scanner=new Scanner(System.in);
    public void findOcc()
    {
        System.out.println("Enter the string");
        string=scanner.nextLine().toLowerCase();
        System.out.println("Enter the string who's occurrence you want to find");
        substring=scanner.nextLine();

        Pattern pattern=Pattern.compile(substring); //returing compiled version of pattern
        Matcher matcher=pattern.matcher(string); //matching it with string

        int count=0;
        while(matcher.find())
        {
            count++; //counter increasing on every occurance
            System.out.print("its at ");
            System.out.print(matcher.start()+"-"+matcher.end());
        }
    }

    public static void main(String[] args) {
        MultipleOccurrences m=new MultipleOccurrences();
        m.findOcc();
    }
}