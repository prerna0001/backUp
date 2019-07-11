/*Write a program that will generate exceptions of type NegativeArraySizeException,
IndexOutOfBoundsException, NullPointerException. Record the catching of each exception by
displaying the message stored in the exception object.*/

package com.stackroute;
import java.util.Arrays;
import java.util.Scanner;

public class GenerateException {
    public void checkException()  {
        int size;
        int array[];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of Array");
        size= scanner.nextInt();
        try {                   //try block
            array = new int[size];
            System.out.println("Enter the numbers in array");
            for (int i=0;i<size;i++)    //scanning array values
            {
                array[i]=scanner.nextInt();
            }
            System.out.println(Arrays.toString(array));

            System.out.println("Enter the position of the array you want to access");
            int position=scanner.nextInt();

            if (position>size) //for indexoutofboundException
            {
                System.out.println("Inside if ");
                IndexOutOfBoundsException indexOutOfBoundsException=new IndexOutOfBoundsException();
                throw indexOutOfBoundsException;
            }
            else {
                System.out.println("Number in given position of array " + array[position]);
            }

            System.out.println("Initialising array to null and trying to compare it with a value");
            int arr[] = null;
            if (arr[0] == 3)
            {

            }
        }

        catch (NegativeArraySizeException e) //catch block for NegativeArraySizeException
        {

            System.out.println(e);
        }


        catch (IndexOutOfBoundsException e) //catch block of IndexOutOfBoundsException
        {
            System.out.println(e);
        }

        catch (NullPointerException e){ //catch block of NullPointerException
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        GenerateException generateException=new GenerateException();
        generateException.checkException();


    }
}





