package com.sda.homeworks.homework4;



import java.util.Scanner;

public class Trainee {
    private String name;
    private int stamina;
    private int stgength;

    public Trainee(String name, int stamina, int strength) {
        this.name = name;
        if (stamina >=1) {
            this.stamina = stamina;
        }
        else  this.stamina = 1;

        if (strength >= 1) {
            this.stgength = strength;
        }
        else this.stgength = 1;

    }

    public void training(){
        Scanner scanner = new Scanner(System.in);
        while(stamina > 0){
            System.out.println("Now results: stamina :" + stamina + ", strength : " + stgength);
            System.out.println("Do you want do one more exercise(yes/no)");
            if (scanner.nextLine().equals("yes")){
                stamina--;
                stgength++;
            }
            else break;
            if (stamina ==1){
                System.out.println("Do you want use Supplement?(yes/no)");
                if (scanner.nextLine().equals("yes")){
                    Supplement supplement = new Supplement();
                    stamina += supplement.getSupplement();
                }
                else continue;
            }
        }
        System.out.println("Training result: stamina :" + stamina + ", strength : " + stgength + ", supplements used: " + Supplement.getQuantity());
    }
}
