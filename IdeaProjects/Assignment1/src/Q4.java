import java.util.Scanner;

public class Q4              /*Write a program using a loop to print the following output. 1 2 2 3 3 3 4 4 4 4 5 5 5 5 5 6 6 6 6
                              6 6 . . . nth iteration.
                              Input: 5
                               Output : 1 2 2 3 3 3 4 4 4 4 5 5 5 5 5 */
{
    public static void main(String[] args) {
        int a;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        a = input.nextInt();
        print(a);
    }
    public static void print(int a)    /*print method to print pattern*/
    {
        int i=1, j=1;
        for(i=1;i<=a;i++)
        {
            for (j=1;j<=i;j++)
            System.out.printf("%d",i);
        }
    }
}
