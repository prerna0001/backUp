/*Create a class with a main( ) that throws an object of class Exception inside a try block.
a. Give the constructor for Exception a String argument.
b. Catch the exception inside a catch clause and print the String argument.
c. Add a finally clause and print a message to prove you were there.
*/
package com.stackroute;

import java.util.Scanner;


public class StringException {
    public void check(int a) throws InvalidNumberException
    {
        if (a<10) //checking a number < 10
        {
            InvalidNumberException invalid=new InvalidNumberException("Invalid number");
            throw invalid;
        }
        else{

            System.out.println("Valid Number");
        }
    }

    public static void main(String[] args) {
        StringException s=new StringException();
        int a;
        Scanner input=new Scanner(System.in);

        System.out.println("enter num you want to check ");
        a=input.nextInt();
        try //try block for InvalidNumberException
        {
                s.check(a);
        }
        catch (InvalidNumberException e) //catch block for InvalidNumberException
        {
            System.out.println(e.getMessage());
        }

        finally { //finally block
            System.out.println("In Finally Block");
        }

    }
}


