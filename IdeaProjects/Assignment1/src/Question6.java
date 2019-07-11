import java.util.Scanner;

public class Question6     /*Write a program that takes a character from the user as input and determines whether the
                             character entered is a capital letter, a small case letter, a digit or a special symbol and display
                             appropriately.*/
{
    public static void main(String[] args)
    {
        char ch;
        Scanner input = new Scanner(System.in);
        System.out.println("enter a character");

        ch = input.findInLine(".").charAt(0);

        check(ch);
    }
    public static void check(char ch)
    {
        if (ch>=65 && ch<=90)
            System.out.println("Character is a capital letter");

        else if (ch>=97 && ch<=122)
            System.out.println("Character is a small letter");

        else if (ch>=48 && ch<=57)
            System.out.println("Character is a digit");

        else if ((ch>0 && ch<=47)||(ch>=58 && ch<=64)|| (ch>=91 && ch<=96)||(ch>=123 && ch<=127))
            System.out.println("Character is a special symbol");

    }
}
