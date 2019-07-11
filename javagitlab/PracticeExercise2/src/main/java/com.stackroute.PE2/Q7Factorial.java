/*Write a program to list all the factorials, that can be expressed as an int (i.e., 32-bit
signed integer). Your output shall look like:
Int Factorials:
The factorial of 1 is 1
The factorial of 2 is 2
..........
The factorial of 12 is 479001600
he factorial of 13 is out of range
Modify your program and add a method called longFactorial to list all the factorial that can
be expressed as a long (64-bit signed integer).The maximum value for long is kept in a
constant called Long.MAX_VALUE.
your output shall look like:
Long Factorials:
The factorial of 1 is is 1.
The factorial of 2 is is 2.
..........
The factorial of 20 is is 2432902008176640000.
The factorial of 21 is out of range.*/



public class Q7Factorial {
    public static class Facto {

        public static int fact() {
            int f=1;
            for (int i = 1; i < 14; i++) {

                f = f * i;


                System.out.println("factorial for " + i + " is " + f);
            }
            return 0;
        }
    }



    public static void main(String[] args)
    {
        Facto a=new Facto();
        a.fact();
    }
}