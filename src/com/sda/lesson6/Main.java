package com.sda.lesson6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Trainee trainee = new Trainee("Sam", 50, 3);
        Trainer trainer = new Trainer("Jack");
        Supplement proteinBar = new Supplement("chokoPro", 30);
        Supplement gainer = new Supplement("G4Muscle", 70);
        System.out.println("Hello " + trainee.getName());

        Exercise squat = new Exercise("squat", 40, 4);
        Exercise jumping = new Exercise("jumping", 10, 1);
        Exercise pushUp = new Exercise("pushUp", 30, 3);
        Exercise pullUp = new Exercise("pullUp", 35, 2);

        while (true) {

            System.out.println("Choose the exercise type or supplement:\n");
            System.out.println("1. Squat (s)\n"
                    + "2. Jumping (j)\n"
                    + "3. Push-up (ps)\n"
                    + "4. Pull-up (pl)\n"
                    + "5. chokoPro\n"
                    + "6. G4Muscle\n");
            Scanner scanner = new Scanner(System.in);
            Integer userInput = scanner.nextInt();
            switch (userInput) {
                case 1:
                    int newStrength = squat.increaseStrength(trainee.getStrength());
                    trainee.setStrength(newStrength);

                    int newStamina = squat.deceraseStamina(trainee.getStamina());
                    trainee.setStamina(newStamina);
                    System.out.println(trainee.toString());
                    break;
                case 2:
                    newStrength = jumping.increaseStrength(trainee.getStrength());
                    trainee.setStrength(newStrength);

                    newStamina = jumping.deceraseStamina(trainee.getStamina());
                    trainee.setStamina(newStamina);
                    System.out.println(trainee.toString());
                    break;
                case 3:
                    newStrength = pushUp.increaseStrength(trainee.getStrength());
                    trainee.setStrength(newStrength);

                    newStamina = pushUp.deceraseStamina(trainee.getStamina());
                    trainee.setStamina(newStamina);
                    System.out.println(trainee.toString());
                    break;
                case 4:
                    newStrength = pullUp.increaseStrength(trainee.getStrength());
                    trainee.setStrength(newStrength);

                    newStamina = pullUp.deceraseStamina(trainee.getStamina());
                    trainee.setStamina(newStamina);
                    System.out.println(trainee.toString());
                    break;
                case 5:
                    newStamina = proteinBar.recover(trainee.getStamina());
                    trainee.setStamina(newStamina);
                    trainee.setStamina(newStamina);
                    break;
                case 6:
                    newStamina = gainer.recover(trainee.getStamina());
                    trainee.setStamina(newStamina);
                    trainee.setStamina(newStamina);
                default:
                    System.out.println("The input is incorrect. Choose the right exercise:\n");
            }
        }
    }
}
