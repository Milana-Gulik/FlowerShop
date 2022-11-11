package by.itstep.gulik.controller;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args){
        ShopManager shopManager = new ShopManager();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to our Flower Shop");
        System.out.println("If you to want to buy default bouquet press - 1");

        int n = scanner.nextInt();
        if (n == 1){
            shopManager.Choose_def_bucket();
        }

    }
}
