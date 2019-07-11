/*3. Write a program where an array of strings is input and output is a Map<String,boolean> where
each different string is a key and its value is true if that string appears 2 or more times in the array
Input : String arr[] = {“a”,”b”,”c”,”d”,”a”,”c”,”c”}
Output - {“a” : true,”b” :false ,”c” :true,”d” : false}*/

package com.stackroute;

import java.util.HashMap;
import java.util.Scanner;

public class MapStringBoolean {
    public void mapStringBoolean()
    {
        String inputString ;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the String");
        inputString = scanner.nextLine().toLowerCase().trim(); //converting string to lower case and triming it

        HashMap<Character,Boolean> stringCount=new HashMap<>();

        inputString.split("[\\s_]+");//spliting the string based on all white spaces
        char[] strArray=inputString.toCharArray();

        for (Character s:strArray)
        {
            if(stringCount.containsKey(s))
            {
                stringCount.put(s,true); //if string appears 2 or more times then put true
            }
            else
            {
                stringCount.put(s,false); //if string do not appears 2 or more times then put false
            }

        }
        System.out.println(stringCount);

    }

    public static void main(String[] args) {
        MapStringBoolean mapString=new MapStringBoolean();
        mapString.mapStringBoolean();
    }
}

