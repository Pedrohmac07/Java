package maratona.javacore.Bintrometodos.test;

import maratona.javacore.Bintrometodos.domain.Calculator;

public class CalcTest03 {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        int result = (int) calculator.divideTwoNumbers(10,0);
        System.out.println(result);
    }
}
