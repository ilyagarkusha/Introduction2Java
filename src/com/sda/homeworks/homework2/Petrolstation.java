package com.sda.homeworks.homework2;

import java.util.ArrayList;
import java.util.Scanner;

public class Petrolstation {
    private double volume = 10;
    private double price = 1.315;
    double volumeSum = 0;
    double priceSum = 0;


    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void addPetrol(){
        volumeSum += getVolume();
        priceSum += getPrice() * getVolume();

    }

    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        Scanner scanner = new Scanner(System.in);
        Petrolstation petrolstation = new Petrolstation();



        while(true){
            System.out.println("Please write 'continue' for refueling or 'finish' for stop and pay");
            String message = scanner.nextLine();
            if (message.equals("finish")) {
                break;
            }
            if (message.equals("continue")){
                petrolstation.addPetrol();
                System.out.println("Now you have " + petrolstation.volumeSum + "l" + ", price:  " + String.format("%.2f",petrolstation.priceSum) + "€");
            }
        }
        double payCash = 0;
        double restPay = petrolstation.priceSum - payCash;
        while(petrolstation.priceSum != payCash){
            if (payCash < petrolstation.priceSum){
            System.out.println("Please pay for fuel. Now need pay: " + String.format("%.2f",restPay) + "€");
            }
            double cashIn = scanner.nextDouble();
            payCash += cashIn;
            restPay = petrolstation.priceSum - payCash;
            if (payCash > petrolstation.priceSum){
                System.out.println("You gave too much money. Please take you rest:  " + String.format("%.2f",Math.abs(restPay)) + "€");
                break;
            }

        }

        System.out.println("Thank you for purchase!");
    }
}
