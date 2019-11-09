package com.sda.basic;

public class Acronyms {
    public static void  Acronyms(String x){
        String[] word = x.split(" ");
        String acr = "";

        for (String i : word) {
            acr += i.charAt(0);
        }

        System.out.println(acr.toUpperCase());
    }
}
