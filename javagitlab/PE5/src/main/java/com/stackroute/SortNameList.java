/*6. Write a program to implement set interface which sorts the given randomly ordered names in
ascending order. Convert the sorted set in to an array list*/

package com.stackroute;

import java.util.Scanner;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortNameList {
    Scanner input=new Scanner(System.in);

    public void listSorting()
    {
        SortedSet<String> sortedSet=new TreeSet<>();
        for(int i=0;i<5;i++) {

            System.out.println("Enter name "+(i+1)); //taking input from user
            sortedSet.add(input.nextLine()); //adding input to sorted set
        }

        System.out.println(sortedSet);
    }

    public static void main(String[] args) {
        SortNameList sortList=new SortNameList();
        sortList.listSorting();
    }
}
