package com.sda.homeworks.homework2;


// Numbers pyramid

public class h2q1 {
    public static void main(String[] args) {


        int rows = 8;
        int rowCount = 1;

        System.out.println("");


        for (int i = rows; i > 0; i--)
        {
            //Printing spaces at the beginning of each row
            for (int j = 1; j <= i*5; j++)
            {
                System.out.print(" ");
            }

            //Printing left side

            for (int j = 0; j <= rowCount-1; j++)
            {
                System.out.printf("% 5d", (int)Math.pow(3, j));
            }

            //Printing right side

            for (int j = rowCount-1; j >= 1; j--)
            {
                System.out.printf("% 5d", (int)Math.pow(3, j-1));
            }

            System.out.println();

            //Incrementing the rowCount

            rowCount++;

        }





    }
}
