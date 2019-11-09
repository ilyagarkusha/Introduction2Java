package com.foreign;

public class Swap {

    static void badSwap(int var1, int var2){
        int temp = var1;
        var1 = var2;
        var2 = temp;
    }

    public static void main(String[] args) {
        int a = 5;
        int b = 4;
        badSwap(a,b);
        System.out.println("a: " + a);
        System.out.println("b: " + b);

    }
}
