package com.example;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        int quota = 10;

        Scanner clavier = new Scanner(System.in);
        System.out.print("Entrez vos nombres de ventes:");

        int ventesCommercial = clavier.nextInt();

        int manque = 10 - ventesCommercial;

        if (ventesCommercial < 10) {

            System.out.print("Il vous manque: " + manque + " vente(s)");

        }

        else {

            System.out.print("Bravo !");

        }

    }

}
