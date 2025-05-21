package CalculatricePackage;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatriceJavaTest {

    Calculatrice calc = new Calculatrice();

    @Test
    public void testAddition() {
        assertEquals(1, calc.addition(-2, 3));
        assertEquals(5, calc.addition(2, 3));
        assertEquals(-5, calc.addition(-2, -3));
        assertEquals(2, calc.addition(2, 0));
        assertEquals(6.1, calc.addition(2.7, 3.4), 0.0001);
        assertEquals(-0.6, calc.addition(2.2, -2.8), 0.0001);
        assertNotEquals(6, calc.addition(2, 3));
    }

    @Test
    public void testSoustraction() {
        assertEquals(-5, calc.soustraction(-2, 3));
        assertEquals(-1, calc.soustraction(2, 3));
        assertEquals(1, calc.soustraction(-2, -3));
        assertEquals(2, calc.soustraction(2, 0));
        assertEquals(-0.7, calc.soustraction(2.7, 3.4), 0.0001);
        assertEquals(5.0, calc.soustraction(2.2, -2.8), 0.0001);
        assertNotEquals(0, calc.soustraction(2, 3));
    }


    @Test
    public void testMultiplication() {
        assertEquals(-6, calc.multiplication(-2, 3));
        assertEquals(6, calc.multiplication(2, 3));
        assertEquals(6, calc.multiplication(-2, -3));
        assertEquals(0, calc.multiplication(2, 0));
        assertEquals(9.18, calc.multiplication(2.7, 3.4), 0.0001);
        assertEquals(-6.16, calc.multiplication(2.2, -2.8), 0.0001);
        assertNotEquals(5, calc.multiplication(2, 3));
    }


    @Test
    public void testDivision() {
        assertEquals(-0.6667, calc.division(-2, 3), 0.0001);
        assertEquals(0.6667, calc.division(2, 3), 0.0001);
        assertEquals(0.6667, calc.division(-2, -3), 0.0001);
        assertEquals(2, calc.division(2, 1), 0.0001);
        assertEquals(0.7941, calc.division(2.7, 3.4), 0.0001);
        assertEquals(-0.7857, calc.division(2.2, -2.8), 0.0001);
        assertNotEquals(1, calc.division(2, 3), 0.0001);
    }

    @Test
    public void testDivisionParZero() {
        assertThrows(ArithmeticException.class, () -> calc.division(5, 0));
    }

    
    @Test
    public void testOperateurInvalide() {
        assertThrows(IllegalArgumentException.class, () -> calc.calculer(6, 3, '%'));
    }
}

