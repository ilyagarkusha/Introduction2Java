package com.sda.homeworks.homework2;



import java.util.ArrayList;
import java.util.Scanner;

public class Product {

    private String name;
    private int price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Product(String name, int price) {
        this.name = name;
        this.price = price;


    }

    public void printProduct(){
        System.out.print(getName()+ ", ");
        System.out.println(getPrice() + "€");
    }

    public static void main(String[] args) {


        ArrayList<Product> products = new ArrayList<Product>();
        Scanner scanner = new Scanner(System.in);


        int index = 0;
        while (index <5){
            System.out.println("Insert product name:");
            String a = scanner.next();
            System.out.println("Insert product price:");
            int b = scanner.nextInt();
            products.add(new Product(a,b));

            index++;
        }

        System.out.println();
        System.out.println("Your shopping cart contain: ");
        for(int i = 0; i < products.size(); i++) {
            products.get(i).printProduct();
        }

        }

    }



