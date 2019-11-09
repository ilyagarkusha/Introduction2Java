package com.sda.basic;

import java.util.ArrayList;
import java.util.Scanner;

public class lesson2 {
    public static void main(String[] args) {




// Do While
        int x;
        x = 51;

        while(x <=50){
            System.out.println("x = " + x);
            x= x-10;
        }

        do {
            System.out.println("The value of x (in do while) = " + x);
            x = x+10;
        }
        while (x <= 50);

// Scanner use

        String text = "";
        while(!text.equals("exit")) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter your birth age:");
            text = scanner.nextLine();
            if (!text.equals("exit")){
                int year = Integer.parseInt(text);

                System.out.println("You are " + (2019 - year) + " years old.");}
        }

        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 5; i++){
            numbers.add(i);
        }

        for(int i : numbers){
            System.out.println(i);
        }

        int[] array = new int[12];
        for (int i = 0; i < 12; i++){
            array[i] = i;
        }

        for(int i : array){
            System.out.print((i+1) + " ");
        }

        for (int y = 0; y < array.length; y++){
            for (int i = 0; i < y; i++){
                System.out.print(array[i] + " ");
            }
            System.out.println("");
        }


        // Task #4
        int[] q4 = {2,3,6,9,56,4,105,78};
        int sum = 0;

        for(int i = 0; i < q4.length; i++){
            sum += q4[i];
        }
        System.out.println("");
        System.out.println("Sum of array is: " +sum);

        // Task #5
        int max = q4[0];
        for (int i : q4){
            if(max < i){
                max = i;
            }
        }

        System.out.println("Array maximum is " + max);

        BubbleSorting.bubbleSort(q4);
        for (int i : q4){
            System.out.print(i + " ");
        }


    }
}
