package CalculatricePackage;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Calculatrice calc = new Calculatrice();

        System.out.println("--- Calculatrice ---");

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Entrez le premier nombre : ");
            double a = scanner.nextDouble();

            System.out.print("Entrez un operateur (+, -, *, /) : ");
            char operateur = scanner.next().charAt(0);

            System.out.print("Entrez le deuxieme nombre : ");
            double b = scanner.nextDouble();

            try {
                double resultat = calc.calculer(a, b, operateur);
                System.out.println("Resultat : " + resultat);
            } catch (ArithmeticException | IllegalArgumentException e) {
                System.out.println("Erreur : " + e.getMessage());
            }
        }
    }
}



