/*6. Write a program, which reads number of students and n grades as input (of int
between 0 and 100, inclusive) and displays the average, minimum and maximum.Your
program shall check for valid input. You should keep all the grades in an int[] and use a
method for each of the computations.
Output:
Enter the number of students: 4
Enter the grade for student 1: 86
Enter the grade for student 2: 65
Enter the grade for student 3: 98
Enter the grade for student 4: 77

The average is 81.50
The minimum is 65
The maximum is 98*/


import java.util.Arrays;
import java.util.Scanner;

public class Q6Grades {
    int numOfStudent;
    int grade[];
    int sum=0;
    float average;
    public void display()
    {
        System.out.println("enter number of students ");
        Scanner scanner= new Scanner(System.in);
        numOfStudent=scanner.nextInt();
        grade=new int[numOfStudent];
        for (int i=0; i<numOfStudent;i++)
        {
            int j=i+1;
            System.out.println("Enter grades for student "+j );
            grade[i]=scanner.nextInt();
        }
    }

    public void maxNumber()
    {
        Arrays.sort(grade);
        System.out.println("Max grade is "+grade[numOfStudent-1]);
    }

    public void minNumber()
    {
        Arrays.sort(grade);
        System.out.println("Max grade is "+grade[0]);
    }

    public void average()
    {
        for(int i=0; i<grade.length; i++)
        {
            sum=sum+grade[i];

        }
        average=sum/grade.length;
        System.out.println("average "+ average);
    }

    public static void main(String[] args)
    {
        Q6Grades result=new Q6Grades();
        result.display();
        result.maxNumber();
        result.minNumber();
        result.average();

    }
}
