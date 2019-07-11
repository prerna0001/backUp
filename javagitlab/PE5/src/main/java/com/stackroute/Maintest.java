//for StudentInformation Class

package com.stackroute;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Maintest {
    public static void main(String[] args)
    {
        ArrayList<StudentInformation> studentList = new ArrayList<>(); //ArrayList of type StudentInformation
        studentList.add(new StudentInformation(1,23,"Pikku")); //input
        studentList.add(new StudentInformation(2,23,"Akansha"));
        studentList.add(new StudentInformation(3,25,"Ankur"));
        studentList.add(new StudentInformation(4,25,"ashu"));
        studentList.add(new StudentInformation(5,27,"basu"));
        System.out.println("List before Sorting Object");
        Iterator iterator=studentList.iterator();
        while (iterator.hasNext()) //will loop till list has another token in its input
        {
            System.out.println(iterator.next()); //return next element in iterator
        }

        Collections.sort(studentList,new StudentSorter());

        System.out.println("List After Sorting Objects");
        Iterator iterator1=studentList.iterator();
        while (iterator1.hasNext())
        {
            System.out.println(iterator1.next()); //to print sorted list
        }
    }
}

