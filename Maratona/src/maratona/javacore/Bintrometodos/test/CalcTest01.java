package maratona.javacore.Bintrometodos.test;

import maratona.javacore.Bintrometodos.domain.Calculator;

public class CalcTest01 {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.sumTwoNumbers();
        calculator.subtractTwoNumbers();
        System.out.println("Finalizando programa...");
    }
}
