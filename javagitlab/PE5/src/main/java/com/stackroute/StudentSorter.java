//for StudentInformation Class

package com.stackroute;

import java.util.Comparator;

public class StudentSorter implements Comparator<StudentInformation> {
    @Override
    public int compare(StudentInformation studentInfo1, StudentInformation studentInfo2)
    {
        // for comparison
        int nameCompare = studentInfo1.getName().compareTo(studentInfo2.getName());
        int ageCompare;
        int idCompare;

        if (studentInfo1.getAge() > studentInfo2.getAge()) { //for decreasing order according to age
            ageCompare = -1;
        } else if (studentInfo1.getAge() < studentInfo2.getAge()) {
            ageCompare = 1;
        } else {

            if (nameCompare != 0) { //if students have same age then  sorting according to name
                return nameCompare;
            }

            if (studentInfo1.getID() > studentInfo2.getID()) { //if student havre same name sama age then sorting according to their ids
                idCompare = 1;
            } else {
                idCompare = -1;
            }

            return idCompare;

        }
        return ageCompare;
    }
}
