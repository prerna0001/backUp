/*Write a program to replace all d with f and all l with t in the given String
Input: daily dry
Output: faity fry
Original string: daily dry
New String: faity fry*/

package com.stackroute;

import java.util.Scanner;

public class Replace
{
    String string1="";
    Scanner scanner=new Scanner(System.in);
    public void replaceChar()
    {
        System.out.println("Enter String");
        string1=scanner.nextLine();

        String string2=string1.replaceAll("d","f"); //replacing all d with f
        String finalString=string2.replaceAll("l","t"); //replacing all l with t

        System.out.println("The String After Replacement is:\n "+finalString);
    }

    public static void main(String[] args) {
        Replace r=new Replace();
        r.replaceChar();
    }
}