package com.sda.basic;

public class lesson3 {
    public static void main(String[] args) {

        /*int[] array = new int[10];

        for(int i = 0; i < array.length; i++){
            double x = Math.random() * 100;
            array[i] = (int)x;
}
        for(int i : array) System.out.print(i + ",");

        System.out.println("");
        String[] arrayString = {"Lasnamäe", "Mustamäe", "Kesklinn", "Pirita"};
        for(String i : arrayString) System.out.print(i + ", ");*/

        String[] myArray = {"one", "two", "three"};
        int[] numbers = {12,12,26,37,39,30,22645774};

        /*for(int i = 0; i < numbers.length; i++){
            if(firstDigit(numbers[i]) == 1) System.out.println(myArray[0] + "," + numbers[i]);
            else if(firstDigit(numbers[i]) == 2) System.out.println(myArray[1] + "," + numbers[i]);
            else if(firstDigit(numbers[i]) == 3) System.out.println(myArray[2] + "," + numbers[i]);
        }*/


        for(int i = 0; i < myArray.length; i++){
            for(int y = 0; y < numbers.length; y++){
                if (firstDigit(numbers[y]) == 1 && myArray[i] == myArray[0]) {
                    System.out.println(myArray[i] + "," + numbers[y]);
                }
                else if(firstDigit(numbers[y]) == 2 && myArray[i] == myArray[1]) {
                    System.out.println(myArray[i] + "," + numbers[y]);
                }
                else if(firstDigit(numbers[y]) == 3 && myArray[i] == myArray[2]) {
                    System.out.println(myArray[i] + "," + numbers[y]);
                }
            }
        }










    }
    public static int firstDigit(int n)
    {

        while (n >= 10)
            n /= 10;

        return n;
    }
}
