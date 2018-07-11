package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner lc = new Scanner(System.in);
        System.out.println("Veuillez choisir votre humeur : ");
        System.out.println("0 - Très Heureux/se");
        System.out.println("1 - Heureux/se");
        System.out.println("2 - Ok");
        System.out.println("3 - Triste");
        System.out.println("4 - Très Triste");
        int humeur = lc.nextInt();
        String[] humeurPossible = {"Très Heureux/se","Heureux/se","OK","Triste","Très Triste"};
        System.out.println("Vous avez choisi comme humeur : " + humeurPossible[humeur]);

    }
}
/** ceci est un test
/* j'ai fait une modif pour essayer
 */