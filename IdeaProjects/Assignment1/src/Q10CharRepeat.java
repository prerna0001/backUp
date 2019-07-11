import java.util.Scanner;

public class Q10CharRepeat
{
    public static void main ( String[] args_)
    {

        Scanner input = new Scanner(System.in);

        String str;
        String substr;
        int value;
        int stringlen;
        int valueRpt;

        System.out.println("Enter a String :");
        str = input.next();

        System.out.println("Enter a small number :");
        value = input.nextInt();


        stringlen = str.length();
        valueRpt = stringlen-value;
        substr = str.substring(valueRpt);
        System.out.print(str);

        for( int i = 0; i < value ; i++)
        {
            System.out.print(substr);
        }


    }
}

