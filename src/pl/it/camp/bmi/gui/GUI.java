package pl.it.camp.bmi.gui;

import java.util.Scanner;

public class GUI {
    Scanner scanner = new Scanner(System.in);

    public String showMenu() {
        System.out.println();
        System.out.println("1. Oblicz BMI");
        System.out.println("2. Przypomnij BMI");
        System.out.println("3. Exit");

        return scanner.next();
    }

    public double readWeight() {
        System.out.println("Podaj masę ciała w [kg]: ");
        double weight = scanner.nextDouble();
        scanner.nextLine();
        return weight;
    }

    public double readHeight() {
        System.out.println("Podaj wzrost w [cm]: ");
        double height = scanner.nextDouble();
        scanner.nextLine();
        return height;
    }


    public int readBmiID() {
        System.out.println("Podaj identyfikator BMI: ");
        int bmiToSearch = scanner.nextInt();
        scanner.nextLine();
        return bmiToSearch;
    }
}
