import java.util.Scanner;
/*5. Write a program that reads an unspecified number of integer arguments using Scanner Class
and adds them together. The program should display total of the given input number and should
only consider integer value.The program should display an error message if there are any non
integer values
Input : 12 23 2 4
Output : 41*/

public class Q5IntegerSum
{
    public static void main(String[] args)
    {

        Scanner input = new Scanner(System.in);
        boolean flag = true;

        System.out.println("Enter some numbers specify last as 0");

        double number;
        int sum = 0;
        while ((number = input.nextDouble()) != 0)
        {
            if (number == (int) number)
            {
                sum = sum + (int)number;
            }

            else
            {
                System.out.println("Error "+number+ "it is not an integer");
                flag = false;
                break;
            }



        }

        if (flag == true)
        {
            System.out.println("The Sum is "+sum);
        }
    }
}
