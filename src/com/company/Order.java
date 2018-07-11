package com.company;

import java.util.Scanner;

public class Order {
    Scanner lc = new Scanner(System.in);
    String resume = "";

    public void moodChoice() {
        System.out.println("Veuillez choisir votre humeur : ");
        System.out.println("1 - Très Heureux/se");
        System.out.println("2 - Heureux/se");
        System.out.println("3 - Ok");
        System.out.println("4 - Triste");
        System.out.println("5 - Très Triste");
        int humeur = lc.nextInt();
        String[] humeurPossible = {"Très Heureux/se", "Heureux/se", "Ok", "Triste", "Très Triste"};
        System.out.println("Vous avez choisi comme humeur : " + humeurPossible[(humeur-1)]);
        resume += humeurPossible[(humeur-1)];
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
        System.out.println("Nous sommes le " + jourPossible[(jour - 1)]);
        resume += jourPossible[(jour - 1)] + " : ";
    }

    public void addMood() {
        int humeurSupplementaire = 0;
        do {
            System.out.println("voulez-vous ajouter une autre humeur ?");
            System.out.println("1 - Oui");
            System.out.println("2 - Non");
            humeurSupplementaire = lc.nextInt();
            switch (humeurSupplementaire) {
                case 1:
                    resume += ", ";
                    moodChoice();
                    break;
                case 2:
                    System.out.println("Vous ne souhaitez pas ajouter d'humeur aujourd'hui.");
                    break;
                default:
                    System.out.println("Vous n'avez pas choisi parmi les options proposées.");
            }
            System.out.println("");
            System.out.println(String.format(resume));
        }while (humeurSupplementaire != 2);
    }


    public void init(){
        whichDay();
        moodChoice();
        addMood();
    }
}