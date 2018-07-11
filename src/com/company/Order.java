package com.company;

import java.util.Scanner;

public class Order {
    Scanner lc = new Scanner(System.in);
    String resume = "";

    public void moodChoice() {
        System.out.println("Veuillez choisir votre humeur : ");
        System.out.println("0 - Très Heureux/se");
        System.out.println("1 - Heureux/se");
        System.out.println("2 - Ok");
        System.out.println("3 - Triste");
        System.out.println("4 - Très Triste");
        int humeur = lc.nextInt();
        String[] humeurPossible = {"Très Heureux/se", "Heureux/se", "OK", "Triste", "Très Triste"};
        System.out.println("Vous avez choisi comme humeur : " + humeurPossible[humeur]);
        resume += humeurPossible[humeur] + " ";
    }

    public void whichDay() {
        System.out.println("Veuillez choisir le jour : ");
        System.out.println("1 - Lundi");
        System.out.println("2 - Mardi");
        System.out.println("3 - Mercredi");
        System.out.println("4 - Jeudi");
        System.out.println("5 - Vendredi");
        System.out.println("6 - Samedi");
        System.out.println("7 - Dimanche");
        int jour = lc.nextInt();
        String[] jourPossible = {"Lundi", "Mardi", "Mercredi", "Jeudi", "Vendredi", "Samedi", "Dimanche"};
        System.out.println("Nous sommes le : " + jourPossible[(jour - 1)]);
        resume += jourPossible[(jour - 1)] + " ";

    }
    public void runDaySMood() {
        whichDay();
        moodChoice();
        System.out.println("");
        System.out.println(String.format(resume));
    }
}