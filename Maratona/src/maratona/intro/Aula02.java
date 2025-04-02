package maratona.intro;

import java.util.Scanner;

/**
 * Aula dois: Tipos primitivos
 */
public class Aula02 {
    public static void main(String[] args) {
        //Tipos primitivos: int, double, float, char, byte, short, long, boolean
        int age = 18;
        double wageDouble = 2000;
        float wageFloat = 2500;
        byte ageByte = 18;
        short ageShort = 18;
        boolean legalAge;
        char caractere= 80;

        System.out.println("Sua idade é " + age + " anos.");
        if (age >= 18) {
            legalAge = true;
        }
        else {
            legalAge = false;
        }
        System.out.println("você é de maior? " + legalAge);
        System.out.println(caractere);
    }
}
