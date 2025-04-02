package maratona.intro;

import java.util.Scanner;

/**
 * Aula dois: Tipos primitivos
 */
public class Aula02 {
    public static void main(String[] args) {
        //Tipos primitivos: int, double, float, char, byte, short, long, boolean
        int age = 18;
        double wageDouble = 2000.0d;
        float wageFloat = 2500.0f;
        byte ageByte = 127;
        short ageShort = 32000;
        boolean legalAge;
        char caractere = 80;
        //String não é um tipo primitivo, é um tipo de referência
        String name = "Pedro";

        System.out.println("Sua idade é " + age + " anos.");
        if (age >= 18) {
            legalAge = true;
        }
        else {
            legalAge = false;
        }
        System.out.println("você é de maior? " + legalAge);
        System.out.println(caractere);
        System.out.println("Seu nome é " + name);
    }
}
