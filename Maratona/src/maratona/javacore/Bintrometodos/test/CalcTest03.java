package maratona.javacore.Bintrometodos.test;

import maratona.javacore.Bintrometodos.domain.Calculator;

public class CalcTest03 {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        double result = calculator.divideTwoNumbers(10,2);
        System.out.println(result);
    }
}
