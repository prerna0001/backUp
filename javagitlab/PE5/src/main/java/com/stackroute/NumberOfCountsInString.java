/*2. Write a program to find the number of counts in the following String. Store the output in
Map<String,Integer> as key value pair.
Input : String str = “one one -one___two,,three,one @three*one?two”;
Output : {"one":5 , "two":2, "three" :2}*/

package com.stackroute;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class NumberOfCountsInString {

    public void findOccurrenceOfChar()
    {
        String inputString="";
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter the String: ");
        inputString=scanner.nextLine().toLowerCase().trim(); //taking input converting it to lower case and then trimming white spaces
        List<String> list;

        list= Arrays.asList(inputString.split("[\\W_]+")); //splitting the string based on special characters and converting array to llist
        HashMap<String,Integer> stringCount=new HashMap<>();

        for (String s: list)
        {
            if(stringCount.containsKey(s))
            {
                stringCount.replace(s,stringCount.get(s)+1); //increasing string counter on every occurrence of list element
            }
            else
            {
                stringCount.put(s,1); //if element occur once put one for its counter
            }

        }
        System.out.println(stringCount);

    }

    public static void main(String[] args) {
        NumberOfCountsInString findOccurrence=new NumberOfCountsInString();
        findOccurrence.findOccurrenceOfChar();
    }
}
