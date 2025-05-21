package CalculatricePackage;

public class Calculatrice {

    public double addition(double a, double b) {
        return a + b;
    }

    public double soustraction(double a, double b) {
        return a - b;
    }

    public double multiplication(double a, double b) {
        return a * b;
    }

    public double division(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Division par zero");
        }
        return a / b;
    }
    
    public double calculer(double a, double b, char operateur) {
        switch (operateur) {
            case '+': return addition(a, b);
            case '-': return soustraction(a, b);
            case '*': return multiplication(a, b);
            case '/': return division(a, b);
            default: throw new IllegalArgumentException("Operateur invalide: " + operateur);
        }
    }
}



