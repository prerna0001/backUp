import java.util.Scanner;

public class Q7sortNonIncreasing
    /*Write a program which accepts a number as input from user and perform the following:
a. sort the number in non-increasing order
b. after sorting sum all the even numbers, the sum should be greater than 15 .
c. if sum is more than 15,then print output as true or false.
Input : 234534
Output : Sorted number in non-increasing order : 544332

Sum of even numbers : 10
False*/

{
    public static void main(String[] args)
    {

        Scanner input = new Scanner(System.in);

        int number;

        System.out.println("Enter a large number :");
        number = input.nextInt();

        int len = Integer.toString(number).length();
        int[] numArray = new int[len];
        int k=0;
        int len1;
        int sum = 0;

        len1 = len;

        while(len>0)
        {
            numArray[k] = number % 10;
            number = number / 10;

            if ((numArray[k] % 2) == 0)
            {
                sum = sum + numArray[k];
            }
            k++;
            len--;
        }

        len = len1;

        int temp1;
        for (int i = 1; i < len; i++)
        {
            for (int j = i; j > 0; j--)
            {
                if (numArray[j] > numArray[j - 1])
                {
                    temp1 = numArray[j];
                    numArray[j] = numArray[j - 1];
                    numArray[j - 1] = temp1;
                }
            }
        }

        k=0;

        System.out.print("Sorted number in non-increasing order: ");

        while(len>0)
        {
            System.out.print(numArray[k]);
            len--;
            k++;
        }

        System.out.println(" Sum is "+sum);
        if(sum > 15) {
            System.out.println("True its more than 15");
        }
        else
        {
            System.out.println("False its more than 15");
        }
    }
}
