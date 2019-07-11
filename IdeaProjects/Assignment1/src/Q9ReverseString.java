import java.util.Scanner;
/*Write a program to reverse any string without using String Buffer.
Input : london
Output : nodnol*/

public class Q9ReverseString
{
    public static void main (String[] args)
    {

        Scanner input = new Scanner(System.in);
        String str;
        String rev= "";
        System.out.println("Enter String");
        str = input.nextLine();

        for (int i = str.length()-1; i >= 0; i-- )
        {
            rev = rev + str.charAt(i);

        }

        System.out.println("The Reversed string is "+rev);

    }
}
