package maratona.javacore.Bintrometodos.test;

import maratona.javacore.Bintrometodos.domain.Calculator;

import java.util.Arrays;

public class CalcTest04 {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        int n1 = 1;
        int n2 = 2;

        calculator.changeTwoNumber(n1,n2);
        System.out.println(n1);
        System.out.println(n2);
    }
}
