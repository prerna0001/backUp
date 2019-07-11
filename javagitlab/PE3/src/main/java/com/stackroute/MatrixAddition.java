/*Write a program to compute the addition of two matrix, Read the number of rows and columns
as input, also the values of each matrix
Output:
Input number of rows of matrix: 3
Input number of columns of matrix: 2
Input elements of first matrix: 1 2 3 4 5 6
Input the elements of second matrix: 9 8 7 6 5 4
Sum of the matrices:-
10 10
10 10
10 10*/

package com.stackroute;

import java.util.Scanner;

public class MatrixAddition {
    int matrix1[][],matrix2[][],sum[][];
    int rows,cols;
    Scanner input=new Scanner(System.in);
    public void sum()
    {
        System.out.println("enter number of rows of matrix ");
        rows= input.nextInt();
        System.out.println("enter number of cols of matrix ");
        cols= input.nextInt();
        matrix1=new int[rows][cols];
        matrix2=new int[rows][cols];
        sum=new int[rows][cols];

        for(int i=0;i<rows;i++) //taking 1 matrix
        {
            for(int j=0;j<cols;j++)
            {
                System.out.println("enter the values of first matrix [" +i+"]["+j+"]" );
                matrix1[i][j]=input.nextInt();

            }
        }

        for(int i=0;i<rows;i++) //taking 2 matrix
        {
            for(int j=0;j<cols;j++)
            {
                System.out.println("\n enter the values of second matrix [" +i+"]["+j+"]" );
                matrix2[i][j]=input.nextInt();

            }
        }
        System.out.println("Matrix 1 is : "); //to print matrix 1
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<cols;j++)
            {
                System.out.println( matrix1[i][j]);

            }
        }

        System.out.println("Matrix 2 is : ");  //to print matrix 1
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<cols;j++)
            {
                System.out.println( matrix2[i][j]);

            }
        }
        System.out.println("Sum is : "); //for sum

        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<cols;j++)
            {
                sum[i][j]=matrix1[i][j]+matrix2[i][j];
                System.out.print(" "+sum[i][j]);

            }
            System.out.println(" ");
        }
    }

    public static void main(String[] args) {
        MatrixAddition m=new MatrixAddition();
        m.sum();
    }


}
