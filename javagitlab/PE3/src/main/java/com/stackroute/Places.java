/*Write a program to set up an array of places, Loop round and remove the vowels. Display the new
words in console
Input:
India
United States
Germany
Egypt
czechoslovakia
Output:
Place Name without Vowels:0 Ind
Place Name without Vowels:1 Untd Stts

Place Name without Vowels:2 Grmny
Place Name without Vowels:3 Egypt
Place Name without Vowels:4 czchslvk*/

package com.stackroute;

import java.util.Scanner;

public class Places
{
    public void remove()
    {
        String original, strNew;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a String : ");
        original = input.nextLine();

        strNew = original.replaceAll("[aeiouAEIOU]", ""); //replacing all vowles with null

        System.out.print("Place Name without Vowels :\n");

        System.out.print(strNew);
    }

    public static void main(String[] args)
    {
        Places p=new Places();
        p.remove();
    }
}
