import java.util.Scanner;
/*Create a program that accepts a word as input and checks for each single character letter in
the word whether it is a consonant or vowel.
Condition:
a. Print an error message if the input is not a letter
b. If the input having more than one letter, print the required output
(Vowel or Consonant) for each letter*/

public class Q3ConsonentOrVowel
{
    public static void main (String[] args)
    {
        Scanner input = new Scanner(System.in);

        String str;
        System.out.println("Enter a Word: ");

        str = input.nextLine();

        for (int i = 0; i < str.length() ; i++)
        {
            char ch = str.charAt(i);

            if ((ch >= 'a') && (ch <= 'z') || (ch >= 'A') && (ch <= 'Z'))
            {

                if((ch == 'a') || (ch == 'e') || (ch == 'i')  ||  (ch == 'o')  || (ch == 'u') || (ch == 'A') || (ch == 'E') || (ch == 'I')  ||  (ch == 'O')  || (ch == 'U'))
                {
                    System.out.println(ch+" : it is a vowel");

                }

                else

                    System.out.println(ch+" : it is a Consonant");

            }

            else

                System.out.println("Error"+ch+ "it is not an alphabet");

        }

    }

}
