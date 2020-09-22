package com.company;


import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        int nombre;
        int k =1;
        int tentative = 10;
        int rdmax = 50;
        int limit = r.nextInt(rdmax);

        System.out.println("J'ai choisi un nombre entre 1 et " + rdmax);
        System.out.println("Vous avez " + tentative + "tentatives en tout");
	do
    {
        System.out.println("Tentative numero "+ k);
        System.out.println("Entrez le nombre : ");
        nombre = sc.nextInt();
        if(nombre > limit)
        {
            System.out.println("Nombre trop grand ");
        }
        if(nombre < limit)
        {
            System.out.println("Nombre trop petit ");
        }
        if(nombre == limit)
        {
            System.out.println("Bravo ");

        }

        if(k >= tentative && nombre != limit)
        {
            System.out.println("Desole, vous avez epuisé vos "+ tentative +" tentatives en vain");
            System.out.println(" Le nombre mystere etait : "+ limit);
        }
        k = k+1;
    } while (nombre != limit && k<= tentative);

    }
}
