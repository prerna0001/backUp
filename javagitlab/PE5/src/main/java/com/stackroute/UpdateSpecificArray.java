/*1. Write a Java program to update specific array element by given element and empty the array list.
Input: [Apple, Grape, Melon, Berry]
Output: [Kiwi, Grape, Mango, Berry]
Array list after removing all elements []*/

package com.stackroute;

import java.util.ArrayList;

public class UpdateSpecificArray {
    ArrayList<String> list=new ArrayList<>();
    public void updateMethod()
    {
        list.add("Apple");//adding to list
        list.add("Grape");
        list.add("Melon");
        list.add("Berry");

        System.out.println("List is: ");
        System.out.println(list);

        System.out.println("\n List after Updation: ");

        list.set(0,"Kiwi");//setting index 0 element
        list.set(2,"Mango");//setting index 2 element
        System.out.println(list);
        list.removeAll(list); //to remove elements


        System.out.println("\n After removing all elements: ");
        System.out.println(list);
    }

    public static void main(String[] args) {
        UpdateSpecificArray update=new UpdateSpecificArray();
        update.updateMethod();
    }

}
