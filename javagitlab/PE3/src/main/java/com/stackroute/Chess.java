/* Write a program to create a ChessBoard pattern with the help of multidimensional array, where
WWrepresents white color and BB represents Black color.
Output:
My Chess Board
WW|BB|WW|BB|WW|BB|WW|BB|
BB|WW|BB|WW|BB|WW|BB|WW|
WW|BB|WW|BB|WW|BB|WW|BB|
BB|WW|BB|WW|BB|WW|BB|WW|
WW|BB|WW|BB|WW|BB|WW|BB|
BB|WW|BB|WW|BB|WW|BB|WW|
WW|BB|WW|BB|WW|BB|WW|BB|
BB|WW|BB|WW|BB|WW|BB|WW|*/

package com.stackroute;

public class Chess {
    int chess[][];

    public void chessBoard()
    {
        chess=new int[7][7];
        for(int i=0;i<=7;i++)
        {
            for (int j=0;j<=7;j++)
            {
                if((i+j)%2==0) //for alternate positions
                {
                    System.out.print("WW |");
                }
                else {
                    System.out.print("BB |");
                }
            }
            System.out.println(""); //for new line
        }

    }

    public static void main(String[] args) {
        Chess c=new Chess(); //object created of class Chess
        c.chessBoard();
    }
}
