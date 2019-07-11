import java.util.Scanner;
/*Write a program which accepts a number from user as input (set the limit say 1 - 50 or 1 -
100) User should guess until the the target number is guessed correctly.
Print separate messages for the following:
a. Number guessed is more than original number
b. Number guessed is less than original number
c. Number guessed matches the original number*/
public class Q8GuessNum
{
    public static void main ( String[] args)
    {
        Scanner input = new Scanner(System.in);

        int number = 25;
        int guess;

        while(true)
        {
            System.out.println("Guess number (Range 1-50)");
            guess = input.nextInt();

            if(guess == number)
            {
                System.out.println("It is right guess" +number+"is correct");
                break;
            }

            else if (guess < number)
            {
                System.out.println("Guessed Number is Less than original number");
            }

            else
                System.out.println("Guessed Number is greater than original number");

        }
    }
}
